package test;

import java.util.*;

/**
 *
 * @author Jeferson
 */
public class TestColeccionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
//        String elemento = miLista.get(1);
//        System.out.println("elemento: " + elemento);
        
        imprimir(miLista);
        
//        for(Object elemento: miLista){
//            System.out.println("forEach tradicional - Dia: " + elemento);
//        }
//
//        //Expresion lambda recorrer ArrayList forEach
//        miLista.forEach(elemento -> {
//            System.out.println("forEach Lambda - Dia: " + elemento);
//                });
        
        Set<String> miSet = new HashSet<>();
        miSet.add("lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("key1", "jeferson");
        miMapa.put("key2", "julian");
        miMapa.put("key3", "juliana");
        miMapa.put("key4", "phamela");
        
        //acceder al valor de un key
        String elementoMapa = miMapa.get("key1");
        System.out.println("elemento: " + elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection<String> coleccion){
        for(String elemento: coleccion){
            System.out.println("elemento: " + elemento);
        }
    }
}
