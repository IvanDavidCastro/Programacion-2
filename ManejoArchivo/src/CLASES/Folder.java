/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ivan
 */
public class Folder {
    private static final String FILE = ("Clientes.json");

   public static boolean guardarCliente(Clientes cliente) {
    Gson gson = new Gson();
    List<Clientes> clientes = listarClientes(); //leer lista actual
    clientes.add(cliente); //agregar nuevo

    try (Writer writer = new FileWriter(FILE)) {
        gson.toJson(clientes, writer); //guardar lista completa
        return true;
    } catch (IOException e) {
        e.printStackTrace();
        return false;
    }
}

    public static List<Clientes> listarClientes() {
        List<Clientes> clientes = new ArrayList<>();
        File archivo = new File(FILE);
        if (!archivo.exists()) return clientes;

        try (FileReader reader = new FileReader(archivo)) {
            Gson gson = new Gson();
            Type tipoLista = new TypeToken<List<Clientes>>(){}.getType();
            clientes = gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        return clientes;
    }
}