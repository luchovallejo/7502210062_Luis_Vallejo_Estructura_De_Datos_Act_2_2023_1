/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2_EjerciciosPracticos;

/**
 *
 * @author lucho
 */
public class EnvioInformacion {
    private Cliente cliente;

    public EnvioInformacion(Cliente cliente) {
        this.cliente = cliente;
    }

    public void enviarMensajeTexto(Cliente cliente, String mensaje) {
        // Lógica para enviar un mensaje de texto al cliente
        System.out.println("Enviando mensaje de texto a " + cliente.getNumeroTelefonico() + ": " + mensaje);
    }

    public void enviarCorreoElectronico(String asunto, String mensaje) {
        // Lógica para enviar un correo electrónico al cliente
        System.out.println("Enviando correo electrónico a " + cliente.getEmail() + ":");
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + mensaje);
    }

    public void enviarFolletosImpresos(int cantidad) {
        // Lógica para enviar folletos impresos al cliente
        System.out.println("Enviando " + cantidad + " folletos impresos a la dirección " + cliente.getDireccion());
    }

    public void realizarLlamadaTelefonica() {
        // Lógica para realizar una llamada telefónica al cliente
        System.out.println("Realizando llamada telefónica al número " + cliente.getNumeroTelefonico());
    }
}
