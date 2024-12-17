package com.bankmanagement.bankmanagementsystem.entity;


import jakarta.persistence.*;

@Entity
    @Table(name="Accounts")//if we want to keep different name for table then we use @Table annonation
    public class Account {
        @Id//to indicate field is primary key
        @GeneratedValue(strategy = GenerationType.AUTO)//how to generate value for primary key automatically
        private Integer accountid ;
        @Column(name ="account_Holder_Name")
        private String accountHolderName;
        private String accountType;
        private Double balance;

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountid=" + accountid +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                '}';
    }
}


