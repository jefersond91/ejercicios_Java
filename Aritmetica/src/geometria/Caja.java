package geometria;

/**
 *
 * @author Jeferson
 */
public class Caja {
   //atributos
    int ancho;
    int alto;
    int profundo;
    
    //constructor vacio
    public Caja(){
        
    }
    
    public Caja(int ancho, int alto, int profundo){
       this.ancho = ancho;
       this.alto = alto;
       this.profundo = profundo;
       System.out.println("Ejecutando constructor con arg");
    }
    
    public int calcularVolumen(int ancho, int alto, int profundo){
        return this.ancho * this.alto * this.profundo;
    }
    
    
}
