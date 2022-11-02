package test;

/**
 *
 * @author Jeferson
 */
public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero double = " + entero.doubleValue());
        
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
    }
}
