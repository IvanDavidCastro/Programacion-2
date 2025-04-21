/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parcial2;

import java.util.Scanner;

/**
 *\n
 * @author Sala de Sistemas
 */
public class Parcial {
             
        public static void calcularAreaCirculo(Scanner leer) {
        System.out.print("Ingrese el radio del circulo: ");
        double radio = leer.nextDouble();
        double area = Math.PI * Math.pow(radio, 5);
        System.out.println("El area del circulo es: " + area);
    }

    public static void ingresarDatosArray(Scanner leer, double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese valor para la posición [" + i + "]: ");
            array[i] = leer.nextDouble();
        }
    }

    public static void listarArray(double[] array) {
        System.out.println("Datos del Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion [" + i + "]: " + array[i]);
        }
    }

    public static void listarDatoArrayEspecifico(Scanner leer, double[] array) {
        System.out.print("Ingrese la posiciOn que desea ver (0-9): ");
        int pos = leer.nextInt();
        if (pos >= 0 && pos < array.length) {
            System.out.println("Valor en la posicion [" + pos + "]: " + array[pos]);
        } else {
            System.out.println("Posicion fuera de rango.");
        }
    }

    public static void ingresarDatosMatriz(Scanner leer, double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese valor para la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextDouble();
            }
        }
    }

    public static void listarMatriz(double[][] matriz) {
        System.out.println("Datos de la Matriz:");
            for (double[] matriz1 : matriz) {
                for (int j = 0; j < matriz1.length; j++) {
                    System.out.print(matriz1[j] + "\t");
                }
                System.out.println();
            }
    }

    public static void listarDatoMatrizEspecifico(Scanner leer, double[][] matriz) {
        System.out.print("Ingrese la fila (0-3): ");
        int fila = leer.nextInt();
        System.out.print("Ingrese la columna (0-3): ");
        int columna = leer.nextInt();
        if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[0].length) {
            System.out.println("Valor DE la posicion [" + fila + "][" + columna + "]: " + matriz[fila][columna]);
        } else {
            System.out.println("posicion fuera de rango.");
        }
    }
}
