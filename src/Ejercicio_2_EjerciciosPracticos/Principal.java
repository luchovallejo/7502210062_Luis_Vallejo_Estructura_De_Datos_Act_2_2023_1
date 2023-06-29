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
public class Principal {
    public static void main(String[] args) {
        // Crear objetos necesarios
        LibretaClientes libretaClientes = new LibretaClientes();
        LibretaProductos libretaProductos = new LibretaProductos();
        LibretaVentas libretaVentas = new LibretaVentas();
        PlanificarCompras planificador = new PlanificarCompras(libretaProductos, libretaVentas);        
        

        // Agregar productos a la libreta de productos
        Producto producto1 = new Producto("c1234", "paola", "adidas", "rojo", 1.0f, 10.0, 2.0f, 8, "13", "deportiva", 3.0, 8, 10, 19.0);
        Producto producto2 = new Producto("c4321", "luis", "nike", "verde", 2.0f, 20.0, 3.0f, 9, "14", "vacaciones", 9.0, 9, 6, 19.0);
        libretaProductos.agregarProducto(producto1);
        libretaProductos.agregarProducto(producto2);
        

        // Agregar ventas a la libreta de ventas
        RegistroVenta venta1 = new RegistroVenta(1, new Date(), "cedula", "pago", "modalidad", producto1, 2.0f, 4.0f);
        RegistroVenta venta2 = new RegistroVenta(2, new Date(), "10438930", "factura", "presencial", producto2, 2.0f, 4.0f);
        libretaVentas.agregarVenta(venta1);
        libretaVentas.agregarVenta(venta2);

        // Ejecutar planificación de compras
        // Ejecutar planificación de compras
        planificador.identificarProductosAReponer();

        // Obtener productos de inversión
         List<Producto> productosInversion = planificador.obtenerProductosInversion(libretaVentas.getVentasRealizadas());

        System.out.println("Productos para invertir más:");
        for (Producto producto : productosInversion) {
            System.out.println(producto.getNombre());
        }

        // Obtener productos con descuento
        List<Producto>productosDescuento = planificador.obtenerProductosDescuento(libretaVentas.getVentasRealizadas());

        System.out.println("Productos con descuento del 35%:");
        for (Producto producto : productosDescuento) {
            System.out.println(producto.getNombre());
        }
    }
}
