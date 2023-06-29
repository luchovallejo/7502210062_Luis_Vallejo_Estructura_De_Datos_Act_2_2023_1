/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucho
 */
public class LibretaProductos {
    private List<Producto> productos;
    private Producto[] producto;
    
    public Producto[] getProductos() {
        // Si la lista de productos está vacía, se devuelve un array vacío
        if (productos == null || productos.isEmpty()) {
            return new Producto[0];
        }
        // Si la lista de productos no está vacía, se convierte en un array y se devuelve
        return productos.toArray(new Producto[productos.size()]);
    }

    public LibretaProductos() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }
}
