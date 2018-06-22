package com.infoshare.oop.card;

import com.infoshare.oop.exceptions.NotEnoughFundsException;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String name, String number, BigDecimal balance, CustomerType customerType, String id) {
        super(name, number, balance, customerType, id);

    }

    public DebitCard(String name, String number, CustomerType customerType, String id) {
        super(name, number, customerType, id);
    }


    @Override
    public void pay() throws NotEnoughFundsException{
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NotEnoughFundsException("Zbyt malo srodkow na koncie aby zaplacic karta debetowa!");

        }
        System.out.println("Platnosc karta Debetowa.");

    }

}
