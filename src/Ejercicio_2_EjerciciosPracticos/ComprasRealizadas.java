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
public class ComprasRealizadas {
    private List<Compra> compras;
    // Constructor
    public ComprasRealizadas() {
        compras = new ArrayList<>();
    }
    // Métodos
    public void agregarCompra(Compra compra) {
        compras.add(compra);
    }

    public void eliminarCompra(Compra compra) {
        compras.remove(compra);
    }

    public List<Compra> obtenerCompras() {
        return compras;
    }

    public int obtenerTotalCompras() {
        return compras.size();
    }

    public float obtenerTotalDineroGastado() {
        float total = 0;
        for (Compra compra : compras) {
            total += compra.getValorTotal();
        }
        return total;
    }
}
