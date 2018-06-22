package com.infoshare.oop.card;

import java.math.BigDecimal;

public abstract class Product {

    private static String id;

    public Product(String id) {

        this.id = id;

    }

    public Product(BigDecimal transferFee) {

    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id karty: " + getId();
    }

}


