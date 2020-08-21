package com.example.travelApi.model;

public class GeoLocation {
    private final String cityName, countryName, latitude, longitude;

    public GeoLocation(String cityName, String countryName, String latitude, String longitude) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
