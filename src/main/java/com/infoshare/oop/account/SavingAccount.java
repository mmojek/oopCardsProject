package com.infoshare.oop.account;

import java.math.BigDecimal;

public class SavingAccount extends Account {
    private BigDecimal transferFee;

    public SavingAccount(String id, String name, String number, BigDecimal transferFee) {
        super(id, name, number);
        this.transferFee = transferFee;

    }

    public BigDecimal getTransferFee() {
        return transferFee;
    }

    @Override
    public String toString() {
        return super.toString()+ getTransferFee();
    }

}
