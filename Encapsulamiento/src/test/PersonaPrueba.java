package test;

import dominio.Persona;

/**
 *
 * @author Jeferson
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jeferson", 5000.00, false);
//        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Jeferson David");
//        System.out.println("persona1 nombre con cambio: " + persona1.getNombre());
//        System.out.println("persona1 sueldo: " + persona1.getSueldo());
//        System.out.println("persona1 eliminado: " + persona1.isEliminado());
         System.out.println(" persona1: " + persona1.toString()); 
    }
}
