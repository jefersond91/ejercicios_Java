package test;

import java.util.*;

/**
 *
 * @author Jeferson
 */
public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        //imprimir(miLista);
        
//        for(Object elemento: miLista){
//            System.out.println("forEach tradicional - Dia: " + elemento);
//        }
//
//        //Expresion lambda recorrer ArrayList forEach
//        miLista.forEach(elemento -> {
//            System.out.println("forEach Lambda - Dia: " + elemento);
//                });
        
        Set miSet = new HashSet();
        miSet.add("lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        //imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("key1", "jeferson");
        miMapa.put("key2", "julian");
        miMapa.put("key3", "juliana");
        miMapa.put("key4", "phamela");
        
        //acceder al valor de un key
        String elemento = (String) miMapa.get("key1");
        //System.out.println("elemento: " + elemento);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection coleccion){
        for(Object elemento: coleccion){
            System.out.println("elemento: " + elemento);
        }
    }
}
