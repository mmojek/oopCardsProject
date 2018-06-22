package com.infoshare.oop.card;

import com.infoshare.oop.exceptions.NotEnoughFundsException;

import java.math.BigDecimal;

public abstract class Card extends Product {
    protected final String name;
    protected final String number;
    protected BigDecimal balance;
    protected CustomerType customerType;


    public Card(String name, String number, CustomerType customerType, String id) {
        super(id);
        System.out.println("Card initialization - constructor with 4 arguments");
        this.name = name;
        this.number = number;
        this.balance = BigDecimal.ZERO;
        this.customerType = customerType;



    }

    public Card(String name, String number, BigDecimal balance, CustomerType customerType, String id) {
        this(name, number, customerType, id);
        this.balance = balance;

        System.out.println("Card initialization - constructor with 4 arguments");
    }

    @Override
    public String toString() {
        return name + ", " + "number: " + number + ", balance: " + balance + "zł, typ klienta: " + customerType;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public abstract void pay() throws NotEnoughFundsException;


}
