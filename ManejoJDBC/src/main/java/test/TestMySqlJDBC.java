package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeferson
 */
public class TestMySqlJDBC {
    public static void main(String[] args) {
       String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimeZone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true";
       try{
           //Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conexion = DriverManager.getConnection(url, "root", "jdmj1234");
           Statement instruccion = conexion.createStatement();
           var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
           ResultSet resultado = instruccion.executeQuery(sql);
           while(resultado.next()){
               System.out.print("Id Persona: " + resultado.getInt("id_persona"));
               System.out.print("Nombfe: " + resultado.getString("nombre"));
               System.out.print("Apellido: " + resultado.getString("apellido"));
               System.out.print("Email: " + resultado.getString("email"));
               System.out.print("Telefono: " + resultado.getString("telefono"));
               System.out.println("");               
           }
           resultado.close();
           instruccion.close();
       }catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
