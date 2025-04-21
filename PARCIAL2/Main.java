
import Parcial2.Parcial;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sala de Sistemas
 * 
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] array = new double[10];
        double[][] matriz = new double[4][4];
        boolean arrayIngresado = false;
        boolean matrizIngresada = false;
        int opcion;
        System.out.println("\nLOS INTEGRANTES DEL PARCIAL C2 SON: FRANCISCO RAMOS ESQUIVEL Y IVAN DAVID CASTRO JIMENEZ ");
        do {
            System.out.println("\nMENU PRINCIPAL: \n 1. Calcular Area Circulo: \n 2. Ingresar Datos Array:  \n 3. Listar Datos Array: \n 4. Listar Datos Array en especifico: \n 5.  Ingresar Datos Matriz: \n 6. Listar Datos de la matriz: \n7. Listar Datos en especifico \n 8.SALIR....");
            System.out.print("ELIJA UNA OPCION: ");
          
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> Parcial.calcularAreaCirculo(leer);
                case 2 -> {
                    Parcial.ingresarDatosArray(leer, array);
                    arrayIngresado = true;
                }
                case 3 -> {
                    if (arrayIngresado)
                        Parcial.listarArray(array);
                    else
                        System.out.println("INGRESE SUS DATOS PARA CONTINUAR");
                }
                case 4 -> {
                    if (arrayIngresado)
                        Parcial.listarDatoArrayEspecifico(leer, array);
                    else
                        System.out.println("INGRESE SUS DATOS PARA CONTINUAR");
                }
                case 5 -> {
                    Parcial.ingresarDatosMatriz(leer, matriz);
                    matrizIngresada = true;
                }
                case 6 -> {
                    if (matrizIngresada)
                        Parcial.listarMatriz(matriz);
                    else
                        System.out.println("INGRESE SUS DATOS PARA CONTINUAR");
                }
                case 7 -> {
                    if (matrizIngresada)
                        Parcial.listarDatoMatrizEspecifico(leer, matriz);
                    else
                        System.out.println("INGRESE SUS DATOS PARA CONTINUAR");
                }
                case 8 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion no valida.");
            }

        } while (opcion != 8);

    }
}