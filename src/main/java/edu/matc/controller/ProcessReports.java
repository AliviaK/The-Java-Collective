package edu.matc.controller;

import Zippopotamus.API.StateCity;
import Zippopotamus.API.ZipCode;
import com.fasterxml.jackson.core.JsonProcessingException;
import edu.matc.entity.Reports;
import edu.matc.persistence.ZippopotamusDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


/**
 * The class to process reports data.
 */
public class ProcessReports {
    private final Logger logger = LogManager.getLogger(this.getClass());
    //each zip code and year is a new report object.  this is
    //a list to hold them all
    private List<Reports> reports = new ArrayList<>();

    //method takes zipcode and list of years and returns all
    //the objects

    /**
     * Process zip code list.
     *
     * @param zipCodeToProcess the zip code to process
     * @param yearsToReturn    the years to return
     * @return the list
     * @throws JsonProcessingException the json processing exception
     */
    public List<Reports> processZipCode(int zipCodeToProcess, List<Integer> yearsToReturn) throws JsonProcessingException {

        ZippopotamusDAO zippoDAO = new ZippopotamusDAO();

        //setting up the object with API call, zc will contain city/state data
        ZipCode zc = zippoDAO.GetCityState(zipCodeToProcess);
        String city = zc.getPlaces().get(0).getPlaceName();
        String state = zc.getPlaces().get(0).getState();

        //this takes a zip and sends it for processing
        setReport(zipCodeToProcess,state,city,yearsToReturn);

        return reports;
    }

    /**
     * Process zip code list. Overloaded to exclude year
     *
     * @param zipCodeToProcess the zip code to process
     * @return the list
     * @throws JsonProcessingException the json processing exception
     */
    public List<Reports> processZipCode(int zipCodeToProcess) throws JsonProcessingException {

        ZippopotamusDAO zippoDAO = new ZippopotamusDAO();

        //setting up the object with API call, zc will contain city/state data
        ZipCode zc = zippoDAO.GetCityState(zipCodeToProcess);
        String city = zc.getPlaces().get(0).getPlaceName();
        String state = zc.getPlaces().get(0).getState();

        //this takes a zip and sends it for processing
        setReport(zipCodeToProcess,state,city);

        return reports;
    }

    /**
     * Process state city list.
     *
     * @param state         the state
     * @param city          the city
     * @param yearsToReturn the years to return
     * @return the list
     * @throws JsonProcessingException the json processing exception
     */
    public List<Reports> processStateCity(String state, String city,List<Integer> yearsToReturn) throws JsonProcessingException {
        ZippopotamusDAO zippoDAO = new ZippopotamusDAO();
        //use the api to get all the zip codes from our city name
        StateCity sc = zippoDAO.GetZipCodes(state,city);

        //find how many zip codes we have
        int numOfZips = sc.getPlaces().size();
        int i = 0;
        logger.info("Zip codes (total count) from state / city : "+numOfZips);

        //loop through each zip code, sending the zip plus list of years
        //to the set report function

        while (i<numOfZips) {
            setReport(Integer.parseInt(sc.getPlaces().get(i).getPostCode()),state,city,yearsToReturn);
            i++;
        }

        return reports;
    }

    /**
     * Process state city list. Overloaded to exclude year
     *
     * @param state         the state
     * @param city          the city
     * @return the list
     * @throws JsonProcessingException the json processing exception
     */
    public List<Reports> processStateCity(String state, String city) throws JsonProcessingException {
        ZippopotamusDAO zippoDAO = new ZippopotamusDAO();

        //use the api to get all the zip codes from our city name
        StateCity sc = zippoDAO.GetZipCodes(state,city);

        //find how many zip codes we have
        int numOfZips = sc.getPlaces().size();
        int i = 0;
        logger.info("Zip codes (total count) from state / city : "+numOfZips);

        //loop through each zip code, sending the zip plus list of years
        //to the set report function

        while (i<numOfZips) {
            setReport(Integer.parseInt(sc.getPlaces().get(i).getPostCode()),state,city);
            i++;
        }

        return reports;
    }

    // method takes a single zip code and its city/state data,
    //then looks at each year in the list, loads the income
    //for each combo and sets into the object

    private void setReport(int zip, String state, String city, List<Integer> yearsToReturn){

        int numOfYears = yearsToReturn.size();
        int i = 0;
        logger.info("Years (total count) sent to setReport: "+numOfYears);
        while (i<numOfYears) {
            Reports report = new Reports();
            report.setZipCode(zip);
            report.setCity(city);
            report.setState(state);
            report.setYear(yearsToReturn.get(i));

            //JOHN - here we can call your database DAO
            //with a zipcode / year, were in a loop already
            //so we can just use the local variables in this loop

            //report.setHouseholdMedianIncome(JohnsRadDAO(zip,year));


            reports.add(report);
            logger.info("SetReport ran = new report object: "+report);
            i++;
        }

    }

    // Overload method without year param
    private void setReport(int zip, String state, String city){

        int numOfYears = 1;

        Reports report = new Reports();
        report.setZipCode(zip);
        report.setCity(city);
        report.setState(state);
        // Hardcoded most recent year TODO: fix
        report.setYear(2020);

        //JOHN - here we can call your database DAO
        //with a zipcode / year, were in a loop already
        //so we can just use the local variables in this loop

        //report.setHouseholdMedianIncome(JohnsRadDAO(zip,year));


        reports.add(report);
        logger.info("SetReport ran = new report object: "+report);

    }

}
