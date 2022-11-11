package test;

import datos.Conexion;
import datos.IPersonaDao;
import datos.PersonaDAO;
import domain.PersonaDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;


/**
 *
 * @author Jeferson
 */
public class TestManejoPersonas {
    public static void main(String[] args) {
        
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnetion();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            IPersonaDao personaDao = new PersonaDAO(conexion);
            
            List<PersonaDTO> personas = personaDao.seleccionar();
            
            for(PersonaDTO persona: personas){
                System.out.println("PersonaDTO: " + persona);
            }
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}

            //Insertando un nuevo objeto de tipo persona
//        PersonaDTO personaNueva = new PersonaDTO("carlos", "mendez", "carlos@gmail.com", "3007475829");
//        personaDao.insertar(personaNueva);

//Actualizando un objeto tipo persona
//        PersonaDTO personaActualizar = new PersonaDTO(4, "juan carlos", "mendez", "jcarlos@gmail.com", "3007475829");
//        personaDao.actualizar(personaActualizar);
        
//        //Eliminando un objeto tipo persona
//        PersonaDTO personaEliminar = new PersonaDTO(4);
//        personaDao.Eliminar(personaEliminar);


//        List<Persona> personas = personaDao.seleccionar();
////        for(PersonaDTO persona: personas){
////            System.out.println("persona: " + persona);
////        }
//        personas.forEach(persona -> {
//            System.out.println("persona: " + persona);
//        });  