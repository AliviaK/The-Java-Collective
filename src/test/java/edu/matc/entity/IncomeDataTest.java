package edu.matc.entity;

import edu.matc.persistence.IncomeDataDAO;
import org.junit.jupiter.api.BeforeEach;

class IncomeDataTest {

    IncomeDataDAO incomeDataDAO;

    @BeforeEach
    void setUp() {
        incomeDataDAO = new IncomeDataDAO();
    }


}