package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<Valuable> assets = new ArrayList<Valuable>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return name + " (" + getValue() + ")";
    }

    public double getValue() {
        double value = 0;
        for (Valuable asset : assets) {
            value += asset.getValue();
        }
        return value;
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public Valuable getMostValuable() {
        if (assets.isEmpty()) {
            return null;
        }
        assets.sort(Comparator.comparingDouble(Valuable::getValue).reversed());
        return assets.get(0);
    }

    public Valuable getLeastValuable() {
        if (assets.isEmpty()) {
            return null;
        }
        assets.sort(Comparator.comparingDouble(Valuable::getValue));
        return assets.get(0);
    }
}
