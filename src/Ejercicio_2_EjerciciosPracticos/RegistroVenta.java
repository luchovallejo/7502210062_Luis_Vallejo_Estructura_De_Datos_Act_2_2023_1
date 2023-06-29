/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

import java.util.Date;

/**
 *
 * @author lucho
 */
public class RegistroVenta {
    private int consecutivo;
    private Date fecha;
    private String cedulaCliente;
    private String medioPago;
    private String modalidad;
    private VentaProducto[] productos;
    private int cantidadProductos;
    private double valorTotal;
    private Producto producto;
    private float totalVenta;
    private float descuento;

    // Constructor

    public RegistroVenta(int consecutivo, Date fecha, String cedulaCliente, String medioPago, String modalidad, Producto producto, float totalVenta, float descuento) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.cedulaCliente = cedulaCliente;
        this.medioPago = medioPago;
        this.modalidad = modalidad;
        this.productos = new VentaProducto[100]; // Capacidad inicial para 100 productos
        this.cantidadProductos = 0;
        this.valorTotal = 0.0;
        this.producto = producto;
        this.totalVenta = totalVenta;
        this.descuento = descuento;
    }

    // Métodos

    public int getConsecutivo() {
        return consecutivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void agregarProducto(Producto producto, double precioVenta, int cantidad, double descuento) {
        VentaProducto ventaProducto = new VentaProducto(producto, precioVenta, cantidad, descuento);
        productos[cantidadProductos] = ventaProducto;
        cantidadProductos++;
        valorTotal += ventaProducto.calcularTotal();
    }

    public VentaProducto[] getProductos() {
        return productos;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
    public Producto getProducto() {
        return producto;
    }

    public float getDescuento() {
        return descuento;
    }

    public float getPorcentajeDescuento() {
        return (descuento / totalVenta) * 100;
    }
    
    public Producto[] getProductosVendidos() {
        Producto[] productosVendidos = new Producto[cantidadProductos];
        for (int i = 0; i < cantidadProductos; i++) {
            productosVendidos[i] = productos[i].getProducto();
        }
        return productosVendidos;
    }
    
    public float getTotalVenta() {
    float total = 0;
    for (int i = 0; i < cantidadProductos; i++) {
        VentaProducto ventaProducto = productos[i];
        if (ventaProducto != null) {
            total += ventaProducto.getCantidad() * ventaProducto.getPrecioVenta();
        }
    }
    return total;
}
    
    public float getDescuentoAplicado() {
    float descuento = 0;
    for (int i = 0; i < cantidadProductos; i++) {
        VentaProducto ventaProducto = productos[i];
        if (ventaProducto != null) {
            float precioVenta = (float) ventaProducto.getPrecioVenta();
            double descuentoProducto = precioVenta * ventaProducto.getPorcentajeDescuento() / 100;
            descuento += descuentoProducto * ventaProducto.getCantidad();
        }
    }
    return descuento;
}
    
    public float getImpuestoIVA() {
    float impuestoIVA = 0;
    for (int i = 0; i < cantidadProductos; i++) {
        VentaProducto ventaProducto = productos[i];
        if (ventaProducto != null) {
            float precioVenta = (float) ventaProducto.getPrecioVenta();
            double impuesto = precioVenta * ventaProducto.getPorcentajeIVA() / 100;
            impuestoIVA += impuesto * ventaProducto.getCantidad();
        }
    }
    return impuestoIVA;
}
}
