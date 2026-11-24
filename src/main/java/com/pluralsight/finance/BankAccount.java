package com.pluralsight.finance;

import java.math.BigDecimal;
//! BankAccount implements the remote control that is Valuable (Valuable's methods)
public class BankAccount implements Valuable {

    //! These fields are unique to BankAccount objects
    private int accountNumber;
    private String accountOwner;
    private BigDecimal balance;

    //! BankAccount constructor. Not a subclass of FixedAsset so no call to a super constructor - has its own.
    public BankAccount(int accountNumber, String accountOwner, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    //! Return BankAccount value (balance) as a double
    @Override
    public double getValue() {
        return balance.doubleValue();
    }
    //! BigDecimal deposit method - take a deposit amount and add it to the balance and then return the new balance
    public BigDecimal deposit(double amount) {
        balance = balance.add(BigDecimal.valueOf(amount));
        return balance;
    }
    //! BigDecimal withdraw method - take a withdraw amount and subtract it from the balance (if possible) and then
    //! return the new balance
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
