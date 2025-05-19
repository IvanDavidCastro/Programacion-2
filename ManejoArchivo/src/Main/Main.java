/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import FORMULARIO.JFmFormulario;
import CLASES.Clientes;
import CLASES.Folder;
import java.util.List;
/**
 *
 * @author ivan
 */
public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Clientes Cliente = new Clientes("1051456", "Ivan", "Castro", "Villasol", "31551....", "ivan@gmail.com");

        // Guardar el cliente
        Folder.guardarCliente(Cliente);

        // Listar clientes
        List<Clientes> lista = Folder.listarClientes();
        for (Clientes c : lista) {
            System.out.println("Nombre: " + c.getNombre() + ", Apellido: " + c.getApellido() +", Cedula: " + c.getCedula() +  ", Direccion: " + c.getDireccion() + ", Telefono: " + c.getTelefono()+ ", Email: " + c.getEmail());
        
        }
        //Mostrar el formulario
        java.awt.EventQueue.invokeLater(() -> {
            new JFmFormulario().setVisible(true);
        });
    }
}
    
