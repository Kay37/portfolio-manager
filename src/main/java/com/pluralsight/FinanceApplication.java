
package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

import java.math.BigDecimal;

public class FinanceApplication {

    public static void main(String[] args) {
        //* Creating two new bank accounts
        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        Valuable account2 = new BankAccount(456, "Gary", new BigDecimal("1500"));

        //* Attempting to deposit into both
        account1.deposit(100);
//        account2.deposit(100);

        //* Did the deposit work for both accounts? Why or why not?
        //? The deposit does not work for the BankAccount instance with the Valuable type assigned to it.
        //? I think about it like account1 and account2 both being real BankAccounts, but they're being piloted by
        //? different remotes or apps. account1 has an app that has a deposit method, but account2 has an app or remote
        //? that does not have deposit or withdraw, only getValue().
        // * What methods are available for account1?
        //? getValue(), deposit(), and withdraw()
        //* What methods are available for account2?
        //? getValue()
        //* Why?
        //? See my above answer. Account2 is a different variable type and has a different Interface attached to it that
        //? allows different methods.
    }

}
