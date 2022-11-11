package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeferson
 */
public class TestManejoUsuarios {
    public static void main(String[] args) {
        
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);
            
            //actualizar un usuario
            Usuario usuarioActualizar = new Usuario();
            usuarioActualizar.setIdUsuario(2);
            usuarioActualizar.setUser("Jefersond");
            usuarioActualizar.setPassword("12345");
            usuarioDao.actualizar(usuarioActualizar);

            //insertar nuevo usuario
            Usuario usuarioNuevo = new Usuario();
            usuarioNuevo.setUser("Artemisa");
            usuarioNuevo.setPassword("54321");
            usuarioDao.insertar(usuarioNuevo);
            
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
