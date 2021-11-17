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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public float getHouseholdMedianIncome() {
        return householdMedianIncome;
    }

    public void setHouseholdMedianIncome(float householdMedianIncome) {
        this.householdMedianIncome = householdMedianIncome;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

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

