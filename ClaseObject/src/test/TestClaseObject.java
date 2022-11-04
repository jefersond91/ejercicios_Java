package test;

import domian.*;

/**
 *
 * @author Jeferson
 */
public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jeferson", 5000);
        Empleado empleado2 = new Empleado("jeferson", 5000);
        
        System.out.println("empleado1: " + empleado1);
        System.out.println("empleado2: " + empleado2);
        
        if(empleado1 == empleado2){
            System.out.println("tienen la misma referencia en memoria"); 
        }
        else{
            System.out.println("tienen distinta referencia en memoria");
        }
        
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        }
        else{
            System.out.println("Los objetos son distintos en contenido");
        }
        
        System.out.println(empleado1.hashCode());
        System.out.println(empleado2.hashCode());
            
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("el valor hashcode es igual");
        }
        else{
            System.out.println("el valor hascode es distinto");
        }
        
        
        
    }
}
