package com.pluralsight.finance;

import java.math.BigDecimal;

public class BankAccount implements Valuable{

    private int accountNumber;
    private String accountOwner;
    private BigDecimal balance;

    public BankAccount(int accountNumber, String accountOwner, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return 0;
    }

//    public BigDecimal deposit() {
//
//    }

}
