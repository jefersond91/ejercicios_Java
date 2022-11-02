package paquete1;

/**
 *
 * @author Jeferson
 */
//public class Clase1 {
class Clase1 {
//    public String atributoPublico = "valor atributo publico";
//    protected String atributoProtected = "valor atributo protected";
//    String atributoDefault = "valor atributo default";
    private String atributoprivate = "valor atributo private";
    
//    public Clase1(){
//        System.out.println("constructor publico");
//    }
    
//    protected Clase1(){
//        System.out.println("constructor protected");
//    }
    
//    Clase1(){
//        System.out.println("constructor default");
//    }
    
    private Clase1(){
        System.out.println("constructor private");
    }
    public Clase1(String argumento){
        this();
        System.out.println("constructor publico");
    }
    
//    public void metodoPublico(){
//        System.out.println("metodo publico");
//    }
    
//    protected void metodoProtected(){
//        System.out.println("metodo protected");
//    }
    
//    void metodoDefault(){
//        System.out.println("Metodo default");
//    }
    
    private void metodoPrivate(){
        System.out.println("Metodo private");
    }

    public String getAtributoprivate() {
        return atributoprivate;
    }

    public void setAtributoprivate(String atributoprivate) {
        this.atributoprivate = atributoprivate;
    }
    
    
}
