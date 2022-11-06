package test;

import static manejoarchivos.ManejoArchivos.*;

/**
 *
 * @author Jeferson
 */
public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);
        
//        anexarArchivo(nombreArchivo, "Hola desde Java");
//        anexarArchivo(nombreArchivo, "adios desde Java");

        leerArchivo(nombreArchivo);
    }
}
