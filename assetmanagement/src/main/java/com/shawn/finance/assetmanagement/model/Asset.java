package com.shawn.finance.assetmanagement.model;

/**
 * Created by shawn on 16/2/4.
 * 资产计划明细
 */
public class Asset {
    private long id;
    private long apId;
    private long coreId;
    private String loanId;
    private long period;
    private long paymentPeriod;
    private String acountType;
    private String repayDuration;

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return this.id;
    }

    public void setApId(long id){
        this.apId = id;
    }

    public long getApId(){
        return this.apId;
    }

    public void setCoreId(long coreId){
        this.coreId = coreId;
    }

    public long getCoreId(){
        return this.coreId;
    }

    public void setLoanId(String id){
        this.loanId = id;
    }

    public String getLoanId(){
        return this.loanId;
    }

    public void setPeriod(long period){
        this.period = period;
    }

    public long getPeriod(){
        return this.period;
    }

}
