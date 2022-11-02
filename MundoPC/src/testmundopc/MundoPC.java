package testmundopc;

import mundopc.*;

/**
 *
 * @author Jeferson
 */
public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        Monitor monitorLenovo = new Monitor("Lenovo", 17);
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("usb", "Gamer");
        Raton ratonGamer = new Raton("usb", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraGamer);
        
        orden1.mostrarOrden();
    }
}
