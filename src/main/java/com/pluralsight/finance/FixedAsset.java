package com.pluralsight.finance;

//! abstract as it is a Parent class. It will pull methods from our Valuable interface.
public abstract class FixedAsset implements Valuable {
    //! All FixedAsset children will have a name and marketValue.
    private String name;
    private double marketValue;
    //! constructor for a FixedAsset, which children call to to combine with their own unique fields.
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }
}
