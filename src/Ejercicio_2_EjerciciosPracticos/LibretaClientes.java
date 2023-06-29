/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

/**
 *
 * @author lucho
 */
public class LibretaClientes {
    private Cliente[] clientes;
    private int cantidadClientes;

    public LibretaClientes() {
        clientes = new Cliente[100]; // Capacidad inicial para 100 clientes
        cantidadClientes = 0;
    }

    public void agregarCliente(Cliente cliente) {
        clientes[cantidadClientes] = cliente;
        cantidadClientes++;
    }

    public Cliente[] getClientes() {
        return clientes;
    }
}
