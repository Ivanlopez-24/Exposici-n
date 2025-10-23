/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;
import subsistema.*;
/**
 *
 * @author ASUS
 */
public class CompraFacade {
    private AutenticacionService auth = new AutenticacionService();
    private InventarioService inventario = new InventarioService();
    private PagoService pago = new PagoService();
    private FacturaService factura = new FacturaService();
    private EnvioService envio = new EnvioService();

    public boolean realizarCompra(String productoId, String usuarioId, String tarjeta, String direccion) {
        System.out.println("Inicio proceso de compra (Facade)");

        if (!auth.validarUsuario(usuarioId)) {
            System.out.println("Usuario no valido");
            return false;
        }

        if (!inventario.verificarStock(productoId)) {
            System.out.println("Sin stock");
            return false;
        }

        if (!inventario.reservarStock(productoId)) {
            System.out.println("No se pudo reservar stock");
            return false;
        }

        double monto = 100.0; 
        if (!pago.procesarPago(tarjeta, monto)) {
            System.out.println("Pago fallido, liberando stock");
            inventario.liberarStock(productoId);
            return false;
        }

        String idFactura = factura.generarFactura(usuarioId, productoId);
        envio.crearEnvio(usuarioId, direccion, productoId);

        System.out.println("Compra realizada con exito. Factura: " + idFactura);
        return true;
    }
}