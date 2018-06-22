package com.infoshare.oop;

import com.infoshare.oop.account.Account;
import com.infoshare.oop.account.SavingAccount;
import com.infoshare.oop.card.*;
import com.infoshare.oop.exceptions.NotEnoughFundsException;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        //   Card card = new Card("Karta", "1234");
        Card creditCard = new CreditCard("Karta kredytowa", "123", BigDecimal.ONE, new BigDecimal(200), CustomerType.INDIVIDUAL, "1");

        Card debitCard = new DebitCard("karta debetowa", "5534267345", new BigDecimal(500), CustomerType.COMPANY, "2");

        CanTransferTo prepaidCard = new PrepaidCard("karta przedplacona", "234234324", BigDecimal.ONE, CustomerType.INDIVIDUAL, true, "3");

        Account account = new Account("Account", "3333", "5");

        SavingAccount savingAccount = new SavingAccount("5", "Saving Account", "4444", BigDecimal.ONE);

        CanTransferTo myNewObject = new CanTransferTo() {
            public void transferToCard(BigDecimal amount) {
                System.out.println("Implementacja - klasa wewnetrzna.");
                }
        };

        // card.pay();
        // creditCard.pay();
        //   System.out.println(//card.toString());

        System.out.println(creditCard.toString());
        System.out.println(debitCard.toString());
        System.out.println(prepaidCard.toString());


        CanTransferTo NewOneObject = new CanTransferTo() {
            public void transferToCard(BigDecimal amount) {
                System.out.println("Implementacja wewnętrznej klasy anonimowej CanTransferTo");
            }
        };

        //Lista produktow

        ArrayList<Product> productList = new ArrayList<Product>();

        productList.add(0, creditCard);
        productList.add(1, debitCard);
        productList.add(2,savingAccount);
        productList.add(3,account);
       // productList.add(4, prepaidCard);

        for (Product temp : productList) {
            System.out.println(temp);
        }


        try {
            creditCard.pay();
            debitCard.pay();
        //    prepaidCard.pay();
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }

        prepaidCard.transferToCard(BigDecimal.ZERO);
        CreditCard myCreditCard = (CreditCard) creditCard;
        System.out.println(myCreditCard.toString());

    }
}