package org.lessons.java.shop;

import java.util.Random;

public class Product {

    // Attributi
    private final int code;
    private String name;
    private String description;
    private double price;
    private int vat;


    // Costruttore
    public Product(String name, String description, double price, int vat) {
        Random rand = new Random();
        this.code = rand.nextInt(20);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    // Metodi
    public int getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
    public String completeName(){
        return this.name + " " + this.code;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getVat(){
        return this.vat;
    }
    public double vatPrice() {
        this.price = this.price * (1 + ((double) this.vat / 100));
        return this.price;
    }
    public void setVat(int vat){
        this.vat = vat;
    }
}
