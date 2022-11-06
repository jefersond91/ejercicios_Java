package genericos;

/**
 *
 * @author Jeferson
 */
public class ClaseGenerica<T> {
    
    private T objeto;
    
    public ClaseGenerica(T objeto){
      this.objeto = objeto;  
    }
    
    public void obtenerTipo(){
        System.out.println("el tipo T es: " + objeto.getClass().getSimpleName());
    }
}
