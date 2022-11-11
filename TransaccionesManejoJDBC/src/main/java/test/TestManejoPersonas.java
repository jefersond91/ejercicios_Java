package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
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
            
            PersonaDAO personaDao = new PersonaDAO(conexion);
            
            //actualizar persona
            Persona personaActualizar = new Persona();
            personaActualizar.setIdPersona(2);
            personaActualizar.setNombre("Jefeson");
            personaActualizar.setApellido("Mesa");
            personaActualizar.setEmail("jeferson@gmail.com");
            personaActualizar.setTelefono("3007344140");
            personaDao.actualizar(personaActualizar);
            
            //insertar nueva persona
            Persona personaNueva = new Persona();
            personaNueva.setNombre("Juliana");
            personaNueva.setApellido("Guerrero");
            personaNueva.setEmail("juliana@gmail.com");
            personaNueva.setTelefono("3102365586");
            personaDao.insertar(personaNueva);
            
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
//        Persona personaNueva = new Persona("carlos", "mendez", "carlos@gmail.com", "3007475829");
//        personaDao.insertar(personaNueva);

//Actualizando un objeto tipo persona
//        Persona personaActualizar = new Persona(4, "juan carlos", "mendez", "jcarlos@gmail.com", "3007475829");
//        personaDao.actualizar(personaActualizar);
        
//        //Eliminando un objeto tipo persona
//        Persona personaEliminar = new Persona(4);
//        personaDao.Eliminar(personaEliminar);


//        List<Persona> personas = personaDao.seleccionar();
////        for(Persona persona: personas){
////            System.out.println("persona: " + persona);
////        }
//        personas.forEach(persona -> {
//            System.out.println("persona: " + persona);
//        });  