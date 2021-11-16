package edu.matc.controller;

import Zippopotamus.API.StateCity;
import Zippopotamus.API.ZipCode;
import com.fasterxml.jackson.core.JsonProcessingException;
import edu.matc.entity.Reports;
import edu.matc.persistence.ZippopotamusDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Defines the base URI for all resource URIs.
@ApplicationPath("/services")

//The java class declares root resource and provider classes
public class ReportsApplication extends Application {

    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(ReportsResource.class );
        return h;
    }


}