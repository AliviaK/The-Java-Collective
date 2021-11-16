package edu.matc.entity;

import edu.matc.persistence.IncomeDataDAO;
import org.junit.jupiter.api.BeforeEach;

// Did I make this? TODO: delete?
class IncomeDataTest {

    IncomeDataDAO incomeDataDAO;

    @BeforeEach
    void setUp() {
        incomeDataDAO = new IncomeDataDAO();
    }


}