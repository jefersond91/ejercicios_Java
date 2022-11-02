package test;

/**
 *
 * @author Jeferson
 */
public class TestArgumentosVariables {
    public static void main(String[] args) {
//        imprimirNumeros(5, 4, 3, 2);
//        imprimirNumeros(1);
        
        variosParametros("jeferson", 5, 4, 3, 2);
    }
    
    private static void variosParametros(String nombre, int...numeros){
        System.out.println("nombre: " + nombre);
        imprimirNumeros(numeros);
        
    }
    
    private static void imprimirNumeros(int...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento " + i + ": " + numeros[i]);
        }
    }
}
