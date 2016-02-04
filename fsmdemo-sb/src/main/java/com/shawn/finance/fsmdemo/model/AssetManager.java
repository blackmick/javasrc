package com.shawn.finance.fsmdemo.model;

/**
 * Created by shawn on 16/2/4.
 */
public class AssetManager {
    private Long id;
    private String name;
    private String bankName;
    private String branchBankName;
    private String bankAccount;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getBankName(){
        return this.bankName;
    }

    public void setBankAccount(String account){
        this.bankAccount = account;
    }

    public String getBankAccount(){
        return this.bankAccount;
    }

    public void setBranchBankName(String branchBankName){
        this.branchBankName = branchBankName;
    }

    public String getBranchBankName(){
        return this.branchBankName;
    }
}
