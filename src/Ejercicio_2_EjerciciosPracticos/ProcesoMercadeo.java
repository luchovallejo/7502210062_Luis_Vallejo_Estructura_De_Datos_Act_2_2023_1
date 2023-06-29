/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author lucho
 */
public class ProcesoMercadeo {
    private List<Producto> productos;
    private Map<String, List<Producto>> productosPorCategoria;
    // Constructor
    public ProcesoMercadeo() {
        productos = new ArrayList<>();
        productosPorCategoria = new HashMap<>();
    }

    // Métodos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        String categoria = producto.getCategoria();
        if (productosPorCategoria.containsKey(categoria)) {
            productosPorCategoria.get(categoria).add(producto);
        } else {
            List<Producto> listaProductos = new ArrayList<>();
            listaProductos.add(producto);
            productosPorCategoria.put(categoria, listaProductos);
        }
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
        String categoria = producto.getCategoria();
        if (productosPorCategoria.containsKey(categoria)) {
            productosPorCategoria.get(categoria).remove(producto);
        }
    }

    public List<Producto> obtenerProductos() {
        return productos;
    }

    public List<Producto> obtenerProductosPorCategoria(String categoria) {
        return productosPorCategoria.getOrDefault(categoria, new ArrayList<>());
    }

    public List<String> obtenerCategorias() {
        List<String> categorias = new ArrayList<>(productosPorCategoria.keySet());
        Collections.sort(categorias);
        return categorias;
    }

    public void generarArchivoPublicidad(String archivo) {
        // Lógica para generar el archivo de publicidad
        // utilizando la información de los productos
    }
}
