

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
}
