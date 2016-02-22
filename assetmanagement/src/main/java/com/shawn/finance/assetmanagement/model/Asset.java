package com.shawn.finance.assetmanagement.model;

import java.math.BigDecimal;
import java.util.Date;

public class Asset {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.ap_id
     *
     * @mbggenerated
     */
    private Long apId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.core_id
     *
     * @mbggenerated
     */
    private String coreId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.loan_id
     *
     * @mbggenerated
     */
    private String loanId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.period
     *
     * @mbggenerated
     */
    private Integer period;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.payment_periods
     *
     * @mbggenerated
     */
    private Integer paymentPeriods;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.account_type
     *
     * @mbggenerated
     */
    private String accountType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.repay_duration
     *
     * @mbggenerated
     */
    private Date repayDuration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.recevable_amount
     *
     * @mbggenerated
     */
    private BigDecimal recevableAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.repaid
     *
     * @mbggenerated
     */
    private BigDecimal repaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.unrepaid
     *
     * @mbggenerated
     */
    private BigDecimal unrepaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.amount_for_period
     *
     * @mbggenerated
     */
    private BigDecimal amountForPeriod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.principle_for_period
     *
     * @mbggenerated
     */
    private BigDecimal principleForPeriod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.repaid_principle
     *
     * @mbggenerated
     */
    private BigDecimal repaidPrinciple;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.cost_for_period
     *
     * @mbggenerated
     */
    private BigDecimal costForPeriod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.repaid_cost
     *
     * @mbggenerated
     */
    private BigDecimal repaidCost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.interest_for_period
     *
     * @mbggenerated
     */
    private BigDecimal interestForPeriod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.repaid_interest
     *
     * @mbggenerated
     */
    private BigDecimal repaidInterest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.fee
     *
     * @mbggenerated
     */
    private BigDecimal fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.repaid_fee
     *
     * @mbggenerated
     */
    private BigDecimal repaidFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.compound_interest
     *
     * @mbggenerated
     */
    private BigDecimal compoundInterest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.repay_type
     *
     * @mbggenerated
     */
    private Integer repayType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.c_id
     *
     * @mbggenerated
     */
    private Long cId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.corp_id
     *
     * @mbggenerated
     */
    private Long corpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.scene
     *
     * @mbggenerated
     */
    private String scene;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.loan_time
     *
     * @mbggenerated
     */
    private Date loanTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.loan_amount
     *
     * @mbggenerated
     */
    private BigDecimal loanAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.interest_rate
     *
     * @mbggenerated
     */
    private Double interestRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.loan_duration
     *
     * @mbggenerated
     */
    private BigDecimal loanDuration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.due_date
     *
     * @mbggenerated
     */
    private Date dueDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.credit_amount
     *
     * @mbggenerated
     */
    private BigDecimal creditAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.loan_blance
     *
     * @mbggenerated
     */
    private BigDecimal loanBlance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.insurance_type
     *
     * @mbggenerated
     */
    private Integer insuranceType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.over_due
     *
     * @mbggenerated
     */
    private Byte overDue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.over_due_time
     *
     * @mbggenerated
     */
    private Integer overDueTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.over_due_day
     *
     * @mbggenerated
     */
    private Integer overDueDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.max_over_due_day
     *
     * @mbggenerated
     */
    private Integer maxOverDueDay;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.history_max_amount
     *
     * @mbggenerated
     */
    private BigDecimal historyMaxAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.over_due_principle
     *
     * @mbggenerated
     */
    private BigDecimal overDuePrinciple;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.over_due_interest
     *
     * @mbggenerated
     */
    private BigDecimal overDueInterest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.account_age
     *
     * @mbggenerated
     */
    private Integer accountAge;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.transfer_status
     *
     * @mbggenerated
     */
    private Byte transferStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_asset_detail.asset_type
     *
     * @mbggenerated
     */
    private Byte assetType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.id
     *
     * @return the value of tbl_asset_detail.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.id
     *
     * @param id the value for tbl_asset_detail.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.ap_id
     *
     * @return the value of tbl_asset_detail.ap_id
     *
     * @mbggenerated
     */
    public Long getApId() {
        return apId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.ap_id
     *
     * @param apId the value for tbl_asset_detail.ap_id
     *
     * @mbggenerated
     */
    public void setApId(Long apId) {
        this.apId = apId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.core_id
     *
     * @return the value of tbl_asset_detail.core_id
     *
     * @mbggenerated
     */
    public String getCoreId() {
        return coreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.core_id
     *
     * @param coreId the value for tbl_asset_detail.core_id
     *
     * @mbggenerated
     */
    public void setCoreId(String coreId) {
        this.coreId = coreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.loan_id
     *
     * @return the value of tbl_asset_detail.loan_id
     *
     * @mbggenerated
     */
    public String getLoanId() {
        return loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.loan_id
     *
     * @param loanId the value for tbl_asset_detail.loan_id
     *
     * @mbggenerated
     */
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.period
     *
     * @return the value of tbl_asset_detail.period
     *
     * @mbggenerated
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.period
     *
     * @param period the value for tbl_asset_detail.period
     *
     * @mbggenerated
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.payment_periods
     *
     * @return the value of tbl_asset_detail.payment_periods
     *
     * @mbggenerated
     */
    public Integer getPaymentPeriods() {
        return paymentPeriods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.payment_periods
     *
     * @param paymentPeriods the value for tbl_asset_detail.payment_periods
     *
     * @mbggenerated
     */
    public void setPaymentPeriods(Integer paymentPeriods) {
        this.paymentPeriods = paymentPeriods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.account_type
     *
     * @return the value of tbl_asset_detail.account_type
     *
     * @mbggenerated
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.account_type
     *
     * @param accountType the value for tbl_asset_detail.account_type
     *
     * @mbggenerated
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.repay_duration
     *
     * @return the value of tbl_asset_detail.repay_duration
     *
     * @mbggenerated
     */
    public Date getRepayDuration() {
        return repayDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.repay_duration
     *
     * @param repayDuration the value for tbl_asset_detail.repay_duration
     *
     * @mbggenerated
     */
    public void setRepayDuration(Date repayDuration) {
        this.repayDuration = repayDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.recevable_amount
     *
     * @return the value of tbl_asset_detail.recevable_amount
     *
     * @mbggenerated
     */
    public BigDecimal getRecevableAmount() {
        return recevableAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.recevable_amount
     *
     * @param recevableAmount the value for tbl_asset_detail.recevable_amount
     *
     * @mbggenerated
     */
    public void setRecevableAmount(BigDecimal recevableAmount) {
        this.recevableAmount = recevableAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.repaid
     *
     * @return the value of tbl_asset_detail.repaid
     *
     * @mbggenerated
     */
    public BigDecimal getRepaid() {
        return repaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.repaid
     *
     * @param repaid the value for tbl_asset_detail.repaid
     *
     * @mbggenerated
     */
    public void setRepaid(BigDecimal repaid) {
        this.repaid = repaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.unrepaid
     *
     * @return the value of tbl_asset_detail.unrepaid
     *
     * @mbggenerated
     */
    public BigDecimal getUnrepaid() {
        return unrepaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.unrepaid
     *
     * @param unrepaid the value for tbl_asset_detail.unrepaid
     *
     * @mbggenerated
     */
    public void setUnrepaid(BigDecimal unrepaid) {
        this.unrepaid = unrepaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.amount_for_period
     *
     * @return the value of tbl_asset_detail.amount_for_period
     *
     * @mbggenerated
     */
    public BigDecimal getAmountForPeriod() {
        return amountForPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.amount_for_period
     *
     * @param amountForPeriod the value for tbl_asset_detail.amount_for_period
     *
     * @mbggenerated
     */
    public void setAmountForPeriod(BigDecimal amountForPeriod) {
        this.amountForPeriod = amountForPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.principle_for_period
     *
     * @return the value of tbl_asset_detail.principle_for_period
     *
     * @mbggenerated
     */
    public BigDecimal getPrincipleForPeriod() {
        return principleForPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.principle_for_period
     *
     * @param principleForPeriod the value for tbl_asset_detail.principle_for_period
     *
     * @mbggenerated
     */
    public void setPrincipleForPeriod(BigDecimal principleForPeriod) {
        this.principleForPeriod = principleForPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.repaid_principle
     *
     * @return the value of tbl_asset_detail.repaid_principle
     *
     * @mbggenerated
     */
    public BigDecimal getRepaidPrinciple() {
        return repaidPrinciple;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.repaid_principle
     *
     * @param repaidPrinciple the value for tbl_asset_detail.repaid_principle
     *
     * @mbggenerated
     */
    public void setRepaidPrinciple(BigDecimal repaidPrinciple) {
        this.repaidPrinciple = repaidPrinciple;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.cost_for_period
     *
     * @return the value of tbl_asset_detail.cost_for_period
     *
     * @mbggenerated
     */
    public BigDecimal getCostForPeriod() {
        return costForPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.cost_for_period
     *
     * @param costForPeriod the value for tbl_asset_detail.cost_for_period
     *
     * @mbggenerated
     */
    public void setCostForPeriod(BigDecimal costForPeriod) {
        this.costForPeriod = costForPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.repaid_cost
     *
     * @return the value of tbl_asset_detail.repaid_cost
     *
     * @mbggenerated
     */
    public BigDecimal getRepaidCost() {
        return repaidCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.repaid_cost
     *
     * @param repaidCost the value for tbl_asset_detail.repaid_cost
     *
     * @mbggenerated
     */
    public void setRepaidCost(BigDecimal repaidCost) {
        this.repaidCost = repaidCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.interest_for_period
     *
     * @return the value of tbl_asset_detail.interest_for_period
     *
     * @mbggenerated
     */
    public BigDecimal getInterestForPeriod() {
        return interestForPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.interest_for_period
     *
     * @param interestForPeriod the value for tbl_asset_detail.interest_for_period
     *
     * @mbggenerated
     */
    public void setInterestForPeriod(BigDecimal interestForPeriod) {
        this.interestForPeriod = interestForPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.repaid_interest
     *
     * @return the value of tbl_asset_detail.repaid_interest
     *
     * @mbggenerated
     */
    public BigDecimal getRepaidInterest() {
        return repaidInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.repaid_interest
     *
     * @param repaidInterest the value for tbl_asset_detail.repaid_interest
     *
     * @mbggenerated
     */
    public void setRepaidInterest(BigDecimal repaidInterest) {
        this.repaidInterest = repaidInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.fee
     *
     * @return the value of tbl_asset_detail.fee
     *
     * @mbggenerated
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.fee
     *
     * @param fee the value for tbl_asset_detail.fee
     *
     * @mbggenerated
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.repaid_fee
     *
     * @return the value of tbl_asset_detail.repaid_fee
     *
     * @mbggenerated
     */
    public BigDecimal getRepaidFee() {
        return repaidFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.repaid_fee
     *
     * @param repaidFee the value for tbl_asset_detail.repaid_fee
     *
     * @mbggenerated
     */
    public void setRepaidFee(BigDecimal repaidFee) {
        this.repaidFee = repaidFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.compound_interest
     *
     * @return the value of tbl_asset_detail.compound_interest
     *
     * @mbggenerated
     */
    public BigDecimal getCompoundInterest() {
        return compoundInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.compound_interest
     *
     * @param compoundInterest the value for tbl_asset_detail.compound_interest
     *
     * @mbggenerated
     */
    public void setCompoundInterest(BigDecimal compoundInterest) {
        this.compoundInterest = compoundInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.repay_type
     *
     * @return the value of tbl_asset_detail.repay_type
     *
     * @mbggenerated
     */
    public Integer getRepayType() {
        return repayType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.repay_type
     *
     * @param repayType the value for tbl_asset_detail.repay_type
     *
     * @mbggenerated
     */
    public void setRepayType(Integer repayType) {
        this.repayType = repayType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.c_id
     *
     * @return the value of tbl_asset_detail.c_id
     *
     * @mbggenerated
     */
    public Long getcId() {
        return cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.c_id
     *
     * @param cId the value for tbl_asset_detail.c_id
     *
     * @mbggenerated
     */
    public void setcId(Long cId) {
        this.cId = cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.corp_id
     *
     * @return the value of tbl_asset_detail.corp_id
     *
     * @mbggenerated
     */
    public Long getCorpId() {
        return corpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.corp_id
     *
     * @param corpId the value for tbl_asset_detail.corp_id
     *
     * @mbggenerated
     */
    public void setCorpId(Long corpId) {
        this.corpId = corpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.scene
     *
     * @return the value of tbl_asset_detail.scene
     *
     * @mbggenerated
     */
    public String getScene() {
        return scene;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.scene
     *
     * @param scene the value for tbl_asset_detail.scene
     *
     * @mbggenerated
     */
    public void setScene(String scene) {
        this.scene = scene;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.loan_time
     *
     * @return the value of tbl_asset_detail.loan_time
     *
     * @mbggenerated
     */
    public Date getLoanTime() {
        return loanTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.loan_time
     *
     * @param loanTime the value for tbl_asset_detail.loan_time
     *
     * @mbggenerated
     */
    public void setLoanTime(Date loanTime) {
        this.loanTime = loanTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.loan_amount
     *
     * @return the value of tbl_asset_detail.loan_amount
     *
     * @mbggenerated
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.loan_amount
     *
     * @param loanAmount the value for tbl_asset_detail.loan_amount
     *
     * @mbggenerated
     */
    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.interest_rate
     *
     * @return the value of tbl_asset_detail.interest_rate
     *
     * @mbggenerated
     */
    public Double getInterestRate() {
        return interestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.interest_rate
     *
     * @param interestRate the value for tbl_asset_detail.interest_rate
     *
     * @mbggenerated
     */
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.loan_duration
     *
     * @return the value of tbl_asset_detail.loan_duration
     *
     * @mbggenerated
     */
    public BigDecimal getLoanDuration() {
        return loanDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.loan_duration
     *
     * @param loanDuration the value for tbl_asset_detail.loan_duration
     *
     * @mbggenerated
     */
    public void setLoanDuration(BigDecimal loanDuration) {
        this.loanDuration = loanDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.due_date
     *
     * @return the value of tbl_asset_detail.due_date
     *
     * @mbggenerated
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.due_date
     *
     * @param dueDate the value for tbl_asset_detail.due_date
     *
     * @mbggenerated
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.credit_amount
     *
     * @return the value of tbl_asset_detail.credit_amount
     *
     * @mbggenerated
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.credit_amount
     *
     * @param creditAmount the value for tbl_asset_detail.credit_amount
     *
     * @mbggenerated
     */
    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.loan_blance
     *
     * @return the value of tbl_asset_detail.loan_blance
     *
     * @mbggenerated
     */
    public BigDecimal getLoanBlance() {
        return loanBlance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.loan_blance
     *
     * @param loanBlance the value for tbl_asset_detail.loan_blance
     *
     * @mbggenerated
     */
    public void setLoanBlance(BigDecimal loanBlance) {
        this.loanBlance = loanBlance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.insurance_type
     *
     * @return the value of tbl_asset_detail.insurance_type
     *
     * @mbggenerated
     */
    public Integer getInsuranceType() {
        return insuranceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.insurance_type
     *
     * @param insuranceType the value for tbl_asset_detail.insurance_type
     *
     * @mbggenerated
     */
    public void setInsuranceType(Integer insuranceType) {
        this.insuranceType = insuranceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.over_due
     *
     * @return the value of tbl_asset_detail.over_due
     *
     * @mbggenerated
     */
    public Byte getOverDue() {
        return overDue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.over_due
     *
     * @param overDue the value for tbl_asset_detail.over_due
     *
     * @mbggenerated
     */
    public void setOverDue(Byte overDue) {
        this.overDue = overDue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.over_due_time
     *
     * @return the value of tbl_asset_detail.over_due_time
     *
     * @mbggenerated
     */
    public Integer getOverDueTime() {
        return overDueTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.over_due_time
     *
     * @param overDueTime the value for tbl_asset_detail.over_due_time
     *
     * @mbggenerated
     */
    public void setOverDueTime(Integer overDueTime) {
        this.overDueTime = overDueTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.over_due_day
     *
     * @return the value of tbl_asset_detail.over_due_day
     *
     * @mbggenerated
     */
    public Integer getOverDueDay() {
        return overDueDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.over_due_day
     *
     * @param overDueDay the value for tbl_asset_detail.over_due_day
     *
     * @mbggenerated
     */
    public void setOverDueDay(Integer overDueDay) {
        this.overDueDay = overDueDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.max_over_due_day
     *
     * @return the value of tbl_asset_detail.max_over_due_day
     *
     * @mbggenerated
     */
    public Integer getMaxOverDueDay() {
        return maxOverDueDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.max_over_due_day
     *
     * @param maxOverDueDay the value for tbl_asset_detail.max_over_due_day
     *
     * @mbggenerated
     */
    public void setMaxOverDueDay(Integer maxOverDueDay) {
        this.maxOverDueDay = maxOverDueDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.history_max_amount
     *
     * @return the value of tbl_asset_detail.history_max_amount
     *
     * @mbggenerated
     */
    public BigDecimal getHistoryMaxAmount() {
        return historyMaxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.history_max_amount
     *
     * @param historyMaxAmount the value for tbl_asset_detail.history_max_amount
     *
     * @mbggenerated
     */
    public void setHistoryMaxAmount(BigDecimal historyMaxAmount) {
        this.historyMaxAmount = historyMaxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.over_due_principle
     *
     * @return the value of tbl_asset_detail.over_due_principle
     *
     * @mbggenerated
     */
    public BigDecimal getOverDuePrinciple() {
        return overDuePrinciple;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.over_due_principle
     *
     * @param overDuePrinciple the value for tbl_asset_detail.over_due_principle
     *
     * @mbggenerated
     */
    public void setOverDuePrinciple(BigDecimal overDuePrinciple) {
        this.overDuePrinciple = overDuePrinciple;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.over_due_interest
     *
     * @return the value of tbl_asset_detail.over_due_interest
     *
     * @mbggenerated
     */
    public BigDecimal getOverDueInterest() {
        return overDueInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.over_due_interest
     *
     * @param overDueInterest the value for tbl_asset_detail.over_due_interest
     *
     * @mbggenerated
     */
    public void setOverDueInterest(BigDecimal overDueInterest) {
        this.overDueInterest = overDueInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.account_age
     *
     * @return the value of tbl_asset_detail.account_age
     *
     * @mbggenerated
     */
    public Integer getAccountAge() {
        return accountAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.account_age
     *
     * @param accountAge the value for tbl_asset_detail.account_age
     *
     * @mbggenerated
     */
    public void setAccountAge(Integer accountAge) {
        this.accountAge = accountAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.transfer_status
     *
     * @return the value of tbl_asset_detail.transfer_status
     *
     * @mbggenerated
     */
    public Byte getTransferStatus() {
        return transferStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.transfer_status
     *
     * @param transferStatus the value for tbl_asset_detail.transfer_status
     *
     * @mbggenerated
     */
    public void setTransferStatus(Byte transferStatus) {
        this.transferStatus = transferStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_asset_detail.asset_type
     *
     * @return the value of tbl_asset_detail.asset_type
     *
     * @mbggenerated
     */
    public Byte getAssetType() {
        return assetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_asset_detail.asset_type
     *
     * @param assetType the value for tbl_asset_detail.asset_type
     *
     * @mbggenerated
     */
    public void setAssetType(Byte assetType) {
        this.assetType = assetType;
    }
}