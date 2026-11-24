package com.pluralsight.finance;

//! Allowing Gold instances to be constructed w/ a constructor (uses FixedAsset parent constructor (super))
public class Gold extends FixedAsset{

    private double weight;

    public Gold(String name, double marketValue) {
        super(name, marketValue);
        this.weight = weight;
    }

    //! Gold has custom logic for how to assess & return the value of Gold.
    @Override
    public double getValue() {
        return getMarketValue();
    }
}
