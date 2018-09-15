/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Municipio;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author PEDRO
 */
@Path("ServicioMunicipio")
public class ServicioMiunicipio {
    @GET
    public ArrayList<Municipio> getMunicipio(){
        return Almacenamiento.getInstance().getListMunicipios();
    }
    
    @POST
    public Municipio guardarMunicipio(Municipio municipio) {
        Almacenamiento.getInstance().getListMunicipios().add(municipio);
        return municipio;
    }
}
