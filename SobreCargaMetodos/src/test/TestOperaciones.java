package test;

import operaciones.Operaciones;

/**
 *
 * @author Jeferson
 */
public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado int= " + resultado);
        
        resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado double= " + resultado);

    }
}
