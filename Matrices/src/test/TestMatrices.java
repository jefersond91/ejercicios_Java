package test;

import domain.Persona;

/**
 *
 * @author Jeferson
 */
public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int [3][2];
//        System.out.println("edades: " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 2;
        edades[2][1] = 1;
        
//        for(int ren = 0; ren < edades.length; ren++){
//            for(int col = 0; col < edades[ren].length; col++){
//                System.out.println("edades for anidado " + ren + "_"+ col + ": " + edades[ren][col]);
//            }
//        }
        
        String frutas[][] = {{"naranja","limon","lima"},{"banano","fresa","frambuesa"},{"zarzamora","cereza","mora"}};
        imprimir(frutas);
//        for (int ren = 0; ren < frutas.length; ren++) {
//            for (int col = 0; col < frutas[ren].length; col++) {
//                System.out.println("frutas for anidado " + ren + "_"+ col + ": " + frutas[ren][col]);
//            }
//            
//        }
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("jeferson");
        personas[0][1] = new Persona("david");
        personas[0][2] = new Persona("angie");
        personas[1][0] = new Persona("juliana");
        personas[1][1] = new Persona("carlos");
        personas[1][2] = new Persona("julian");
        
        imprimir(personas);
        
        
        
        
    }
        public static void imprimir(Object matriz[][]){           
            for (int ren = 0; ren < matriz.length; ren++) {
                for (int col = 0; col < matriz[ren].length; col++) {
                    System.out.println("matriz" + ren + "_"+ col + ": " + matriz[ren][col]);
                }
            }
        }
}
