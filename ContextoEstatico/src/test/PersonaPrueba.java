package test;

import domain.Persona;

/**
 *
 * @author Jeferson
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jeferson");
        System.out.println("persona1= " + persona1);
        
        Persona persona2 = new Persona("David");
        System.out.println("persona2= " + persona2);
        
        imprimir(persona1);
        imprimir(persona2);
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
