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
public class BalanceFinanciero {
    private LibretaCompras libretaCompras;
    private LibretaVentas libretaVentas;

    public BalanceFinanciero(LibretaCompras libretaCompras, LibretaVentas libretaVentas) {
        this.libretaCompras = libretaCompras;
        this.libretaVentas = libretaVentas;
    }

    public double calcularDineroInvertido() {
        double dineroInvertido = 0;
        Compra[] compras = libretaCompras.getCompras();

        for (Compra compra : compras) {
            dineroInvertido += compra.getPrecioCompra();
        }

        return dineroInvertido;
    }

    public double calcularDineroRecuperado() {
        double dineroRecuperado = 0;
        Venta[] ventas = libretaVentas.getVenta();

        for (Venta venta : ventas) {
            dineroRecuperado += venta.getValorTotal();
        }

        return dineroRecuperado;
    }

    public double calcularGanancia() {
        double ganancia = calcularDineroRecuperado() - calcularDineroInvertido();
        return ganancia;
    }

    public double calcularDescuentosGenerados() {
        double descuentosGenerados = 0;
        Venta[] ventas = libretaVentas.getVenta();

        for (Venta venta : ventas) {
            descuentosGenerados += venta.getDescuento();
        }

        return descuentosGenerados;
    }

    public double calcularImpuestoIVA() {
        double impuestoIVA = 0;
        Venta[] ventas = libretaVentas.getVenta();

        for (Venta venta : ventas) {
            impuestoIVA += venta.getValorIVA();
        }

        return impuestoIVA;
    }
    
    public float totalDineroInvertido(List<Producto> productos) {
        float total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecioCompra() * producto.getUnidadesExistencia();
        }
        return total;
    }
    
    public float totalDineroRecuperado(List<RegistroVenta> ventas) {
        float total = 0;
        for (RegistroVenta venta : ventas) {
            total += venta.getTotalVenta();
        }
        return total;
    }
    
    public float totalGanancia(float totalDineroInvertido, float totalDineroRecuperado) {
        return totalDineroRecuperado - totalDineroInvertido;
    }
    
    public float totalDescuento(List<RegistroVenta> ventas) {
        float total = 0;
        for (RegistroVenta venta : ventas) {
            total += venta.getDescuentoAplicado();
        }
        return total;
    }
    
    public float totalImpuestoIVA(List<RegistroVenta> ventas) {
        float total = 0;
        for (RegistroVenta venta : ventas) {
            total += venta.getImpuestoIVA();
        }
        return total;
    }
}
