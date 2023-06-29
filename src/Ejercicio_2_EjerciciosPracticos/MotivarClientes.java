/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

/**
 *
 * @author lucho
 */
public class MotivarClientes {
    private LibretaVentas libretaVentas;
    private LibretaClientes libretaClientes;

    public MotivarClientes(LibretaVentas libretaVentas, LibretaClientes libretaClientes) {
        this.libretaVentas = libretaVentas;
        this.libretaClientes = libretaClientes;
    }

    public void motivarDescuentos() {
        double promedioCompras = libretaVentas.calcularPromedioCompras();
        Cliente[] clientes = libretaClientes.getClientes();

        for (Cliente cliente : clientes) {
            double totalCompras = cliente.calcularTotalCompras();
            if (totalCompras > promedioCompras) {
                double descuento = cliente.getUltimaCompra().getValorTotal() * 0.10;
                System.out.println("¡Felicidades, " + cliente.getNombreCompleto() + "! Usted tiene un descuento del 10% en su próxima compra.");
                System.out.println("Descuento: $" + descuento);
            } else if (totalCompras < promedioCompras) {
                double descuento = cliente.getUltimaCompra().getValorTotal() * 0.15;
                System.out.println("¡Hola, " + cliente.getNombreCompleto() + "! Usted tiene un descuento del 15% en su próxima compra.");
                System.out.println("Descuento: $" + descuento);
            } else {
                double descuento = cliente.getUltimaCompra().getValorTotal() * 0.25;
                System.out.println("¡Bienvenido, " + cliente.getNombreCompleto() + "! Usted tiene un descuento del 25% en su primera compra.");
                System.out.println("Descuento: $" + descuento);
            }
        }
    }
}
