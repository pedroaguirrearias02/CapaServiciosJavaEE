/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.entidades;

/**
 *
 * @author PEDRO
 */
public class Horario {

    public Horario(int dia, int horaInicio, int horaFin) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the horaInicio
     */
    public int getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFin
     */
    public int getHoraFin() {
        return horaFin;
    }

    /**
     * @param horaFin the horaFin to set
     */
    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }
    
    private int dia;
    private int horaInicio;
    private int horaFin;
}
