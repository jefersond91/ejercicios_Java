package geometria;

/**
 *
 * @author Jeferson
 */
public class PruebaCaja {
    public static void main(String[] args) {
        
        Caja caja1 = new Caja();
//        caja1.ancho = 3;
//        caja1.alto = 2;
//        caja1.profundo = 6;
//        caja1.calcularVolumen(3, 2, 6);
//        System.out.println("ancho: " + caja1.ancho);
//        System.out.println("alto: " + caja1.alto);
//        System.out.println("profundo: " + caja1.profundo);
//        System.out.println("Volumen: " + caja1.calcularVolumen(3, 2, 6));
        
        Caja caja2 = new Caja(3, 2, 6);
        int volumen2 = caja2.calcularVolumen(3, 2, 6);
        System.out.println("Volumen2: " + volumen2);
    }
    
}
