/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistema;

/**
 *
 * @author ASUS
 */
public class PagoService {
    public boolean procesarPago(String tarjeta, double monto) {
        System.out.println("Procesando pago con tarjeta " + tarjeta + " por $" + monto);
        return true; 
    }
}