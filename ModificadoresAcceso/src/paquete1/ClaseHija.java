package paquete1;

import paquete1.Clase1;

/**
 *
 * @author Jeferson
 */
public class ClaseHija extends Clase1{
    public ClaseHija(){
//        super();
//        System.out.println("atributoProtected = " + this.atributoProtected);
//        this.atributoProtected = "modificacion atributo protected";
//        System.out.println("atributoProtected = " + this.atributoProtected);
//        this.metodoProtected();

//        super();
//        System.out.println("atributoDefault = " + this.atributoDefault);
//        this.atributoDefault = "modificacion atributo default";
//        System.out.println("atributoDefault = " + this.atributoDefault);
        
        super("publico");
        System.out.println("atributoPrivate = " + this.getAtributoprivate());
        
        
    }
}
