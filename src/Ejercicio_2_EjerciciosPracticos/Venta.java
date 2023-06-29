/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

import Ejercicio_2_EjerciciosPracticos.Producto;
import Ejercicio_2_EjerciciosPracticos.Producto;
import Ejercicio_2_EjerciciosPracticos.Producto;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lucho
 */
public class Venta {
    private int consecutivo;
    private Date fecha;
    private String cedulaCliente;
    private String medioPago;
    private String modalidad;
    private String codigoProducto;
    private double precioVenta;
    private double cantidad;
    private double descuento;
    private double valorSinIVA;
    private double valorDescuento;
    private double valorIVA;
    private double valorTotal;
    private String estado;
    private String motivoCancelacion;
    private List<Producto> productos;
    
    public Venta(int consecutivo, Date fecha, String cedulaCliente, String formaPago, String tipoVenta,
             String codigoProducto, double valorUnitario, double cantidad, double descuento, double subtotal,
             double valorDescuento, double iva, double valorTotal, String estado, String observaciones,
             List<Producto> productos) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.cedulaCliente = cedulaCliente;
        this.medioPago = medioPago;
        this.modalidad = modalidad;
        this.codigoProducto = codigoProducto;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.valorSinIVA = valorSinIVA;
        this.valorDescuento = valorDescuento;
        this.valorIVA = valorIVA;
        this.valorTotal = valorTotal;
        this.estado = estado;
        this.motivoCancelacion = motivoCancelacion;
        this.productos = productos;
    }
    
    // Getters y setters
    
    public int getConsecutivo() {
        return consecutivo;
    }
    
    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getCedulaCliente() {
        return cedulaCliente;
    }
    
    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }
    
    public String getMedioPago() {
        return medioPago;
    }
    
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    
    public String getModalidad() {
        return modalidad;
    }
    
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    public String getCodigoProducto() {
        return codigoProducto;
    }
    
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    
    public double getPrecioVenta() {
        return precioVenta;
    }
    
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public double getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getDescuento() {
        return descuento;
    }
    
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public double getValorSinIVA() {
        return valorSinIVA;
    }
    
    public void setValorSinIVA(double valorSinIVA) {
        this.valorSinIVA = valorSinIVA;
    }
    
    public double getValorDescuento() {
        return valorDescuento;
    }
    
    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }
    
    public double getValorIVA() {
        return valorIVA;
    }
    
    public void setValorIVA(double valorIVA) {
        this.valorIVA = valorIVA;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }
    
    public void setMotivoCancelacion(String motivoCancelacion) {
        this.motivoCancelacion = motivoCancelacion;
    }
    
    public List<Producto> getProductos() {
        return productos;
    }
}
