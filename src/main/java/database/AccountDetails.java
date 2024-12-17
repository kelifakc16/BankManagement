package database;

import jakarta.persistence.*;

@Entity
@Table(name="Accounts")
public class AccountDetails {

    @Id//to indicate field is primary key
    @GeneratedValue(strategy = GenerationType.AUTO)//how to generate value for primary key automatically
    private Long accountId ;
    @Column(name ="account_Holder_Name")
    private String accountHolderName;
    private String accountType;
    private double balance;

    public AccountDetails() {

    }

    public AccountDetails(Long accountId, String accountHolderName, String accountType, double balance) {
        this.accountId=accountId;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "accountDetails{" +
                "accountId=" + accountId +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                '}';
    }
}


