/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

/**
 *
 * @author lucho
 */
public class LibretaCompras {
    private Compra[] compras;
    private int count;

    public LibretaCompras(int size) {
        compras = new Compra[size];
        count = 0;
    }

    public void agregarCompra(Compra compra) {
        if (count < compras.length) {
            compras[count] = compra;
            count++;
        } else {
            System.out.println("No se pueden agregar más compras. La libreta está llena.");
        }
    }

    public Compra[] getCompras() {
        return compras;
    }
}
