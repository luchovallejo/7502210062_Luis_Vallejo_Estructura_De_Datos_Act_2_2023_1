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
public class ActualizarExistencias {
    private LibretaProductos libretaProductos;
    public ActualizarExistencias(LibretaProductos libretaProductos) {
        this.libretaProductos = libretaProductos;
    }
    
    public void actualizarExistencias(String codigoProducto, double precioCompra, double precioVenta,
                                      double porcentajeDescuento, int unidadesCompradas) {
        Producto producto = libretaProductos.buscarProductoPorCodigo(codigoProducto);
        if (producto != null) {
            producto.setPrecioCompra((float) precioCompra);
            producto.setPrecioVenta((float) precioVenta);
            producto.setPorcentajeDescuento(porcentajeDescuento);
            producto.aumentarUnidadesExistencia(unidadesCompradas);
        }
    }
    
    public void actualizarProductosVendidos(RegistroVenta venta) {
        VentaProducto[] productosVendidos = venta.getProductos();
        for (VentaProducto ventaProducto : productosVendidos) {
            Producto productoExistente = libretaProductos.buscarProductoPorCodigo(ventaProducto.getProducto().getCodigo());
            if (productoExistente != null) {
                productoExistente.aumentarUnidadesExistencia(ventaProducto.getCantidad());
            }
        }
    } 
    
    public void actualizarExistencias(Compra compra) {
        List<Producto> productosComprados = compra.getProductosComprados();
        for (Producto producto : productosComprados) {
            Producto productoExistente = libretaProductos.buscarProductoPorCodigo(producto.getCodigo());
            if (productoExistente != null) {
                productoExistente.aumentarUnidadesExistencia(producto.getUnidadesCompradas());
            }
        }
    }
}
