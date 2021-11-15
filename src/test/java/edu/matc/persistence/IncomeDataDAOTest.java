package edu.matc.persistence;

import edu.matc.entity.IncomeData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utility.Database;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IncomeDataDAOTest {

    private edu.matc.persistence.IncomeDataDAO incomeDataDAO;


    private final Logger logger = LogManager.getLogger(this.getClass());

    @BeforeEach
    void setUp() {
        this.incomeDataDAO = new IncomeDataDAO();
        utility.Database database = Database.getInstance();

    }

    @Test
    void getIncomeDataByZip() {
        ArrayList<IncomeData> incomeData = new ArrayList<IncomeData>();
        incomeData = (ArrayList<IncomeData>) incomeDataDAO.getIncomeDataByZip(53713);

        incomeData.forEach((record) -> {
                    if(record.getYear() == 2019)
                        assertEquals(record.getEstimateHouseholdsMeanIncomeDollars(), 9799.00f);

                }
        );
    }
}