/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

import java.util.Date;
import java.util.List;

/**
 *
 * @author lucho
 */
public class Compra {
    private int consecutivo;
    private Date fecha;
    private String cedulaCliente;
    private String medioPago;
    private String modalidad;
    private String codigoProducto;
    private float precioVenta;
    private int cantidad;
    private float valorDescuento;
    private float valorSinIVA;
    private float valorIVA;
    private float valorTotal;
    private double precioCompra;
    private List<Producto> productosComprados;

    // Constructor

    public Compra(int consecutivo, Date fecha, String cedulaCliente, String medioPago, String modalidad,
                  String codigoProducto, float precioVenta, int cantidad, float valorDescuento, float valorSinIVA,
                  float valorIVA, float valorTotal, double precioCompra, List<Producto> productosComprados) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.cedulaCliente = cedulaCliente;
        this.medioPago = medioPago;
        this.modalidad = modalidad;
        this.codigoProducto = codigoProducto;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.valorDescuento = valorDescuento;
        this.valorSinIVA = valorSinIVA;
        this.valorIVA = valorIVA;
        this.valorTotal = valorTotal;
        this.precioCompra = precioCompra;
        this.productosComprados = productosComprados;
    }

    // Métodos
    public void calcularValoresCompra(float porcentajeIVA) {
        valorSinIVA = precioVenta * cantidad - valorDescuento;
        valorIVA = valorSinIVA * porcentajeIVA;
        valorTotal = valorSinIVA + valorIVA;
    }
    
    // Getters y Setters
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

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(float valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public float getValorSinIVA() {
        return valorSinIVA;
    }

    public void setValorSinIVA(float valorSinIVA) {
        this.valorSinIVA = valorSinIVA;
    }

    public float getValorIVA() {
        return valorIVA;
    }

    public void setValorIVA(float valorIVA) {
        this.valorIVA = valorIVA;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public double getPrecioCompra() {
        return precioCompra;
    }
    
    public List<Producto> getProductosComprados() {
        return productosComprados;
    }
}
