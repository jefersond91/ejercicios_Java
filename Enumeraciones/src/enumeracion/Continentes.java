package enumeracion;

/**
 *
 * @author Jeferson
 */
public enum Continentes {
    AFRICA(42),
    AMERICA(44),
    ASIA(13),
    EUROPA(23),
    OCEANIA(5);
    
    private final int paises;
    
    Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
