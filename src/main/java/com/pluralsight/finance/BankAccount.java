package com.pluralsight.finance;

import java.math.BigDecimal;

public class BankAccount implements Valuable {

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
        return balance.doubleValue();
    }

    public BigDecimal deposit(double amount) {
        balance = balance.add(BigDecimal.valueOf(amount));
        return balance;
    }

    public BigDecimal withdraw(double amount) {
        if (balance.compareTo(BigDecimal.valueOf(amount)) >= 0) {
            balance = balance.subtract(BigDecimal.valueOf(amount));
            return balance;
        } else {
            System.out.println("An error occurred with your withdraw request. Current balance: \n" + balance);
            return balance;
        }
    }


}
