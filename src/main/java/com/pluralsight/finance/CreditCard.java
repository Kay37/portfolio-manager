package com.pluralsight.finance;

import java.math.BigDecimal;
import java.text.NumberFormat;

//! CreditCard implements the remote control that is Valuable (Valuable's methods)
public class CreditCard implements Valuable {

    private int accountNumber;
    private String accountOwner;
    private BigDecimal balance;

    public CreditCard(int accountNumber, String accountOwner, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return accountNumber + " (" + formatter.format(getValue()) + ")";
    }

    //! CreditCard has its own method to determine the value of a credit card.
    @Override
    public double getValue() {
        return -balance.doubleValue();
    }

    //! BigDecimal pay method - take an amount to pay off of
    //! the amount you owe (debt) and add it to the balance and then return the new balance
    public BigDecimal pay(double amount) {
        balance = balance.subtract(BigDecimal.valueOf(amount));
        return balance;
    }

    //! BigDecimal charge method - take a charge amount and add it to the amount you owe (balance) (if possible) and then
    //! return the new balance
    public BigDecimal charge(double amount) {
        balance = balance.add(BigDecimal.valueOf(amount));
        return balance;
    }
}

