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
public class LibretaVentas {
    private RegistroVenta[] ventas;
    private int cantidadVentas;
    private Venta[] venta;
    private List<RegistroVenta> ventasRealizadas;

    public LibretaVentas() {
        this.ventas = new RegistroVenta[100]; // Capacidad inicial para 100 ventas
        this.cantidadVentas = 0;
        this.ventasRealizadas = new ArrayList<>();
    }

    public void agregarVenta(RegistroVenta venta) {
        ventas[cantidadVentas] = venta;
        cantidadVentas++;
        ventasRealizadas.add(venta);
    }

    public double calcularPromedioCompras() {
        double totalCompras = 0.0;
        for (int i = 0; i < cantidadVentas; i++) {
            totalCompras += ventas[i].getValorTotal();
        }
        return totalCompras / cantidadVentas;
    }
    
    // Otros métodos de la clase LibretaVentas...

    public RegistroVenta[] getVentas() {
        return ventas;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }
    
    public Venta[] getVenta() {
        return venta;
    }
    
    public List<RegistroVenta> getVentasRealizadas() {
        return ventasRealizadas;
    }
}
