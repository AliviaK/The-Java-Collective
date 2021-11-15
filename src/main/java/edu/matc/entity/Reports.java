package edu.matc.entity;

import java.math.BigDecimal;

// Income Data object I named Reports but can be refactored if there is a better name for it
public class Reports {

    private int zipCode;
    private float householdMedianIncome;
    private int year;
    private String state;
    private String city;

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
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
                "zipCode=" + zipCode +
                ", householdMedianIncome=" + householdMedianIncome +
                ", year=" + year +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
