/*Actividad 4
 * Crear una matriz y llenarla con valores de prueba.
 * Imprimir los valores de la matriz en las dos diagonales.
Busqueda:
https://www.tutorialspoint.com/how-to-check-if-the-matrix-is-diagonal-matrix-in-java
https://es.stackoverflow.com/questions/407618/c%C3%B3mo-puedo-recorrer-una-matriz-de-forma-diagonal-en-java
https://stackoverflow.com/questions/67518965/how-to-print-all-the-diagonals-of-a-matrix-in-java
En el que me apolle:
https://masqueprogramar.wordpress.com/2018/05/03/diagonal-principal-secundaria-matriz-java/ 
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
       
       //datos cargados manual 
        System.out.println("Esta es tu matriz: ");
        int [][] matriz = { 
        {10,  20,  30,  40},
        {50,  60,  70,  80},
        {90, 100, 110, 120},
        {130,140, 150, 160},
       
    };
        // Muestra la matriz
        visualizarMatriz(matriz);

        // Crear arrays para diagonales
        int[] diagoPrincipal = new int[matriz.length];
        int[] diagoSecundaria = new int[matriz.length];

        // Buscar y extraer diagonales
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    diagoPrincipal[i] = matriz[i][j];
                }
                if (i + j == matriz.length - 1) {
                    diagoSecundaria[i] = matriz[i][j];
                }
            }
        }

        // Mostra las diagonales
        System.out.println("\nDiagonal Principal:");
        visualizarArray(diagoPrincipal);

        System.out.println("\nDiagonal Secundaria:");
        visualizarArray(diagoSecundaria);
    }

    static void visualizarMatriz(int[][] pMatriz) {
        for (int i = 0; i < pMatriz.length; i++) {
            for (int j = 0; j < pMatriz[i].length; j++) {
                System.out.print("\t" + pMatriz[i][j]);
            }
            System.out.println();
        }
    }

    static void visualizarArray(int[] pArray) {
        for (int i = 0; i < pArray.length; i++) {
            System.out.print("\t" + pArray[i]);
        }
        System.out.println();
    }
}


