package edu.matc.controller;

import Zippopotamus.API.ZipCode;
import com.fasterxml.jackson.core.JsonProcessingException;
import edu.matc.entity.Reports;
import edu.matc.persistence.ZippopotamusDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
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
        // h.add(ReportsResource.class );
        return h;
    }
    private final Logger logger = LogManager.getLogger(this.getClass());

    //method takes zipcode and collects data from api / db
    //data  is then set into Reports object

    public List<Reports> processZipCode(int zipCodeToProcess, List<Integer> yearsToReturn) throws JsonProcessingException {
        ZippopotamusDAO zippoDAO = new ZippopotamusDAO();
        List<Reports> reports = new ArrayList<>();
        Reports report = null;
        //setting up the object with API call, zc will contain city/state data
        ZipCode zc = zippoDAO.GetCityState(String.valueOf(zipCodeToProcess));

        //loop through years to setup Reports object

        int numOfYears = yearsToReturn.size();
        int i = 0;

        logger.info("Years (how many) sent to processZipCode: "+numOfYears);
        logger.info("Years 0: "+yearsToReturn.get(0));
        logger.info("Years 1 "+yearsToReturn.get(1));
        logger.info("Years2: "+yearsToReturn.get(2));

        while (i<numOfYears) {
            report = new Reports();
            report.setZipCode(zipCodeToProcess);
            report.setCity(zc.getPlaces().get(0).getPlaceName());
            report.setState(zc.getPlaces().get(0).getState());
            report.setYear(yearsToReturn.get(i));
            // reports.setHouseholdMedianIncome();

            reports.add(report);
            logger.info("addad a new report: "+report);
            i++;
        }

        logger.info("report 0: "+reports.get(0));
        logger.info("r 1 "+reports.get(1));
        logger.info("r 2 : "+reports.get(2));


        return reports;
    }












}