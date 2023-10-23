package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headphone extends Product {

    // Attributi per Headphone
    private String color;
    private boolean wireless;

    // Costruttori
    public Headphone(String name, String description, BigDecimal price, BigDecimal vat, String color, boolean wireless) {
        super(name, description, price, vat);
        this.color = color;
        this.wireless = wireless;
    }

    // Metodi
    public String getColor() {
        return this.color;
    }
    public boolean isWireless() {
        return this.wireless;
    }
}
