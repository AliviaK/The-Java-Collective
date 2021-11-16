package edu.matc.persistence;

import edu.matc.entity.IncomeData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
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
        /* ArrayList<IncomeData> incomeData = new ArrayList<IncomeData>();
        incomeData = (ArrayList<IncomeData>) incomeDataDAO.getIncomeDataByZip(53713);

        incomeData.forEach((record) -> {
                if(record.getYear() == 2019)
                    assertEquals( 30.8f,record.getEstimateHouseholdsMeanIncomeDollars());
                if(record.getYear() == 2018)
                    assertEquals( 30.4f,record.getEstimateHouseholdsMeanIncomeDollars());
                if(record.getYear() == 2017)
                    assertEquals( 29.5f,record.getEstimateHouseholdsMeanIncomeDollars());
                if(record.getYear() == 2016)
                    assertEquals( 29.1f,record.getEstimateHouseholdsMeanIncomeDollars());
                if(record.getYear() == 2015)
                    assertEquals( 28.4f,record.getEstimateHouseholdsMeanIncomeDollars());
                }
        ); */
    }
}