package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author Jeferson
 */
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jeferson", 5000);
        System.out.println("empleado1= " + empleado1);
        
        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha, true, "Jeferson", 'M', 30, "Niagara 24A");
        System.out.println("cliente1= " + cliente1);
    }
}                                         
