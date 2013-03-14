/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Alerta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.netbeans.saas.RestResponse;
import org.netbeans.saas.google.GoogleMapService;

/**
 *
 * @author EQUIPO 05
 */
@Stateless
@Path("com.model.alerta")
public class AlertaFacadeREST extends AbstractFacade<Alerta> {

    @PersistenceContext(unitName = "AlertaMiraflores-warPU")
    private EntityManager em;

    public AlertaFacadeREST() {
        super(Alerta.class);
    }

    @POST
    @Override
    @Consumes({"application/json", "application/xml"})
    public void create(Alerta entity) {
        super.create(entity);
    }

    @PUT
    @Override
    @Consumes({"application/json"})
    public void edit(Alerta entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/json"})
    public Alerta find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/json"})
    public List<Alerta> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json"})
    public List<Alerta> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @GET
    @Produces("text/html")
    public String getGoogleMap() {

        try {
            String address = "16 Network Circle, Menlo Park";
            java.lang.Integer zoom = 15;
            String iframe = "false";

            RestResponse result = GoogleMapService.getGoogleMap(address, zoom, iframe);
            return result.getDataAsString();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return "";
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
