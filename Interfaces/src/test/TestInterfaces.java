package test;

import accesodatos.*;

/**
 *
 * @author Jeferson
 */
public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMysql();
        //datos.listar();
        imprimir(datos);
        
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
