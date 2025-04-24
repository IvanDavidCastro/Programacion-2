/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaFor;

import java.util.ArrayList;



/**
 *
 * @author ivan
 */
public class Main {
    
    public static void main(String[] args) {
       ArrayList<Integer> lst = new ArrayList<>();
        
        lst.add(200);
        lst.add(300);
        lst.add(400);
        lst.add(500);

        
        System.out.println("LOS VALORES SON:");
        
        for (int i = 0; i < lst.size(); i++) {
            System.out.println("Valor: " + lst.get(i));
        }
        if (!lst.isEmpty()) {
            lst.remove(0); 
        }
        System.out.println("\nValores despues de borrar:");
        for (int num : lst) {
            System.out.println("Valor: " + num);
        }
    }
}
 

















//https://www.arquitecturajava.com/java-arraylist-remove-y-sus-opciones/