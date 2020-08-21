package com.example.travelApi.model;

public class CurrencySymbol {
    private final String symbol, icon;

    public CurrencySymbol(String symbol, String icon) {
        this.symbol = symbol;
        this.icon = icon;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getIcon() {
        return icon;
    }
}
