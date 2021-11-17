package edu.matc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;


/**
 * The type Reports. This class represents a report on median income of a zip code in a year, including city and state
 * name.
 */
public class Reports {

    private String zipCode;
    private float householdMedianIncome;
    private int year;
    private String state;
    private String city;


    /**
     * Gets zip code.
     *
     * @return the zip code
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets zip code.
     *
     * @param zipCode the zip code
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Gets household median income.
     *
     * @return the household median income
     */
    public float getHouseholdMedianIncome() {
        return householdMedianIncome;
    }

    /**
     * Sets household median income.
     *
     * @param householdMedianIncome the household median income
     */
    public void setHouseholdMedianIncome(float householdMedianIncome) {
        this.householdMedianIncome = householdMedianIncome;
    }

    /**
     * Gets year.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets year.
     *
     * @param year the year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     */
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Reports{" +
                "zipCode= " + zipCode +
                ", householdMedianIncome= " + householdMedianIncome +
                ", year= " + year +
                ", state= '" + state + '\'' +
                ", city= '" + city + '\'' +
                '}';
    }
}

