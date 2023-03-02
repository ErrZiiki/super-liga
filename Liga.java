

public class Liga
{
    private String nombre;
    
    private int maxClubes;
    
    private Club equipo;
    
    
    /**
     * Constructor for objects of class liga
     */
    public Liga(String nombre, int max, Club equipo)
    {
        this.nombre = nombre;
        maxClubes = max;
        this.equipo = equipo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getmaxClubes(){
        return maxClubes;
    }
    
    public Club getEquipo(){
        return equipo;
    }
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    public void setMaxClubes(int maxClubes){
        this.maxClubes = maxClubes;
    }
    public void setEquipo(Club nuevoEquipo){
        equipo = nuevoEquipo;
    }
}
