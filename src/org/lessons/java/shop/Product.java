package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    // Attributi
    private final int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;


    // Costruttore
    public Product(String name, String description, BigDecimal price, BigDecimal vat) {
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
    public BigDecimal getPrice(){
        return this.price;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public BigDecimal getVat(){
        return this.vat;
    }
    public BigDecimal vatPrice() {
        // Prezzo base + prezzo base * iva
        return this.price.add(price.multiply(vat)).setScale(2,RoundingMode.HALF_EVEN);
    }
    public void setVat(BigDecimal vat){
        this.vat = vat;
    }
}
