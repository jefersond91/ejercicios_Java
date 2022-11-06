package test;

import domain.PersonaBean;

/**
 *
 * @author Jeferson
 */
public class TestJavaBeans {
    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        persona.setNombre("jeferson");
        persona.setApellido("mesa");
        
        System.out.println("persona: " + persona);
        System.out.println("nombre: " + persona.getNombre());
        System.out.println("apellido: " + persona.getApellido());
        System.out.println("persona: " + persona.toString());
        
    }
}
