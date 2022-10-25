package clases;

/**
 *
 * @author Jeferson
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Jeferson";
        persona1.apellido = "Mesa";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        persona2.nombre = "Margarita";
        persona2.apellido = "Moreno";
        persona2.desplegarInformacion();
    }
}
