package org.lessons.java.shop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        // Inizializzo lo Scanner
        Scanner input = new Scanner(System.in);

        // Richiesta all'utente
        System.out.println("Quanti prodotti vuoi inserire? ");

        int cartSize = Integer.parseInt(input.nextLine());

        // Popolo un array di Product
        Product[] cart = new Product[cartSize];

        // Chiudo lo Scanner
        input.close();
    }
}



