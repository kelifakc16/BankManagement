package com.bankmanagement.bankmanagementsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
    @Table(name="Transaction")//if we want to keep different name for table then we use @Table annonation
    public class Transaction {
        @Id//to indicate field is primary key
        @GeneratedValue(strategy = GenerationType.AUTO)//how to generate value for primary key automatically
        private Integer id ;
        @Column(name ="account_Number")
        private String accountNumber;
        private String transactionType;
        private Double balance;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getTransactionType() {
            return transactionType;
        }

        public void setTransactionType(String transactionType) {
            this.transactionType = transactionType;
        }

        public Double getBalance() {
            return balance;
        }

        public void setBalance(Double balance) {
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "id=" + id +
                    ", accountNumber='" + accountNumber + '\'' +
                    ", transactionType='" + transactionType + '\'' +
                    ", balance=" + balance +
                    '}';
        }

    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer userId;
        @NotNull(message = "Username cannot be null")
        private String userName;
        @NotNull(message = "Password cannot be null")
        private String password;

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


    }
}
