package org.lessons.java.bank;
public class BankAccount {

    // Attributi
    private double accountNumber;
    private String owner;
    private double balance;

    // Costruttore
    public BankAccount(double accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0;
    }

    // Metodi
    public double getAccountNumber(){
        return this.accountNumber;
    }

    public String getOwner(){
        return this.owner;
    }

    public String setOwner(){
        return this.owner;
    }

    public double getBalance(){
        return this.balance;
    }
}
