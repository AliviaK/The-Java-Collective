package edu.matc.controller;

import Zippopotamus.API.StateCity;
import Zippopotamus.API.ZipCode;
import com.fasterxml.jackson.core.JsonProcessingException;
import edu.matc.entity.IncomeData;
import edu.matc.entity.Reports;
import edu.matc.persistence.IncomeDataDAO;
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



    /**
     * Process zip code and year.
     *
     * @param zipCodeToProcess the zip code to process
     * @param year    the year to return
     * @return the list
     * @throws JsonProcessingException the json processing exception
     */
    public List<Reports> processZipCode(int zipCodeToProcess, int year) throws JsonProcessingException {

        ZippopotamusDAO zippoDAO = new ZippopotamusDAO();

        //setting up the object with API call, zc will contain city/state data
        ZipCode zc = zippoDAO.GetCityState(zipCodeToProcess);
        String city = zc.getPlaces().get(0).getPlaceName();
        String state = zc.getPlaces().get(0).getState();

        //this takes a zip and sends it for processing
        setReport(zipCodeToProcess,state,city,year);

        return reports;
    }



    /**
     * Process state city list.
     *
     * @param state         the state
     * @param city          the city
     * @param year the year to return
     * @return the list
     * @throws JsonProcessingException the json processing exception
     */
    public List<Reports> processStateCity(String state, String city,int year) throws JsonProcessingException {
        ZippopotamusDAO zippoDAO = new ZippopotamusDAO();
        //use the api to get all the zip codes from our city name
        StateCity sc = zippoDAO.GetZipCodes(state,city);

        //find how many zip codes we have
        int numOfZips = sc.getPlaces().size();
        int i = 0;
        logger.info("ProcessStateCity ran with city: "+city+" with this many zip codes:  "+numOfZips);

        //loop through each zip code, sending the zip plus list of years
        //to the set report function

        while (i<numOfZips) {
            setReport(Integer.parseInt(sc.getPlaces().get(i).getPostCode()),state,city,year);
            i++;
        }

        return reports;
    }



    // method takes a single zip code and its city/state data,
    //and loads the income data for the year called
    private void setReport(int zip, String state, String city, int year){
        IncomeDataDAO incomeDataDAO = new IncomeDataDAO();
        ArrayList<IncomeData> incomeData = new ArrayList<IncomeData>();

        incomeData = (ArrayList<IncomeData>) incomeDataDAO.getIncomeData(zip,year);

            Reports report = new Reports();
            report.setZipCode(zip);
            report.setCity(city);
            report.setState(state);
            report.setYear(year);

            report.setHouseholdMedianIncome(incomeData.get(0).getEstimateHouseholdsMedianIncomeDollars());

            reports.add(report);
            logger.info("SetReport ran = new report object: "+report);

        }

    }



}
