/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Sala de Sistemas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
       
       //datos cargados manual 
        int [][] matriz = { 
        {10,  20,  30,  40},
        {50,  60,  70,  80},
        {90, 100, 110, 120},
        {130,140, 150, 160},
       
    };
       
    /* 
    int matriz [][]= new int [4][4];
    for (int f=0; f <matriz.length; f++) {
           for (int c=0; c<matriz[0].length; c++){
               System.out.println("Ingrese el valor para la fila: " + f + " columna " + c);
               matriz[f][c] = leer.nextInt();         
           }
       }
    */
          
         for (int f=0; f <matriz.length; f++) {
           for (int c=0; c<matriz[0].length; c++){
               if(c==0 && c==2){
               System.out.println("Fila: " + f + " Columna: " + c + " Valor: " + matriz[f][c]);
             
               }
           }
        }
         System.out.println("EL VALOR DE LA FILA 4 Y COLUMNA 3 ES: " +matriz[3][2]);
    }
}         

    
