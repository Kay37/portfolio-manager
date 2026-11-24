package com.pluralsight.finance;

import java.text.NumberFormat;

//! Allowing House instances to be constructed w/ a constructor (uses FixedAsset parent constructor (super))
public class House extends FixedAsset{

    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    //! A house has custom logic for how to assess & return the value of a house.
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
