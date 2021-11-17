package edu.matc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.matc.entity.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

// Class to be filled out
@Path("/reports")
public class ReportsResource {
    private final Logger logger = LogManager.getLogger(this.getClass());
    // Dao to create/read/update/delete database info
    ProcessReports pr = new ProcessReports();


    /**
     * Return data of specified zip
     *
     * @param zipCode the zip
     * @return the data by zip
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/zip-codes/{zipCode}")
    public Response getDataByZip(@PathParam("zipCode") int zipCode,
                                 @QueryParam("year") @DefaultValue("2019") int year) throws JsonProcessingException {
        List<Reports> reports = pr.processZipCode(zipCode, year);

        if (reports != null) {
            return Response.ok(reports, MediaType.APPLICATION_JSON).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

    }


    /**
     * Return data of specified city for each zip
     *
     * @param city the city
     * @return the list of zip codes and data within city
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/cities/{state}/{city}")
    public Response getDataByCity(@PathParam("state") String state,
                                  @PathParam("city") String city,
                                  @QueryParam("year") @DefaultValue("2019") int year) throws JsonProcessingException {
        List<Reports> reportsOfStateCity = pr.processStateCity(state, city, year);

        if (reportsOfStateCity != null) {
            return Response.ok(reportsOfStateCity, MediaType.APPLICATION_JSON).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}