
/**
 * Write a description of class club here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class club
{
    // instance variables - replace the example below with your own
    private String denomClub;
    private boolean sancionado;

    /**
     * Constructor for objects of class club
     */
    public club()
    {
        
    }
    public String getDenomClub(){
        return denomClub;
    }
    
    public void setDenomClub(String nuevoNombre){
        denomClub = nuevoNombre;
    }
    
    public boolean getSancionado(){
        return sancionado;
    }
    
    public void setSancionado(boolean sancionar){
        sancionado=sancionar;
    }
}
