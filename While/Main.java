/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclos;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Main {
    public static void main(String[] args) {
        boolean ciclos = true;

        double nota1 = 0, nota2 = 0, nota3 = 0, notaFinal = 0;
        try (Scanner leer = new Scanner(System.in)) {
            while (ciclos) {
              
                System.out.println("\nMENU PRINCIPAL: \n 1. DIGITA NOTA1: \n 2. DIGITA NOTA2:  \n 3. DIGITA NOTA3: \n 4. CALCULA NOTA FINAL: \n 5. SALIR:");
                System.out.print("\nELIJA UNA OPCION: ");
                
                int opcion = leer.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("\nDIGITA Nota 1: ");
                        nota1 = leer.nextDouble();
                    }
                    case 2 -> {
                        System.out.print("\nDIGITA Nota 2: ");
                        nota2 = leer.nextDouble();
                    }
                    case 3 -> {
                        System.out.print("\nDIGITA Nota 3: ");
                        nota3 = leer.nextDouble();
                    }
                    case 4 -> {
                        notaFinal = (nota1 + nota2 + nota3)/3;
                        System.out.println("\nSu nota final es: " + notaFinal);
                    }
                    case 5 -> {
                        System.out.println("SALIR");
                        ciclos = false;
                    }
                }
            }
        }
    }
}
