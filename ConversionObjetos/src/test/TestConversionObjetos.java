package test;

import domian.*;

/**
 *
 * @author Jeferson
 */
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("david", 5000, TipoEscritura.CLASICO);
//        System.out.println("empleado: " + empleado);
        
//        System.out.println(empleado.obtenerDetalles());
        //downcasting
//        ((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //upcasting
        Empleado empleado2 = escritor;
        empleado2.obtenerDetalles();
        System.out.println(empleado.obtenerDetalles());
        
    }
    
}
