/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

/**
 *
 * @author lucho
 */
public class Cliente {
    private String cedula;
    private String nombre;
    private String apellidos;
    private String genero;
    private String fechaNacimiento;
    private String numeroTelefonico;
    private String email;
    private String direccion;
    private boolean esVIP;
    private String nombreCompleto;
    private String estado;
    private int numeroCompras;
    private Compra ultimaCompra;
    private Compra[] compras;

    // Constructor
    public Cliente(String cedula, String nombre, String apellidos, String genero, String fechaNacimiento,
                   String numeroTelefonico, String email, String direccion, String nombreCompleto,
                   String estado, int numeroCompras, Compra ultimaCompra, Compra[] compras) {
        
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefonico = numeroTelefonico;
        this.email = email;
        this.direccion = direccion;
        this.esVIP = false;
        this.nombreCompleto = nombreCompleto;
        this.estado = estado;
        this.numeroCompras = numeroCompras;
        this.ultimaCompra = ultimaCompra;
        this.compras = compras;
    }

    // Métodos
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean esVIP() {
        return esVIP;
    }

    public void convertirEnVIP() {
        this.esVIP = true;
    }

    public boolean isEsVIP() {
        return esVIP;
    }

    public void setEsVIP(boolean esVIP) {
        this.esVIP = esVIP;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroCompras() {
        return numeroCompras;
    }

    public void setNumeroCompras(int numeroCompras) {
        this.numeroCompras = numeroCompras;
    }

    public Compra getUltimaCompra() {
        return ultimaCompra;
    }

    public void setUltimaCompra(Compra ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }
    
    public double calcularTotalCompras() {
        double total = 0.0;
        for (Compra compra : compras) {
            total += compra.getValorTotal();
        }
        return total;
    }
    
     public void setVIP(boolean esVIP) {
        this.esVIP = esVIP;
    }
}
