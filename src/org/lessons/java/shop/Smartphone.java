package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {

    // Attributi per Smartphone
    private final int imeiCode;
    private int amountOfMemory;

    // Costruttori
    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, int imeiCode,
                      int amountOfMemory) {
        super(name, description, price, vat);
        this.imeiCode = imeiCode;
        this.amountOfMemory = amountOfMemory;
    }
}
