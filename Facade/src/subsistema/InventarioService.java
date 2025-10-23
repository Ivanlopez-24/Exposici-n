/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistema;

/**
 *
 * @author ASUS
 */
public class InventarioService {
    public boolean verificarStock(String productoId) {
        System.out.println("Verificando stock de " + productoId);
        return true; 
    }
    public boolean reservarStock(String productoId) {
        System.out.println("Reservando stock de " + productoId);
        return true;
    }
    public void liberarStock(String productoId) {
        System.out.println("Liberando stock de " + productoId);
    }
}