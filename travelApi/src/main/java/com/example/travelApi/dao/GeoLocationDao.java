package com.example.travelApi.dao;

import com.example.travelApi.model.GeoLocation;

import java.util.HashMap;
import java.util.Map;

public class GeoLocationDao {
    private static Map<String, GeoLocation> geoLocations = new HashMap<String,GeoLocation>() {{
        put("161.76.78.38",new GeoLocation("London","United Kingdom", "51.507351", "-0.127758"));
        put("110.232.250.29",new GeoLocation("New Delhi","India", "28.613939", "77.209023"));
        put("69.60.8.207",new GeoLocation("New York","United States", "40.712776", "-74.005974"));
    }};

    public static GeoLocation getGeoLocation(String ip) {
        return geoLocations.get(ip);
    }
}