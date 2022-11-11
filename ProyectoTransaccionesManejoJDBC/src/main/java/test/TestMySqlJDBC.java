package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeferson
 */
public class TestMySqlJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimeZone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true";
        
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "jdmj1234");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_usuario, user, password FROM usuario";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Id Usuario: " + resultado.getInt("id_usuario"));
                System.out.print("User: " + resultado.getString("user"));
                System.out.print("Password: " + resultado.getString("password"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
