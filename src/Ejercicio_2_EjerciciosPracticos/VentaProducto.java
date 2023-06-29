/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

/**
 *
 * @author lucho
 */
public class VentaProducto {
    private Producto producto;
    private double precioVenta;
    private int cantidad;
    private double descuento;

    public VentaProducto(Producto producto, double precioVenta, int cantidad, double descuento) {
        this.producto = producto;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public Producto getProducto() {
        return producto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public double calcularTotal() {
        double subtotal = precioVenta * cantidad;
        double descuentoAplicado = subtotal * (descuento / 100);
        return subtotal - descuentoAplicado;
    }
    
    public int getUnidadesVendidas() {
        return cantidad;
    }
    
    public double getPorcentajeDescuento() {
        // Implementa la lógica para obtener el porcentaje de descuento del producto
        return producto.getPorcentajeDescuento();
    }
    
    public double getPorcentajeIVA() {
        // Implementa la lógica para obtener el porcentaje de impuesto IVA del producto
        return producto.getPorcentajeIVA();
    }
}
