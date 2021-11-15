package edu.matc.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

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
    private Integer zipCode;

    @Column(name = "estimate_households_total")
    private float estimateHouseholdsTotal;

    @Column(name = "estimate_households_total_less_than_10000")
    private BigDecimal estimateHouseholdsTotalLessThan10000;

    @Column(name = "estimate_households_total_10000_to_14999")
    private BigDecimal estimateHouseholdsTotal10000To14999;

    @Column(name = "estimate_households_total_15000_to_24999")
    private BigDecimal estimateHouseholdsTotal15000To24999;

    @Column(name = "estimate_households_total_25000_to_34999")
    private BigDecimal estimateHouseholdsTotal25000To34999;

    @Column(name = "estimate_households_total_35000_to_49999")
    private BigDecimal estimateHouseholdsTotal35000To49999;

    @Column(name = "estimate_households_total_50000_to_74999")
    private BigDecimal estimateHouseholdsTotal50000To74999;

    @Column(name = "estimate_households_total_75000_to_99999")
    private BigDecimal estimateHouseholdsTotal75000To99999;

    @Column(name = "estimate_households_total_100000_to_149999")
    private BigDecimal estimateHouseholdsTotal100000To149999;

    @Column(name = "estimate_households_total_150000_to_199999")
    private BigDecimal estimateHouseholdsTotal150000To199999;

    @Column(name = "estimate_households_total_200000_or_more")
    private BigDecimal estimateHouseholdsTotal200000OrMore;

    @Column(name = "estimate_households_median_income_dollars")
    private BigDecimal estimateHouseholdsMedianIncomeDollars;

    @Column(name = "estimate_households_mean_income_dollars")
    private float estimateHouseholdsMeanIncomeDollars;

    @Column(name = "estimate_households_percent_allocated_household_income")
    private BigDecimal estimateHouseholdsPercentAllocatedHouseholdIncome;

    @Column(name = "estimate_families_total")
    private BigDecimal estimateFamiliesTotal;

    @Column(name = "estimate_families_total_less_than_10000")
    private BigDecimal estimateFamiliesTotalLessThan10000;

    @Column(name = "estimate_families_total_10000_to_14999")
    private BigDecimal estimateFamiliesTotal10000To14999;

    @Column(name = "estimate_families_total_15000_to_24999")
    private BigDecimal estimateFamiliesTotal15000To24999;

    @Column(name = "estimate_families_total_25000_to_34999")
    private BigDecimal estimateFamiliesTotal25000To34999;

    @Column(name = "estimate_families_total_35000_to_49999")
    private BigDecimal estimateFamiliesTotal35000To49999;

    @Column(name = "estimate_families_total_50000_to_74999")
    private BigDecimal estimateFamiliesTotal50000To74999;

    @Column(name = "estimate_families_total_75000_to_99999")
    private BigDecimal estimateFamiliesTotal75000To99999;

    @Column(name = "estimate_families_total_100000_to_149999")
    private BigDecimal estimateFamiliesTotal100000To149999;

    @Column(name = "estimate_families_total_150000_to_199999")
    private BigDecimal estimateFamiliesTotal150000To199999;

    @Column(name = "estimate_families_total_200000_or_more")
    private BigDecimal estimateFamiliesTotal200000OrMore;

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

    public Integer getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public float getEstimateHouseholdsTotal() {
        return this.estimateHouseholdsTotal;
    }

    public void setEstimateHouseholdsTotal(float estimateHouseholdsTotal) {
        this.estimateHouseholdsTotal = estimateHouseholdsTotal;
    }

    public BigDecimal getEstimateHouseholdsTotalLessThan10000() {
        return this.estimateHouseholdsTotalLessThan10000;
    }

    public void setEstimateHouseholdsTotalLessThan10000(BigDecimal estimateHouseholdsTotalLessThan10000) {
        this.estimateHouseholdsTotalLessThan10000 = estimateHouseholdsTotalLessThan10000;
    }

    public BigDecimal getEstimateHouseholdsTotal10000To14999() {
        return this.estimateHouseholdsTotal10000To14999;
    }

    public void setEstimateHouseholdsTotal10000To14999(BigDecimal estimateHouseholdsTotal10000To14999) {
        this.estimateHouseholdsTotal10000To14999 = estimateHouseholdsTotal10000To14999;
    }

    public BigDecimal getEstimateHouseholdsTotal15000To24999() {
        return this.estimateHouseholdsTotal15000To24999;
    }

    public void setEstimateHouseholdsTotal15000To24999(BigDecimal estimateHouseholdsTotal15000To24999) {
        this.estimateHouseholdsTotal15000To24999 = estimateHouseholdsTotal15000To24999;
    }

    public BigDecimal getEstimateHouseholdsTotal25000To34999() {
        return this.estimateHouseholdsTotal25000To34999;
    }

    public void setEstimateHouseholdsTotal25000To34999(BigDecimal estimateHouseholdsTotal25000To34999) {
        this.estimateHouseholdsTotal25000To34999 = estimateHouseholdsTotal25000To34999;
    }

    public BigDecimal getEstimateHouseholdsTotal35000To49999() {
        return this.estimateHouseholdsTotal35000To49999;
    }

    public void setEstimateHouseholdsTotal35000To49999(BigDecimal estimateHouseholdsTotal35000To49999) {
        this.estimateHouseholdsTotal35000To49999 = estimateHouseholdsTotal35000To49999;
    }

    public BigDecimal getEstimateHouseholdsTotal50000To74999() {
        return this.estimateHouseholdsTotal50000To74999;
    }

    public void setEstimateHouseholdsTotal50000To74999(BigDecimal estimateHouseholdsTotal50000To74999) {
        this.estimateHouseholdsTotal50000To74999 = estimateHouseholdsTotal50000To74999;
    }

    public BigDecimal getEstimateHouseholdsTotal75000To99999() {
        return this.estimateHouseholdsTotal75000To99999;
    }

    public void setEstimateHouseholdsTotal75000To99999(BigDecimal estimateHouseholdsTotal75000To99999) {
        this.estimateHouseholdsTotal75000To99999 = estimateHouseholdsTotal75000To99999;
    }

    public BigDecimal getEstimateHouseholdsTotal100000To149999() {
        return this.estimateHouseholdsTotal100000To149999;
    }

    public void setEstimateHouseholdsTotal100000To149999(BigDecimal estimateHouseholdsTotal100000To149999) {
        this.estimateHouseholdsTotal100000To149999 = estimateHouseholdsTotal100000To149999;
    }

    public BigDecimal getEstimateHouseholdsTotal150000To199999() {
        return this.estimateHouseholdsTotal150000To199999;
    }

    public void setEstimateHouseholdsTotal150000To199999(BigDecimal estimateHouseholdsTotal150000To199999) {
        this.estimateHouseholdsTotal150000To199999 = estimateHouseholdsTotal150000To199999;
    }

    public BigDecimal getEstimateHouseholdsTotal200000OrMore() {
        return this.estimateHouseholdsTotal200000OrMore;
    }

    public void setEstimateHouseholdsTotal200000OrMore(BigDecimal estimateHouseholdsTotal200000OrMore) {
        this.estimateHouseholdsTotal200000OrMore = estimateHouseholdsTotal200000OrMore;
    }

    public BigDecimal getEstimateHouseholdsMedianIncomeDollars() {
        return this.estimateHouseholdsMedianIncomeDollars;
    }

    public void setEstimateHouseholdsMedianIncomeDollars(BigDecimal estimateHouseholdsMedianIncomeDollars) {
        this.estimateHouseholdsMedianIncomeDollars = estimateHouseholdsMedianIncomeDollars;
    }

    public float getEstimateHouseholdsMeanIncomeDollars() {
        return this.estimateHouseholdsMeanIncomeDollars;
    }

    public void setEstimateHouseholdsMeanIncomeDollars(float estimateHouseholdsMeanIncomeDollars) {
        this.estimateHouseholdsMeanIncomeDollars = estimateHouseholdsMeanIncomeDollars;
    }

    public BigDecimal getEstimateHouseholdsPercentAllocatedHouseholdIncome() {
        return this.estimateHouseholdsPercentAllocatedHouseholdIncome;
    }

    public void setEstimateHouseholdsPercentAllocatedHouseholdIncome(BigDecimal estimateHouseholdsPercentAllocatedHouseholdIncome) {
        this.estimateHouseholdsPercentAllocatedHouseholdIncome = estimateHouseholdsPercentAllocatedHouseholdIncome;
    }

    public BigDecimal getEstimateFamiliesTotal() {
        return this.estimateFamiliesTotal;
    }

    public void setEstimateFamiliesTotal(BigDecimal estimateFamiliesTotal) {
        this.estimateFamiliesTotal = estimateFamiliesTotal;
    }

    public BigDecimal getEstimateFamiliesTotalLessThan10000() {
        return this.estimateFamiliesTotalLessThan10000;
    }

    public void setEstimateFamiliesTotalLessThan10000(BigDecimal estimateFamiliesTotalLessThan10000) {
        this.estimateFamiliesTotalLessThan10000 = estimateFamiliesTotalLessThan10000;
    }

    public BigDecimal getEstimateFamiliesTotal10000To14999() {
        return this.estimateFamiliesTotal10000To14999;
    }

    public void setEstimateFamiliesTotal10000To14999(BigDecimal estimateFamiliesTotal10000To14999) {
        this.estimateFamiliesTotal10000To14999 = estimateFamiliesTotal10000To14999;
    }

    public BigDecimal getEstimateFamiliesTotal15000To24999() {
        return this.estimateFamiliesTotal15000To24999;
    }

    public void setEstimateFamiliesTotal15000To24999(BigDecimal estimateFamiliesTotal15000To24999) {
        this.estimateFamiliesTotal15000To24999 = estimateFamiliesTotal15000To24999;
    }

    public BigDecimal getEstimateFamiliesTotal25000To34999() {
        return this.estimateFamiliesTotal25000To34999;
    }

    public void setEstimateFamiliesTotal25000To34999(BigDecimal estimateFamiliesTotal25000To34999) {
        this.estimateFamiliesTotal25000To34999 = estimateFamiliesTotal25000To34999;
    }

    public BigDecimal getEstimateFamiliesTotal35000To49999() {
        return this.estimateFamiliesTotal35000To49999;
    }

    public void setEstimateFamiliesTotal35000To49999(BigDecimal estimateFamiliesTotal35000To49999) {
        this.estimateFamiliesTotal35000To49999 = estimateFamiliesTotal35000To49999;
    }

    public BigDecimal getEstimateFamiliesTotal50000To74999() {
        return this.estimateFamiliesTotal50000To74999;
    }

    public void setEstimateFamiliesTotal50000To74999(BigDecimal estimateFamiliesTotal50000To74999) {
        this.estimateFamiliesTotal50000To74999 = estimateFamiliesTotal50000To74999;
    }

    public BigDecimal getEstimateFamiliesTotal75000To99999() {
        return this.estimateFamiliesTotal75000To99999;
    }

    public void setEstimateFamiliesTotal75000To99999(BigDecimal estimateFamiliesTotal75000To99999) {
        this.estimateFamiliesTotal75000To99999 = estimateFamiliesTotal75000To99999;
    }

    public BigDecimal getEstimateFamiliesTotal100000To149999() {
        return this.estimateFamiliesTotal100000To149999;
    }

    public void setEstimateFamiliesTotal100000To149999(BigDecimal estimateFamiliesTotal100000To149999) {
        this.estimateFamiliesTotal100000To149999 = estimateFamiliesTotal100000To149999;
    }

    public BigDecimal getEstimateFamiliesTotal150000To199999() {
        return this.estimateFamiliesTotal150000To199999;
    }

    public void setEstimateFamiliesTotal150000To199999(BigDecimal estimateFamiliesTotal150000To199999) {
        this.estimateFamiliesTotal150000To199999 = estimateFamiliesTotal150000To199999;
    }

    public BigDecimal getEstimateFamiliesTotal200000OrMore() {
        return this.estimateFamiliesTotal200000OrMore;
    }

    public void setEstimateFamiliesTotal200000OrMore(BigDecimal estimateFamiliesTotal200000OrMore) {
        this.estimateFamiliesTotal200000OrMore = estimateFamiliesTotal200000OrMore;
    }
}
