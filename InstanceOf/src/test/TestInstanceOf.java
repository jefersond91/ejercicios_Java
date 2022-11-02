package test;

import domian.*;

/**
 *
 * @author Jeferson
 */
public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("jeferson", 5000);
        determinarTipo(empleado1);
        Gerente gerente1 = new Gerente("jeferson", 5000, "contabilidad");
        determinarTipo(gerente1);
    }
    
    public static void determinarTipo(Empleado empleado){
        if (empleado instanceof Gerente){
            System.out.println("es de tipo Gerente");
            Gerente gerente = (Gerente) empleado;
            gerente.getDepartamento();
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if (empleado instanceof Empleado){
            System.out.println("es de tipo Empleado");
        }
        else if (empleado instanceof Object){
            System.out.println("es de tipo Object");
        }
    }
}
