package com.example.travelApi.api;

import com.example.travelApi.dao.CurrencySymbolDao;
import com.example.travelApi.dao.GeoLocationDao;
import com.example.travelApi.model.CurrencySymbol;
import com.example.travelApi.model.GeoLocation;
import org.springframework.web.bind.annotation.*;

@RestController
public class TravelController {

    @GetMapping("/currency")
    public CurrencySymbol getCurrSymbol(@RequestParam(value = "currCode", defaultValue = "GBP") String currCd) {
        return CurrencySymbolDao.getCurrencySymbol(currCd);
    }

    @GetMapping("/location")
    public GeoLocation getCityCountry(@RequestParam(value = "ip", defaultValue = "161.76.78.38") String ip) {
        return GeoLocationDao.getGeoLocation(ip);
    }
}
