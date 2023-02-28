
/**
 * Write a description of class club here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // instance variables - replace the example below with your own
    private String denomClub;
    private boolean sancionado;

    /**
     * Constructor for objects of class club
     */
    public Club()
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
    public void imprimirDetalles(){
        System.out.println("Club: " + denomClub + "Sancionado: " + sancionado);
    }
}
