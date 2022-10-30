package test;

import ventas.Orden;
import ventas.Producto;

/**
 *
 * @author Jeferson
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa", 20000);
        Producto producto2 = new Producto("pantalon", 30000);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
    }
}
