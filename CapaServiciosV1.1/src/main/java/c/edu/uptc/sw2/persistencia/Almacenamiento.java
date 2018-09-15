/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c.edu.uptc.sw2.persistencia;

import co.edu.uptc.sw2.entidades.Carrera;
import co.edu.uptc.sw2.entidades.Estudiante;
import co.edu.uptc.sw2.entidades.Facultad;
import co.edu.uptc.sw2.entidades.Horario;
import co.edu.uptc.sw2.entidades.Materia;
import co.edu.uptc.sw2.entidades.Matricula;
import co.edu.uptc.sw2.entidades.Municipio;
import co.edu.uptc.sw2.entidades.Profesor;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Almacenamiento {
    
    private static final Almacenamiento INSTANCE = new Almacenamiento();
    private ArrayList<Estudiante> listEstudiantes;
    private ArrayList<Carrera> listCarreras;
    private ArrayList<Facultad> listFacultads;
    private ArrayList<Materia> listMaterias;
    private ArrayList<Matricula> listMatriculas;
    private ArrayList<Municipio> listMunicipios;
    private ArrayList<Profesor> listProfesors;
    private ArrayList<Horario> listHorarios;

    public Almacenamiento() {
        this.listEstudiantes = new ArrayList<>();
        this.listCarreras = new ArrayList<>();
        this.listFacultads = new ArrayList<>();
        this.listMaterias = new ArrayList<>();
        this.listMatriculas = new ArrayList<>();
        this.listMunicipios = new ArrayList<>();
        this.listProfesors = new ArrayList<>();
        this.listHorarios = new ArrayList<>();
        
        listFacultads.add(new Facultad("Ingenieria"));
        listFacultads.add(new Facultad("Medicina"));
        listFacultads.add(new Facultad("Derecho"));
        listFacultads.add(new Facultad("Ciencias Basicas"));
        listFacultads.add(new Facultad("Artes"));
        listCarreras.add(new Carrera("Ingenieria de Sistemas", listFacultads.get(0)));
        listEstudiantes.add(new Estudiante("Daniela", "Torres", "2015", "1233", null, null, null));
    }

    public void eleminarFacultad(Facultad facultad){
        for (Facultad facultad1 : listFacultads) {
            if (facultad1.getNombre().equals(facultad.getNombre())) {
                listFacultads.remove(facultad1);
            }
        }
    }

    /**
     * @return the listCarreras
     */
    public ArrayList<Carrera> getListCarreras() {
        return listCarreras;
    }

    /**
     * @param listCarreras the listCarreras to set
     */
    public void setListCarreras(ArrayList<Carrera> listCarreras) {
        this.listCarreras = listCarreras;
    }

    /**
     * @return the listFacultads
     */
    public ArrayList<Facultad> getListFacultads() {
        return listFacultads;
    }

    /**
     * @param listFacultads the listFacultads to set
     */
    public void setListFacultads(ArrayList<Facultad> listFacultads) {
        this.listFacultads = listFacultads;
    }

    /**
     * @return the listMaterias
     */
    public ArrayList<Materia> getListMaterias() {
        return listMaterias;
    }

    /**
     * @param listMaterias the listMaterias to set
     */
    public void setListMaterias(ArrayList<Materia> listMaterias) {
        this.listMaterias = listMaterias;
    }

    /**
     * @return the listMatriculas
     */
    public ArrayList<Matricula> getListMatriculas() {
        return listMatriculas;
    }

    /**
     * @param listMatriculas the listMatriculas to set
     */
    public void setListMatriculas(ArrayList<Matricula> listMatriculas) {
        this.listMatriculas = listMatriculas;
    }

    /**
     * @return the listMunicipios
     */
    public ArrayList<Municipio> getListMunicipios() {
        return listMunicipios;
    }

    /**
     * @param listMunicipios the listMunicipios to set
     */
    public void setListMunicipios(ArrayList<Municipio> listMunicipios) {
        this.listMunicipios = listMunicipios;
    }

    /**
     * @return the listProfesors
     */
    public ArrayList<Profesor> getListProfesors() {
        return listProfesors;
    }

    /**
     * @param listProfesors the listProfesors to set
     */
    public void setListProfesors(ArrayList<Profesor> listProfesors) {
        this.listProfesors = listProfesors;
    }

    public static Almacenamiento getInstance(){
        return INSTANCE;
    }

    public ArrayList<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public ArrayList<Horario> getListHorarios() {
        return listHorarios;
    }

    public void setListHorarios(ArrayList<Horario> listHorarios) {
        this.listHorarios = listHorarios;
    }
    
}
