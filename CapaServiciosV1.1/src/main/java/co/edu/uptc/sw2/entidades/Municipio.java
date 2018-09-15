package co.edu.uptc.sw2.entidades;

/**
 *
 * @author pedro
 */
public class Municipio {
    
    private String nombre;

    public Municipio(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
