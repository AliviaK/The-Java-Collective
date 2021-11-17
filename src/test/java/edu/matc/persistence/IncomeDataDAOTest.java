package edu.matc.persistence;

import edu.matc.entity.IncomeData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains tests for the IncomeData database DAO
 * @author John Oliver
 */
class IncomeDataDAOTest {

    private edu.matc.persistence.IncomeDataDAO incomeDataDAO;

    private final Logger logger = LogManager.getLogger(this.getClass());

    @BeforeEach
    void setUp() {
        this.incomeDataDAO = new IncomeDataDAO();

    }

    /** Tests to ensure that lookup by zip code works.
     *
     */
    @Test
    void getIncomeDataByZip() {
        ArrayList<IncomeData> incomeData = new ArrayList<IncomeData>();

        incomeData = (ArrayList<IncomeData>) incomeDataDAO.getIncomeData(53713);

        incomeData.forEach((record) -> {
                if(record.getYear() == 2019)
                    assertEquals( (Float)59961f,record.getEstimateHouseholdsMeanIncomeDollars());
                if(record.getYear() == 2018)
                    assertEquals( (Float)58261f,record.getEstimateHouseholdsMeanIncomeDollars());
                if(record.getYear() == 2017)
                    assertEquals( (Float)54271f,record.getEstimateHouseholdsMeanIncomeDollars());
                if(record.getYear() == 2016)
                    assertEquals( (Float)50816f,record.getEstimateHouseholdsMeanIncomeDollars());
                if(record.getYear() == 2015)
                    assertEquals( (Float)49437f,record.getEstimateHouseholdsMeanIncomeDollars());
                }
        );
    }

    /**
     *  Test lookup by year and zip code.
     */
    @Test
    void getIncomeData() {

        ArrayList<IncomeData> incomeData = new ArrayList<IncomeData>();

        incomeData = (ArrayList<IncomeData>) incomeDataDAO.getIncomeData(53713, 2018);

        incomeData.forEach((record) -> {
                    if(record.getYear() == 2018)
                        assertEquals( (Float)58261f,record.getEstimateHouseholdsMeanIncomeDollars());
                    logger.debug("Record Data: " + record.getYear() +" "+ record.getZipCode() +" "+ record.getEstimateHouseholdsMeanIncomeDollars());
                }
        );
    }

//    @Test
//    void testGetIncomeData() {
//
//        ArrayList<Integer> zips = new ArrayList<>();
//        zips.add(600086);
//        zips.add(60415);
//        zips.add(60602);
//        zips.add(60604);
//
//        ArrayList<Integer> years = new ArrayList<>();
//        years.add(2019);
//        years.add(2018);
//        years.add(2017);
//        years.add(2016);
//        years.add(2015);
//
//        ArrayList<IncomeData> incomeData = new ArrayList<>();
//        incomeData = (ArrayList<IncomeData>) incomeDataDAO.getIncomeData(zips,years);
//
//        incomeData.forEach((dataum) -> {
//            logger.info("Year: " + dataum.getYear() + " Zip: " + dataum.getZipCode() + " Income: " + dataum.getEstimateHouseholdsMeanIncomeDollars());
//
//        });
//
//    }
}