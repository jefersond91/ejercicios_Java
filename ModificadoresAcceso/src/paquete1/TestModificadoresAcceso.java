package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

/**
 *
 * @author Jeferson
 */
public class TestModificadoresAcceso {
    public static void main(String[] args) {
//        Clase1 clase1 = new Clase1();
//        System.out.println("clase1 = " + clase1);
//        System.out.println("clase1 atributo = " + clase1.atributoProtected);
//        
//        clase1.metodoProtected();
        
        Clase1 clase1 = new Clase1("publico");
        System.out.println("clase1 = " + clase1);
        clase1.getAtributoprivate();
        System.out.println("clase1 atributo private = " + clase1.getAtributoprivate());
        clase1.setAtributoprivate("modificacion atributo private");
        System.out.println("clase1 atributo private = " + clase1.getAtributoprivate());
    }
}
