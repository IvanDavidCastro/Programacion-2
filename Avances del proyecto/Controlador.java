/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.util.ArrayList;

/**
 *
 * @author ivan
 */
public class Controlador {
   private ArrayList<Producto> listaProductos = new ArrayList<>();

    public boolean agregarProducto(String codigo, String nombre, String serial) {
        Producto nuevo = new Producto(codigo, nombre, serial);
        listaProductos.add(nuevo);
        return true;
    }

    public ArrayList<Producto> listarProductos() {
        return listaProductos;
    }
}
    