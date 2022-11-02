package domain;

/**
 *
 * @author Jeferson
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{
        System.out.println("ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
    
    {
        System.out.println("ejecucion bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
    
    
}
