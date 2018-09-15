/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.entidades;

import java.util.Date;

/**
 *
 * @author pedro
 */
public class Estudiante {
    
    private String nombre;
    private String apellidos;
    private String codigo;
    private String documento;
    private Date fechaNacimiento;
    private Carrera carrera;
    private Municipio municipio;

    public Estudiante(String nombre, String apellidos, String codigo, String documento, Date fechaNacimiento, Carrera carrera, Municipio municipio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
        this.municipio = municipio;
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

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the carrera
     */
    public Carrera getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the municipio
     */
    public Municipio getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
}
