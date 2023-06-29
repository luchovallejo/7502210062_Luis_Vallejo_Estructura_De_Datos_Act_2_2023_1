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
public class CambioEstadoVIP {
    private LibretaClientes libretaClientes;
    private double promedioCompras;
    private List<Cliente> clientesVIP;

    public CambioEstadoVIP(LibretaClientes libretaClientes, double promedioCompras) {
        this.libretaClientes = libretaClientes;
        this.promedioCompras = promedioCompras;
        this.clientesVIP = new ArrayList<>();
    }

    public void aplicarDescuentoVIP() {
        Cliente[] clientes = libretaClientes.getClientes();
        for (Cliente cliente : clientes) {
            if (cliente.getEstado().equals("Referido")) {
                cliente.setEstado("VIP");
                System.out.println("El cliente " + cliente.getNombreCompleto() + " ha sido cambiado a estado VIP.");
                if (cliente.getNumeroCompras() > promedioCompras) {
                    double descuento = cliente.getUltimaCompra().getValorTotal() * 0.10;
                    System.out.println("Se ha aplicado un descuento del 10% en la próxima compra de " + descuento + " al cliente " + cliente.getNombreCompleto() + ".");
                } else {
                    double descuento = cliente.getUltimaCompra().getValorTotal() * 0.15;
                    System.out.println("Se ha aplicado un descuento del 15% en la próxima compra de " + descuento + " al cliente " + cliente.getNombreCompleto() + ".");
                }
            } else if (cliente.getEstado().equals("Referido")) {
                double descuento = cliente.getUltimaCompra().getValorTotal() * 0.25;
                System.out.println("Se ha aplicado un descuento del 25% en la primera compra de " + descuento + " al cliente " + cliente.getNombreCompleto() + ".");
            }
        }
    }
    
    public void pasarClienteAVIP(String cedulaCliente) {
        // Buscar el cliente en la lista de clientes y cambiar su estado a VIP
        for (Cliente cliente : clientesVIP) {
            if (cliente.getCedula().equals(cedulaCliente)) {
                cliente.setVIP(true);
                break;
            }
        }
    }
}
