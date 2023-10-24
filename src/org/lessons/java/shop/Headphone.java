package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headphone extends Product {

    // Attributi per Headphone
    private String color;
    private boolean wireless;

    // Costruttori
    public Headphone(String name, String description, BigDecimal price, BigDecimal vat, String color, boolean wireless) {

        // Costruttore di Product
        super(name, description, price, vat);

        // Nuovi valori
        this.color = color;
        this.wireless = wireless;
    }

    // Metodi - Getter e Setter
    public String getColor() {
        return color;
    }
    public boolean isWireless() {
        return wireless;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
}
