
package com.pluralsight;

import com.pluralsight.finance.*;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class FinanceApplication {

    public static void main(String[] args) {
        //* Creating two new bank accounts
        BankAccount account1 = new BankAccount(123, "Pam", new BigDecimal("12500"));
        Valuable accountTwo = new BankAccount(456, "Gary", new BigDecimal("1500"));

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

        BankAccount account2 = new BankAccount(789, "Pam", new BigDecimal("15000"));
        CreditCard ccAccount1 = new CreditCard(1234, "Pam", new BigDecimal("2000"));
        Gold goldBar = new Gold("Gold Bar", 1421158.00, 27.4);
        House house = new House("2 story, 3 bed, 2 bath", 300000.00, 1999, 2000, 3);
        Jewelry necklace = new Jewelry("Necklace", 1000.00, 14);
        Portfolio pamPortfolio = new Portfolio("Pam's Portfolio", "Pam");
        pamPortfolio.add(account1);
        pamPortfolio.add(account2);
        pamPortfolio.add(ccAccount1);
        pamPortfolio.add(goldBar);
        pamPortfolio.add(house);
        pamPortfolio.add(necklace);
        System.out.println("Most valuable asset in Pam's Portfolio: " + pamPortfolio.getMostValuable());
        System.out.println("Least valuable asset in Pam's Portfolio: " + pamPortfolio.getLeastValuable());
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total value of Pam's portfolio: " + formatter.format(pamPortfolio.getValue()));
    }

}
