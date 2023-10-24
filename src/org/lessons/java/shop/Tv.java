package org.lessons.java.shop;

import java.math.BigDecimal;

public class Tv extends Product {

    // Attributi per Tv
    private int dimensions;
    private boolean smart;

    // Costruttori
    public Tv(String name, String description, BigDecimal price, BigDecimal vat, int dimensions, boolean smart) {

        // Costruttore di Product
        super(name, description, price, vat);

        // Nuovi valori
        this.dimensions = dimensions;
        this.smart = smart;
    }

    // Metodi - Getter e Setter
    public int getDimensions() {
        return dimensions;
    }
    public boolean isSmart() {
        return smart;
    }
    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }
    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "code=" + getCode() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", price=" + getPrice() +
                ", vat=" + getVat() +
                "dimensions=" + dimensions +
                ", smart=" + smart +
                '}';
    }
}

