package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        // Inizializzo lo Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String userName = input.nextLine();

        // Creo un nuovo account
        BankAccount userAccount = new BankAccount(userName);
        System.out.println("Proprietario: " + userAccount.setOwner());
        System.out.println("Numero di Conto: " + userAccount.getAccountNumber());
        System.out.println("Saldo: " + userAccount.getBalance());

        // Menu
        while (true) {
            System.out.println("Digita:");
            System.out.println("1. Versare denaro");
            System.out.println("2. Prelevare denaro");
            System.out.println("3. Uscire");
            System.out.print("Scegli un opzione per proseguire: ");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Inserisci l'importo da versare: ");
                double depositAmount = input.nextDouble();
                userAccount.deposit(depositAmount);
                System.out.println("Saldo attuale: " + userAccount.getFormattedBalance());
            } else if (choice == 2) {
                System.out.print("Inserisci l'importo da prelevare: ");
                double withdrawalAmount = input.nextDouble();
                userAccount.withdraw(withdrawalAmount);
                System.out.println("Saldo attuale: " + userAccount.getFormattedBalance());
            } else if (choice == 3) {
                System.out.println("Grazie per aver usato il nostro servizio.");
                break;
            } else {
                System.out.println("Scelta non valida. Riprova.");
            }
        }

        // Chiudo lo Scanner
        input.close();
    }
}
