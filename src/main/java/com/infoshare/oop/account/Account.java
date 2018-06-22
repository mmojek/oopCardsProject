package com.infoshare.oop.account;

import com.infoshare.oop.card.Product;

import java.math.BigDecimal;

public class Account extends Product {
    private String name;
    private String number;

    public Account(String name, String number, String id) {
        super(id);
        this.name = name;
        this.number = number;

    }

    public Account(BigDecimal transferFee) {
        super(transferFee);
    }


    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return super.toString() + name +number;
    }


}