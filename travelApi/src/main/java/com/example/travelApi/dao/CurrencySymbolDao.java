package com.example.travelApi.dao;

import com.example.travelApi.model.CurrencySymbol;

import java.util.HashMap;
import java.util.Map;

public class CurrencySymbolDao {
    private static Map<String, CurrencySymbol> symbols = new HashMap<String,CurrencySymbol>() {{
        put("GBP",new CurrencySymbol("£"));
        put("INR",new CurrencySymbol("₹"));
        put("USD",new CurrencySymbol("$"));
        put("EUR",new CurrencySymbol("€"));
    }};

    public static CurrencySymbol getCurrencySymbol(String currCode) {
        return symbols.get(currCode);
    }
}
