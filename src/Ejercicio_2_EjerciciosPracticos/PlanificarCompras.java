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
public class PlanificarCompras {
    private LibretaProductos libretaProductos;
    private LibretaVentas libretaVentas;

    public PlanificarCompras(LibretaProductos libretaProductos, LibretaVentas libretaVentas) {
        this.libretaProductos = libretaProductos;
        this.libretaVentas = libretaVentas;
    }

    public void identificarProductosAReponer() {
        Producto[] productos = libretaProductos.getProductos();

        for (Producto producto : productos) {
            if (producto.getExistencia() < 5) {
                realizarCompra(producto.getCodigo(), producto.getExistencia());
            }
        }
    }

    private void realizarCompra(String codigoProducto, int existenciaActual) {
        // Lógica para realizar la compra y abastecer el inventario
        // ...
        System.out.println("Se realizó una compra del producto con código " + codigoProducto +
                " para reponer " + (5 - existenciaActual) + " unidades.");
    }
    
    public List<Producto> obtenerProductosInversion(List<RegistroVenta> ventasRealizadas) {
        List<Producto> productosInversion = new ArrayList<>();
        
        for (RegistroVenta venta : ventasRealizadas) {
            if (venta.getTotalVenta() > 1000) {
                productosInversion.add(venta.getProducto());
            }
        }
        
        return productosInversion;
    }
    
    public List<Producto> obtenerProductosDescuento(List<RegistroVenta> ventasRealizadas) {
        List<Producto> productosDescuento = new ArrayList<>();
        
        for (RegistroVenta venta : ventasRealizadas) {
            if (venta.getPorcentajeDescuento() == 35) {
                productosDescuento.add(venta.getProducto());
            }
        }
        
        return productosDescuento;
    }
}
