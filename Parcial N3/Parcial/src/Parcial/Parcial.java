/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parcial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author ivan
 */
public class Parcial {
   private int[][] matriz = new int[6][6];
    private final String archivo = "matriz.txt";

    // Guardar valor en la matriz
    public void guardarDato(int fila, int columna, int valor) {
        matriz[fila][columna] = valor;
    }

    // Guardar toda la matriz en el archivo 
    public void guardarEnArchivo() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    bw.write(matriz[i][j] + " ");
                }
                bw.newLine();
            }
        }
    }

    // Leer matriz desde el archivo
    public int[][] leerDesdeArchivo() throws IOException {
        int[][] datos = new int[6][6];
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            for (int i = 0; i < 6; i++) {
                String[] valores = br.readLine().split(" ");
                for (int j = 0; j < 6; j++) {
                    datos[i][j] = Integer.parseInt(valores[j]);
                }
            }
        }
        return datos;
    }
}