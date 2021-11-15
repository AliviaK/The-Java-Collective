package edu.matc.entity;

import edu.matc.persistence.GenericDao;
import edu.matc.persistence.IncomeDataDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IncomeDataTest {

    IncomeDataDAO incomeDataDAO;

    @BeforeEach
    void setUp() {
        incomeDataDAO = new IncomeDataDAO();
    }


}