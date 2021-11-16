package edu.matc.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Represents data from the income_data table.
 */
@Entity
@Table(name = "income_data")
public class IncomeData {
    @Id
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "estimate_households_total")
    private Float estimateHouseholdsTotal;

    @Column(name = "estimate_households_total_less_than_10000")
    private Float estimateHouseholdsTotalLessThan10000;

    @Column(name = "estimate_households_total_10000_to_14999")
    private Float estimateHouseholdsTotal10000To14999;

    @Column(name = "estimate_households_total_15000_to_24999")
    private Float estimateHouseholdsTotal15000To24999;

    @Column(name = "estimate_households_total_25000_to_34999")
    private Float estimateHouseholdsTotal25000To34999;

    @Column(name = "estimate_households_total_35000_to_49999")
    private Float estimateHouseholdsTotal35000To49999;

    @Column(name = "estimate_households_total_50000_to_74999")
    private Float estimateHouseholdsTotal50000To74999;

    @Column(name = "estimate_households_total_75000_to_99999")
    private Float estimateHouseholdsTotal75000To99999;

    @Column(name = "estimate_households_total_100000_to_149999")
    private Float estimateHouseholdsTotal100000To149999;

    @Column(name = "estimate_households_total_150000_to_199999")
    private Float estimateHouseholdsTotal150000To199999;

    @Column(name = "estimate_households_total_200000_or_more")
    private Float estimateHouseholdsTotal200000OrMore;

    @Column(name = "estimate_households_median_income_dollars")
    private Float estimateHouseholdsMedianIncomeDollars;

    @Column(name = "estimate_households_mean_income_dollars")
    private Float estimateHouseholdsMeanIncomeDollars;

    @Column(name = "estimate_households_percent_allocated_household")
    private Float estimateHouseholdsPercentAllocatedHouseholdIncome;

    @Column(name = "estimate_families_total")
    private Float estimateFamiliesTotal;

    @Column(name = "estimate_families_total_less_than_10000")
    private Float estimateFamiliesTotalLessThan10000;

    @Column(name = "estimate_families_total_10000_to_14999")
    private Float estimateFamiliesTotal10000To14999;

    @Column(name = "estimate_families_total_15000_to_24999")
    private Float estimateFamiliesTotal15000To24999;

    @Column(name = "estimate_families_total_25000_to_34999")
    private Float estimateFamiliesTotal25000To34999;

    @Column(name = "estimate_families_total_35000_to_49999")
    private Float estimateFamiliesTotal35000To49999;

    @Column(name = "estimate_families_total_50000_to_74999")
    private Float estimateFamiliesTotal50000To74999;

    @Column(name = "estimate_families_total_75000_to_99999")
    private Float estimateFamiliesTotal75000To99999;

    @Column(name = "estimate_families_total_100000_to_149999")
    private Float estimateFamiliesTotal100000To149999;

    @Column(name = "estimate_families_total_150000_to_199999")
    private Float estimateFamiliesTotal150000To199999;

    @Column(name = "estimate_families_total_200000_or_more")
    private Float estimateFamiliesTotal200000OrMore;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Float getEstimateHouseholdsTotal() {
        return this.estimateHouseholdsTotal;
    }

    public void setEstimateHouseholdsTotal(Float estimateHouseholdsTotal) {
        this.estimateHouseholdsTotal = estimateHouseholdsTotal;
    }

    public Float getEstimateHouseholdsTotalLessThan10000() {
        return this.estimateHouseholdsTotalLessThan10000;
    }

    public void setEstimateHouseholdsTotalLessThan10000(Float estimateHouseholdsTotalLessThan10000) {
        this.estimateHouseholdsTotalLessThan10000 = estimateHouseholdsTotalLessThan10000;
    }

    public Float getEstimateHouseholdsTotal10000To14999() {
        return this.estimateHouseholdsTotal10000To14999;
    }

    public void setEstimateHouseholdsTotal10000To14999(Float estimateHouseholdsTotal10000To14999) {
        this.estimateHouseholdsTotal10000To14999 = estimateHouseholdsTotal10000To14999;
    }

    public Float getEstimateHouseholdsTotal15000To24999() {
        return this.estimateHouseholdsTotal15000To24999;
    }

    public void setEstimateHouseholdsTotal15000To24999(Float estimateHouseholdsTotal15000To24999) {
        this.estimateHouseholdsTotal15000To24999 = estimateHouseholdsTotal15000To24999;
    }

    public Float getEstimateHouseholdsTotal25000To34999() {
        return this.estimateHouseholdsTotal25000To34999;
    }

    public void setEstimateHouseholdsTotal25000To34999(Float estimateHouseholdsTotal25000To34999) {
        this.estimateHouseholdsTotal25000To34999 = estimateHouseholdsTotal25000To34999;
    }

    public Float getEstimateHouseholdsTotal35000To49999() {
        return this.estimateHouseholdsTotal35000To49999;
    }

    public void setEstimateHouseholdsTotal35000To49999(Float estimateHouseholdsTotal35000To49999) {
        this.estimateHouseholdsTotal35000To49999 = estimateHouseholdsTotal35000To49999;
    }

    public Float getEstimateHouseholdsTotal50000To74999() {
        return this.estimateHouseholdsTotal50000To74999;
    }

    public void setEstimateHouseholdsTotal50000To74999(Float estimateHouseholdsTotal50000To74999) {
        this.estimateHouseholdsTotal50000To74999 = estimateHouseholdsTotal50000To74999;
    }

    public Float getEstimateHouseholdsTotal75000To99999() {
        return this.estimateHouseholdsTotal75000To99999;
    }

    public void setEstimateHouseholdsTotal75000To99999(Float estimateHouseholdsTotal75000To99999) {
        this.estimateHouseholdsTotal75000To99999 = estimateHouseholdsTotal75000To99999;
    }

    public Float getEstimateHouseholdsTotal100000To149999() {
        return this.estimateHouseholdsTotal100000To149999;
    }

    public void setEstimateHouseholdsTotal100000To149999(Float estimateHouseholdsTotal100000To149999) {
        this.estimateHouseholdsTotal100000To149999 = estimateHouseholdsTotal100000To149999;
    }

    public Float getEstimateHouseholdsTotal150000To199999() {
        return this.estimateHouseholdsTotal150000To199999;
    }

    public void setEstimateHouseholdsTotal150000To199999(Float estimateHouseholdsTotal150000To199999) {
        this.estimateHouseholdsTotal150000To199999 = estimateHouseholdsTotal150000To199999;
    }

    public Float getEstimateHouseholdsTotal200000OrMore() {
        return this.estimateHouseholdsTotal200000OrMore;
    }

    public void setEstimateHouseholdsTotal200000OrMore(Float estimateHouseholdsTotal200000OrMore) {
        this.estimateHouseholdsTotal200000OrMore = estimateHouseholdsTotal200000OrMore;
    }

    public Float getEstimateHouseholdsMedianIncomeDollars() {
        return this.estimateHouseholdsMedianIncomeDollars;
    }

    public void setEstimateHouseholdsMedianIncomeDollars(Float estimateHouseholdsMedianIncomeDollars) {
        this.estimateHouseholdsMedianIncomeDollars = estimateHouseholdsMedianIncomeDollars;
    }

    public Float getEstimateHouseholdsMeanIncomeDollars() {
        return this.estimateHouseholdsMeanIncomeDollars;
    }

    public void setEstimateHouseholdsMeanIncomeDollars(Float estimateHouseholdsMeanIncomeDollars) {
        this.estimateHouseholdsMeanIncomeDollars = estimateHouseholdsMeanIncomeDollars;
    }

    public Float getEstimateHouseholdsPercentAllocatedHouseholdIncome() {
        return this.estimateHouseholdsPercentAllocatedHouseholdIncome;
    }

    public void setEstimateHouseholdsPercentAllocatedHouseholdIncome(Float estimateHouseholdsPercentAllocatedHouseholdIncome) {
        this.estimateHouseholdsPercentAllocatedHouseholdIncome = estimateHouseholdsPercentAllocatedHouseholdIncome;
    }

    public Float getEstimateFamiliesTotal() {
        return this.estimateFamiliesTotal;
    }

    public void setEstimateFamiliesTotal(Float estimateFamiliesTotal) {
        this.estimateFamiliesTotal = estimateFamiliesTotal;
    }

    public Float getEstimateFamiliesTotalLessThan10000() {
        return this.estimateFamiliesTotalLessThan10000;
    }

    public void setEstimateFamiliesTotalLessThan10000(Float estimateFamiliesTotalLessThan10000) {
        this.estimateFamiliesTotalLessThan10000 = estimateFamiliesTotalLessThan10000;
    }

    public Float getEstimateFamiliesTotal10000To14999() {
        return this.estimateFamiliesTotal10000To14999;
    }

    public void setEstimateFamiliesTotal10000To14999(Float estimateFamiliesTotal10000To14999) {
        this.estimateFamiliesTotal10000To14999 = estimateFamiliesTotal10000To14999;
    }

    public Float getEstimateFamiliesTotal15000To24999() {
        return this.estimateFamiliesTotal15000To24999;
    }

    public void setEstimateFamiliesTotal15000To24999(Float estimateFamiliesTotal15000To24999) {
        this.estimateFamiliesTotal15000To24999 = estimateFamiliesTotal15000To24999;
    }

    public Float getEstimateFamiliesTotal25000To34999() {
        return this.estimateFamiliesTotal25000To34999;
    }

    public void setEstimateFamiliesTotal25000To34999(Float estimateFamiliesTotal25000To34999) {
        this.estimateFamiliesTotal25000To34999 = estimateFamiliesTotal25000To34999;
    }

    public Float getEstimateFamiliesTotal35000To49999() {
        return this.estimateFamiliesTotal35000To49999;
    }

    public void setEstimateFamiliesTotal35000To49999(Float estimateFamiliesTotal35000To49999) {
        this.estimateFamiliesTotal35000To49999 = estimateFamiliesTotal35000To49999;
    }

    public Float getEstimateFamiliesTotal50000To74999() {
        return this.estimateFamiliesTotal50000To74999;
    }

    public void setEstimateFamiliesTotal50000To74999(Float estimateFamiliesTotal50000To74999) {
        this.estimateFamiliesTotal50000To74999 = estimateFamiliesTotal50000To74999;
    }

    public Float getEstimateFamiliesTotal75000To99999() {
        return this.estimateFamiliesTotal75000To99999;
    }

    public void setEstimateFamiliesTotal75000To99999(Float estimateFamiliesTotal75000To99999) {
        this.estimateFamiliesTotal75000To99999 = estimateFamiliesTotal75000To99999;
    }

    public Float getEstimateFamiliesTotal100000To149999() {
        return this.estimateFamiliesTotal100000To149999;
    }

    public void setEstimateFamiliesTotal100000To149999(Float estimateFamiliesTotal100000To149999) {
        this.estimateFamiliesTotal100000To149999 = estimateFamiliesTotal100000To149999;
    }

    public Float getEstimateFamiliesTotal150000To199999() {
        return this.estimateFamiliesTotal150000To199999;
    }

    public void setEstimateFamiliesTotal150000To199999(Float estimateFamiliesTotal150000To199999) {
        this.estimateFamiliesTotal150000To199999 = estimateFamiliesTotal150000To199999;
    }

    public Float getEstimateFamiliesTotal200000OrMore() {
        return this.estimateFamiliesTotal200000OrMore;
    }

    public void setEstimateFamiliesTotal200000OrMore(Float estimateFamiliesTotal200000OrMore) {
        this.estimateFamiliesTotal200000OrMore = estimateFamiliesTotal200000OrMore;
    }
}
