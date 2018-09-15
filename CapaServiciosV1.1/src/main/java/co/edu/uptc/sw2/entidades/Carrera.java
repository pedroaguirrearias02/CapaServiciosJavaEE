/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.entidades;

/**
 *
 * @author pedro
 */
public class Carrera {
    
    private String nombre;
    private Facultad facultad;

    /**
     * 
     * @param nombre
     * @param facultad 
     */
    public Carrera(String nombre, Facultad facultad) {
        this.nombre = nombre;
        this.facultad = facultad;
    }
    
    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
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
