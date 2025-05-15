/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FORMULARIO;

import CLASES.Clientes;
import java.util.Map;
/**
 *
 * @author ivan
 */
public class Main {
     public static void main(String[] args) {
        // Guardar un cliente
        Clientes.guardarCliente("1051456", "Ivan", "Castro", "Villasol", "31551....", "ivandavid.castrojimenez@unitecnar.edu.co");

        // Listar clientes
        Map<String, String> datos = Clientes.listarClientes();
        System.out.println("Datos del cliente:");
        for (Map.Entry<String, String> entry : datos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
