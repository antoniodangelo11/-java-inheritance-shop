package org.lessons.java.shop;

import java.math.BigDecimal;
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

        // Per ogni carrello inserisco un prodotto
        for (int i = 0; i < cart.length; i++) {
            System.out.println("Inserisci un prodotto " + (i + 1));

            boolean invalidChoice;

            do {
                // Passo i dati generali del Product
                System.out.println("Nome: ");
                String name = input.nextLine();
                System.out.println("Descrizione: ");
                String description = input.nextLine();
                System.out.println("Prezzo: ");
                String priceString = input.nextLine();
                System.out.println("IVA: ");
                String vatString = input.nextLine();


                System.out.println("Quale prodotto? 1. Smartphone, 2. TV, 3. Headphone");
                String choice = input.nextLine();
                // Dopo la scelta creo Smartphone, Tv, o Headphone
                switch (choice) {
                    case "1":
                        System.out.println("Smartphone");
                        invalidChoice = false;

                        // Creo uno Smartphone
                        System.out.println("Codice IMEI: ");
                        String imeiCode = input.nextLine();
                        System.out.println("Memoria: ");
                        int memory = Integer.parseInt(input.nextLine());

                        Smartphone smartphone = new Smartphone(name, description, new BigDecimal(priceString),
                                new BigDecimal(vatString), imeiCode, memory);

                        // Aggiungo lo Smartphone all'array Cart
                        cart[i] = smartphone;

                        break;
                    case "2":
                        System.out.println("Tv");
                        invalidChoice = false;

                        // Creo una TV
                        System.out.println("Dimensioni: ");
                        int dimensions = Integer.parseInt(input.nextLine());
                        System.out.println("Smart?si/no: ");
                        boolean smart = input.nextLine().equalsIgnoreCase("si");

                        Tv tv = new Tv(name, description, new BigDecimal(priceString), new BigDecimal(vatString),
                                dimensions, smart);

                        // Aggiungo una Tv all'array Cart
                        cart[i] = tv;

                        break;
                    case "3":
                        System.out.println("Headphone");
                        invalidChoice = false;

                        // Creo un Headphone
                        System.out.println("Colore: ");
                        String color = input.nextLine();
                        System.out.println("Wireless?si/no");
                        boolean wireless = input.nextLine().equalsIgnoreCase("si");

                        Headphone headphone = new Headphone(name, description, new BigDecimal(priceString),
                                new BigDecimal(vatString), color, wireless);

                        // Aggiungo un Headphone all'array Cart
                        cart[i] = headphone;

                        break;
                    default:
                        System.out.println("Scelta non valida");
                        invalidChoice = true;
                        break;
                }
            } while (invalidChoice);

        }

        // Adesso mostro sul carrello i vari prodotti
        BigDecimal total = new BigDecimal(0);
        for (Product p : cart) {
            System.out.println(p);

            // Aggiorno il totale
            total = total.add(p.getFullPrice());
        }
        System.out.println("Totale: " + total + "€");

        // Chiudo lo Scanner
        input.close();
    }
}



