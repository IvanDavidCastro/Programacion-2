/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author ivan
 */
public class Clientes {

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

    // Constructor
    public Clientes(String cedula, String nombre, String apellido, String direccion, String telefono, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
// Método para guardar cliente en JSON
    public static void guardarCliente(String cedula, String nombre, String apellido, String direccion, String telefono, String email) {
        Map<String, String> cliente = new HashMap<>();
        cliente.put("Cedula", cedula);
        cliente.put("Nombre", nombre);
        cliente.put("Apellido", apellido);
        cliente.put("Direccion", direccion);
        cliente.put("Telefono", telefono);
        cliente.put("Email", email);

    
        Gson gson = new Gson();
        java.io.File archivo = new java.io.File("Clientes.json");

        try (java.io.FileWriter writer = new java.io.FileWriter(archivo)) {
            gson.toJson(cliente, writer);
            System.out.println("Cliente guardado correctamente en Clientes.json");
        } catch (java.io.IOException e) {
            System.out.println("Error al guardar cliente: " + e.getMessage());
        }
    }

    // Método para listar clientes desde JSON
    public static Map<String, String> listarClientes() {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        Map<String, String> cliente = new HashMap<>();

        try (java.io.FileReader reader = new java.io.FileReader("Clientes.json")) {
            java.lang.reflect.Type tipo = new com.google.gson.reflect.TypeToken<Map<String, String>>() {
            }.getType();
            cliente = gson.fromJson(reader, tipo);
            System.out.println("Clientes leidos correctamente");
        } catch (java.io.IOException e) {
            System.out.println("Error al leer el Archivo: " + e.getMessage());
        }

        return cliente;
    }
}


    