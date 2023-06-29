/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

/**
 *
 * @author lucho
 */
public class Producto {
    private String codigo;
    private String nombre;
    private String marca;
    private String color;
    private float precioCompra;
    private double precioVenta;
    private float porcentajeDescuentoMaximo;
    private int unidadesExistencia;
    private String metricaMedida;
    private String categoria;
    private double porcentajeDescuento;
    private int aumentarUnidadesExistencia;
    private int existencia;
    private int unidadesCompradas;
    private double porcentajeIVA;

    // Constructor

    public Producto(String codigo, String nombre, String marca, String color, float precioCompra, double  precioVenta,
                    float porcentajeDescuentoMaximo, int unidadesExistencia, String metricaMedida, String categoria, double porcentajeDescuento, int aumentarUnidadesExistencia, int existencia, double porcentajeIVA) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.porcentajeDescuentoMaximo = porcentajeDescuentoMaximo;
        this.unidadesExistencia = unidadesExistencia;
        this.metricaMedida = metricaMedida;
        this.categoria = categoria;
        this.porcentajeDescuento = porcentajeDescuento;
        this.aumentarUnidadesExistencia = aumentarUnidadesExistencia;
        this.existencia = existencia;
        this.porcentajeIVA = porcentajeIVA;
    }

    // Métodos
    public void actualizarPrecioCompra(float nuevoPrecioCompra) {
        this.precioCompra = nuevoPrecioCompra;
    }
    
    public void actualizarPrecioVenta() {
        this.precioVenta = 0.4f * this.precioCompra;
    }
    
    public void actualizarDescuentoMaximo(float nuevoDescuentoMaximo) {
        this.porcentajeDescuentoMaximo = nuevoDescuentoMaximo;
    }
    
    public void actualizarExistencia(int unidadesCompradas) {
        this.unidadesExistencia += unidadesCompradas;
    }
    
    public void aumentarUnidadesExistencia(int cantidad) {
        unidadesExistencia += cantidad;
    }
    
    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getPorcentajeDescuentoMaximo() {
        return porcentajeDescuentoMaximo;
    }

    public void setPorcentajeDescuentoMaximo(float porcentajeDescuentoMaximo) {
        this.porcentajeDescuentoMaximo = porcentajeDescuentoMaximo;
    }

    public int getUnidadesExistencia() {
        return unidadesExistencia;
    }

    public void setUnidadesExistencia(int unidadesExistencia) {
        this.unidadesExistencia = unidadesExistencia;
    }

    public String getMetricaMedida() {
        return metricaMedida;
    }

    public void setMetricaMedida(String metricaMedida) {
        this.metricaMedida = metricaMedida;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getAumentarUnidadesExistencia() {
        return aumentarUnidadesExistencia;
    }

    public void setAumentarUnidadesExistencia(int aumentarUnidadesExistencia) {
        this.aumentarUnidadesExistencia = aumentarUnidadesExistencia;
    }
    
    public int getExistencia() {
        return existencia;
    }
    
    public void setUnidadesCompradas(int unidadesCompradas) {
        this.unidadesCompradas = unidadesCompradas;
    }
    
    public int getUnidadesCompradas() {
        return unidadesCompradas;
    }
    public double getPorcentajeIVA() {
        // Implementa la lógica para obtener el porcentaje de impuesto IVA del producto
        return porcentajeIVA;
    }
}
