package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author Jeferson
 */
public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
//        //Insertar nuevo objeto tipo usuario
//        Usuario usuarioNuevo = new Usuario("soet123", "12hfh45");
//        usuarioDao.insertar(usuarioNuevo);
        
//        //Actualizar un objeto tipo usuario
//        Usuario usaurioActualizar = new Usuario(1, "jd1991", "54321");
//        usuarioDao.actualizar(usaurioActualizar);
//        
        //Eliminar un objeto tipo usuario
        Usuario usuarioEliminar = new Usuario(1);
        usuarioDao.Eliminar(usuarioEliminar);
        
        //Listar los usuarios
        List<Usuario> usuarios = usuarioDao.seleccionar();
        usuarios.forEach(usuario ->{
            System.out.println("Usuario: " + usuario);
        });
    }
}
