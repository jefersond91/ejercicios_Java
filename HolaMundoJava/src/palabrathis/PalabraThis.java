package palabrathis;

/**
 *
 * @author Jeferson
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jeferson", "Mesa");
        System.out.println("persona1: " + persona1);
        System.out.println("persona1: " + persona1.nombre +" "+ persona1.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println(this.nombre +" "+ this.apellido);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona persona1){
        System.out.println("persona 1 desde imprimir" + persona1);
        System.out.println("impresion del objeto actual(this)" + this);
    }
}
