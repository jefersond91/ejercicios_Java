package operaciones;

/**
 *
 * @author Jeferson
 */
public class Aritmetica {
    int a;
    int b;
    
    //constructor vacio
    public Aritmetica(){
        
    }
    
    //constructor con parametros
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con arg");
    }
    
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
        
    }
    
}
