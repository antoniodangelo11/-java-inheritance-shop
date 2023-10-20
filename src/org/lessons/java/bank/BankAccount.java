package org.lessons.java.bank;

import java.util.Random;

public class BankAccount {

    // Attributi
    private final int accountNumber;
    private final String owner;
    private double balance;

    // Costruttore
    public BankAccount(String owner) {
        this.accountNumber = generateAccountNumber();
        this.owner = owner;
        this.balance = 0.00;
    }

    // Metodi
    public int getAccountNumber(){
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
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("L'importo del deposito deve essere maggiore di zero.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("L'importo del prelievo non è valido.");
        }
    }
    public String getFormattedBalance() {
        return String.format("%.2f €", balance);
    }
    private int generateAccountNumber() {
        Random rand = new Random();
        return rand.nextInt(1000) + 1;
    }
}
