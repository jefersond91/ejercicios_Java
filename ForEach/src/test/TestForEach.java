package test;

import domain.Persona;

/**
 *
 * @author Jeferson
 */
public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 7, 8, 9};
        for (int i = 0; i < edades.length; i++) {
            System.out.println("For elenemento "+ i + ": " + edades[i]); 
        }
        
        for(int edad: edades){
            System.out.println("ForEach elemento edad: "+ edad);
        }
        
        Persona personas[] = {new Persona("jeferson"), new Persona("david"), new Persona("mesa")};
        for( Persona persona: personas){
            System.out.println("ForEach elemento persona: "+ persona);
        }
        
    }
}
