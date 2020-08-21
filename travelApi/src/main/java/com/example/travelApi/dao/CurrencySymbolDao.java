package com.example.travelApi.dao;

import com.example.travelApi.model.CurrencySymbol;

import java.util.HashMap;
import java.util.Map;

public class CurrencySymbolDao {
    private static Map<String, CurrencySymbol> symbols = new HashMap<String,CurrencySymbol>() {{
        put("GBP",new CurrencySymbol("\u00A3","£"));
        put("INR",new CurrencySymbol("\u20B9","₹"));
        put("USD",new CurrencySymbol("\u0024","$"));
        put("EUR",new CurrencySymbol("\u20AC","€"));
        put("ARS",new CurrencySymbol("\u0024","$"));
        put("RUB",new CurrencySymbol("\u20BD","₽"));
    }};

    public static CurrencySymbol getCurrencySymbol(String currCode) {
        return symbols.get(currCode);
    }
}
