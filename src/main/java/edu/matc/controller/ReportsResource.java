package edu.matc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.matc.entity.*;
import edu.matc.persistence.GenericDao;
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
    GenericDao reportsDao = new GenericDao(Reports.class);


    /**
     * Return data of specified zip
     *
     * @param zipCode the zip
     * @return the data by zip
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/zipCodes/{zipCode}")
    public Response getDataByZip(@PathParam("zipCode") int zipCode) throws JsonProcessingException {
        ProcessReports pr = new ProcessReports();
        List<Reports> reports = pr.processZipCode(zipCode);


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
    @Path("/cities/{city}/{state}")
    public Response getDataByCity(@PathParam("city") String city, @PathParam("state") String state) {
        ArrayList<Reports> reportsOfCity = (ArrayList<Reports>) reportsDao.getByPropertyEqual("city", city, Reports.class);
        ArrayList<Reports> reportsOfCityState = new ArrayList<>();
        for (Reports report: reportsOfCity
             ) {
            if ((reportsDao.getByPropertyEqual("state", state, Reports.class).equals(state))){
                reportsOfCityState.add(report);
            }
        }
        if (reportsOfCityState != null) {
            return Response.ok(reportsOfCityState, MediaType.APPLICATION_JSON).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}