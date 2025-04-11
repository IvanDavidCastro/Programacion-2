/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package While;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        while (true) {
            System.out.println("MENU PRINCIPAL: \n 1. AGREGAR NOMBRE: \n 2. ELIMINAR NOMBRE:  \n 3. ACTUALIZAR NOMBRE: \n 4. MOSTRAR NOMBRE: \n 5. SALIR:");
            System.out.print("ELIJA UNA OPCION: ");

            if (leer.hasNextInt()) {
                opcion = leer.nextInt();
                leer.nextLine();
            } else {
                System.out.println("Entrada inválida. Intente con un número.");
                leer.next(); 
                continue;
                
            }
                
               switch (opcion) {
                case 1:
                System.out.print("\nSu Nombre es: ");
                    String nombre = leer.nextLine();
                    nombres.add(nombre);
                    System.out.println("\nNombre agregado.");
                    break;

                case 2:
                    System.out.print("\nEl nombre a eliminar es: ");
                    String nombreDelete = leer.nextLine();
                    if (nombres.contains(nombreDelete)) {
                        nombres.remove(nombreDelete);
                        System.out.println("\nNombre eliminado.");
                    } else {
                        System.out.println("Nombre no encontrado");
                    }
                    break;

                case 3:
                    System.out.print("\nActualizar nombre: ");
                    String nombreAnterior = leer.nextLine();

                    if (nombres.contains(nombreAnterior)) {
                        System.out.print("\nIngrese el nuevo nombre: ");
                        String nombreActualizado = leer.nextLine();
                        int index = nombres.indexOf(nombreAnterior);
                        nombres.set(index, nombreActualizado);
                        System.out.println("\nNombre actualizado.");
                    } else {
                        System.out.println("Nombre no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\nLista de Nombres");
                    if (nombres.isEmpty()) {
                        System.out.println("REGISTRO VASIO");
                    } else {
                        for (int i = 0; i < nombres.size(); i++) {
                            System.out.println((i + 1) + ", " + nombres.get(i));
                        }
                    }
                    break;

                case 5:
                    System.out.println("SALIR");
                    leer.close();
                    return;
            }
        }
    }
}

