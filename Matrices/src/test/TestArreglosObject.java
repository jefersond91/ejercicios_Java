package test;

import domain.Persona;

/**
 *
 * @author Jeferson
 */
public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("jeferson");
        personas[1] = new Persona("david");
        System.out.println("persona 0: " + personas[0].getNombre());
        System.out.println("persona 1: " + personas[1]);
        
        for ( int i = 0 ; i < personas.length; i++){
                System.out.println("FOR personas " + i +": " + personas[i]);   
        }
        
        String frutas[] = {"naranja", "banano", "uva"};
        System.out.println("frutas: " + frutas[0]);
        
        for (int i=0; i<frutas.length; i++){
            System.out.println("fruta posicion " + i + ": " + frutas[i]);
        }
    }
    
}
