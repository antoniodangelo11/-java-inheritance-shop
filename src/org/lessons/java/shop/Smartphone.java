package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {

    // Attributi per Smartphone
    private final String imei;
    private int memory;

    // Costruttori
    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, String imei,
                      int memory) {

        // Costruttore di Product
        super(name, description, price, vat);

        // Nuovi valori
        this.imei = imei;
        this.memory = memory;
    }

    // Metodi - Getter e Setter
    public String getImei() {
        return imei;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
}
