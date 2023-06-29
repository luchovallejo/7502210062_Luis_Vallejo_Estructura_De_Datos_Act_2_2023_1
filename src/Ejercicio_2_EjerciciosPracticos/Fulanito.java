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
public class Fulanito {
    private List<RegistroVenta> ventasRealizadas;
    private List<Compra> comprasRealizadas;
    private List<Producto> productos;
    private List<Cliente> clientes;
    private ProcesoMercadeo procesoMercadeo;
    private EnvioInformacion envioInformacion;
    private ActualizarExistencias actualizarExistencias;
    private CambioEstadoVIP cambioEstadoVIP;
    private RevisarProductos revisarProductos;
    private MotivarClientes motivarClientes;
    private BalanceFinanciero balanceFinanciero;
    private PlanificarCompras planificarCompras;

    // Constructor
    
    
    public Fulanito(List<RegistroVenta> ventasRealizadas, List<Compra> comprasRealizadas, List<Producto> productos,
                    List<Cliente> clientes, ProcesoMercadeo procesoMercadeo, EnvioInformacion envioInformacion,
                    ActualizarExistencias actualizarExistencias, CambioEstadoVIP cambioEstadoVIP,
                    RevisarProductos revisarProductos, MotivarClientes motivarClientes,
                    BalanceFinanciero balanceFinanciero, PlanificarCompras planificarCompras) {
        this.ventasRealizadas = ventasRealizadas;
        this.comprasRealizadas = comprasRealizadas;
        this.productos = productos;
        this.clientes = clientes;
        this.procesoMercadeo = procesoMercadeo;
        this.envioInformacion = envioInformacion;
        this.actualizarExistencias = actualizarExistencias;
        this.cambioEstadoVIP = cambioEstadoVIP;
        this.revisarProductos = revisarProductos;
        this.motivarClientes = motivarClientes;
        this.balanceFinanciero = balanceFinanciero;
        this.planificarCompras = planificarCompras;
    }

    // Métodos
    
    public void realizarVenta(RegistroVenta venta) {
        ventasRealizadas.add(venta);
        actualizarExistencias.actualizarProductosVendidos(venta);
        cambioEstadoVIP.pasarClienteAVIP(venta.getCedulaCliente());
        revisarProductos.revisarExistencias(productos);
    }
    
    public void realizarCompra(Compra compra) {
        comprasRealizadas.add(compra);
        actualizarExistencias.actualizarExistencias(compra);
    }
    
    public void enviarInformacion(Cliente cliente, String mensaje) {
        envioInformacion.enviarMensajeTexto(cliente, mensaje);
    }
    
    public void calcularBalanceFinanciero() {
        float totalDineroInvertido = balanceFinanciero.totalDineroInvertido(productos);
        float totalDineroRecuperado = balanceFinanciero.totalDineroRecuperado(ventasRealizadas);
        float totalGanancia = balanceFinanciero.totalGanancia(totalDineroInvertido, totalDineroRecuperado);
        float totalDescuento = balanceFinanciero.totalDescuento(ventasRealizadas);
        float totalImpuestoIVA = balanceFinanciero.totalImpuestoIVA(ventasRealizadas);
        
        System.out.println("Balance Financiero:");
        System.out.println("Total de dinero invertido: $" + totalDineroInvertido);
        System.out.println("Total de dinero recuperado en ventas: $" + totalDineroRecuperado);
        System.out.println("Total de ganancia: $" + totalGanancia);
        System.out.println("Total de dinero en descuento: $" + totalDescuento);
        System.out.println("Total de dinero pagado como impuesto IVA: $" + totalImpuestoIVA);
    }
    
    public void planificarCompras() {
        List<Producto> productosInversion = planificarCompras.obtenerProductosInversion(ventasRealizadas);
        List<Producto> productosDescuento = planificarCompras.obtenerProductosDescuento(ventasRealizadas);
        
        System.out.println("Productos para invertir más:");
        for (Producto producto : productosInversion) {
            System.out.println(producto.getNombre());
        }
        
        System.out.println("Productos con descuento del 35%:");
        for (Producto producto : productosDescuento) {
            System.out.println(producto.getNombre());
        }
    }
}
