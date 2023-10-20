package org.lessons.java.shop;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        // Creo il nuovo Prodotto
        Product pasta = new Product("Fusilli", "Pasta Corta", 10.0, 22);
        System.out.println(pasta.getCode());
        System.out.println(pasta.getName());
        System.out.println(pasta.completeName());
        System.out.println(pasta.getDescription());
        System.out.println(pasta.getPrice());
        System.out.println(pasta.vatPrice());
        System.out.println(pasta.getVat());
    }
}
