package com.pluralsight.finance;

import java.text.NumberFormat;

//! Jewelry is a subclass of FixedAsset parent
public class Jewelry extends FixedAsset{

    private double karat;

    //! Allowing Jewelry instances to be constructed w/ a constructor (uses FixedAsset parent constructor (super))
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }
    //! Jewelry has custom logic for how to assess & return the value of Jewelry.
    @Override
    public double getValue() {
        return getMarketValue();
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return this.getName() + " (" + formatter.format(getValue()) + ")";
    }

}
