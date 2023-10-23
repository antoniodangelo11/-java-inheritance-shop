package org.lessons.java.shop;

import java.math.BigDecimal;

public class Tv extends Product {

    // Attributi per Tv
    private String size;
    private boolean smart;

    // Costruttori
    public Tv(String name, String description, BigDecimal price, BigDecimal vat, String size, boolean smart) {
        super(name, description, price, vat);
        this.size = size;
        this.smart = smart;
    }

    // Metodi
    public String getSize() {
        return this.size;
    }
    public boolean isSmart() {
        return this.smart;
    }
}

