/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Materia;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author PEDRO
 */
@Path("ServicioMateria")
public class ServicioMateria {
    @GET
    public ArrayList<Materia> getMaterias(){
        return Almacenamiento.getInstance().getListMaterias();
    }
    
    @POST
    public Materia guardarMaterias(Materia materia) {
        Almacenamiento.getInstance().getListMaterias().add(materia);
        return materia;
    }
}
