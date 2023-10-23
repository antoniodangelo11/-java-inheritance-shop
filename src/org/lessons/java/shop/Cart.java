package org.lessons.java.shop;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        // Inizializzo lo Scanner
        Scanner input = new Scanner(System.in);

        Product[] cart = new Product[50];

        int i = 0;

        double total = 0.00;

        int choose;

        while (true) {
            System.out.println("Inserisci il tipo di prodotto (1. Smartphone, 2. TV, 3. Cuffie, 4.Esci): \n");

            choose = Integer.parseInt(input.nextLine());

            if (choose == 4) {
                break;
            }

            System.out.println("Inserisci il nome del prodotto: ");
            String nome = input.nextLine();
            System.out.println("Inserisci la descrizione del prodotto: ");
            String descrizione = input.nextLine();
            System.out.println("Inserisci il prezzo del prodotto: ");
            double prezzo = Double.parseDouble(input.nextLine());
            System.out.println("Inserisci l'IVA del prodotto: ");
            int iva = Integer.parseInt(input.nextLine());

            Product product = null;

            if (choose == 1) {
                System.out.println("Inserisci il codice IMEI del prodotto: ");
                int imeiCode = Integer.parseInt(input.nextLine());
                System.out.println("Inserisci la capacità della memoria (GigaByte): ");
                int memory = Integer.parseInt(input.nextLine());

                product = new Smartphone(product.getName(),
                        product.getDescription(),
                        product.getPrice(),
                        product.getVat(),
                        imeiCode,
                        memory);

            } else if (choose == 2) {
                System.out.println("Inserisci i pollici del Televisore: ");
                String size = String.valueOf(Integer.parseInt(input.nextLine()));
                System.out.println("La TV è di tipo SmartTv? (scrivi: true/false)");
                boolean isSmart = Boolean.parseBoolean(input.nextLine());

                product = new Tv(product.getName(),
                        product.getDescription(),
                        product.getPrice(),
                        product.getVat(),
                        size,
                        isSmart);

            } else if (choose == 3) {
                System.out.println("Inserisci il colore delle cuffie: ");
                String color = input.nextLine();
                System.out.println("Le cuffie sono di tipo cablato? (scrivi: true/false)");
                boolean wireless = Boolean.parseBoolean(input.nextLine());

                product = new Headphone(product.getName(),
                        product.getDescription(),
                        product.getPrice(),
                        product.getVat(),
                        color,
                        wireless);
            } else {
                System.out.println("Inserisci una scelta valida!!");
            }

            cart[i] = product;
            i++;

        }

        System.out.println("Carrello:");
        total = 0.0;
        int itemCount = 0;
        for (i = 0; i < itemCount; i++) {
            System.out.println(i + 1 + " - " + cart[i].toString());
            total += cart[i].vatPrice().doubleValue();
        }

        System.out.println("Totale: " + total);
    }
}


