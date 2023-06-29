/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

import java.util.List;

/**
 *
 * @author lucho
 */
public class RevisarProductos {
    private LibretaProductos libretaProductos;
    
    public RevisarProductos(LibretaProductos libretaProductos) {
        this.libretaProductos = libretaProductos;
    }
    
    public void revisarExistencias() {
        Producto[] productos = libretaProductos.getProductos();
        for (Producto producto : productos) {
            if (producto.getUnidadesExistencia() < 5) {
                System.out.println("El producto " + producto.getNombre() + " tiene una existencia inferior a 5 unidades.");
                // Realizar acciones adicionales, como realizar compras para abastecer el inventario.
            }
        }
    }
    
    public void aplicarDescuento() {
        Producto[] productos = libretaProductos.getProductos();
        for (Producto producto : productos) {
            if (producto.getUnidadesExistencia() >= 5) {
                double descuento = producto.getPrecioVenta() * 0.35;
                producto.setPrecioVenta(producto.getPrecioVenta() - descuento);
                System.out.println("Se ha aplicado un descuento del 35% al producto " + producto.getNombre() + ".");
            }
        }
    }
    
    public void revisarExistencias(List<Producto> productos) {
        for (Producto producto : productos) {
            if (producto.getUnidadesExistencia() == 0) {
                System.out.println("Producto agotado: " + producto.getNombre());
            }
        }
    }
}
