package org.lessons.java.shop;

public class Product {

    private int code;
    private String name;
    private String description;
    private int price;
    private int vat;

    public Product(String name, String description, int price, int vat) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    public int getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
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
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getVat(){
        return this.vat;
    }
    public void setVat(int vat){
        this.vat = vat;
    }
}
