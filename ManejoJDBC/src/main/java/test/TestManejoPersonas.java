package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

/**
 *
 * @author Jeferson
 */
public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
        //Insertando un nuevo objeto de tipo persona
//        Persona personaNueva = new Persona("carlos", "mendez", "carlos@gmail.com", "3007475829");
//        personaDao.insertar(personaNueva);
        
        //Actualizando un objeto tipo persona
//        Persona personaActualizar = new Persona(4, "juan carlos", "mendez", "jcarlos@gmail.com", "3007475829");
//        personaDao.actualizar(personaActualizar);
        
//        //Eliminando un objeto tipo persona
//        Persona personaEliminar = new Persona(4);
//        personaDao.Eliminar(personaEliminar);
        
        
        List<Persona> personas = personaDao.seleccionar();
//        for(Persona persona: personas){
//            System.out.println("persona: " + persona);
//        }
        personas.forEach(persona -> {
            System.out.println("persona: " + persona);
        });  
    }
}
