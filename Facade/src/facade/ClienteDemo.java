/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author ASUS
 */
public class ClienteDemo {
    public static void main(String[] args) {
        CompraFacade facade = new CompraFacade();
        String producto = "Televisor";
        String usuario = "Ivan";
        String tarjeta = "4111111111111111";
        String direccion = "Calle 123, Ciudad";

        boolean exito = facade.realizarCompra(producto, usuario, tarjeta, direccion);
        System.out.println("Resultado: " + (exito ? "Exito" : "Fallo"));
    }
}

