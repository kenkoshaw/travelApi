package com.example.travelApi.dao;

import com.example.travelApi.model.GeoLocation;

import java.util.HashMap;
import java.util.Map;

public class GeoLocationDao {
    private static Map<String, GeoLocation> geoLocations = new HashMap<String,GeoLocation>() {{
        put("161.76.78.38",new GeoLocation("London","United Kingdom", "51.507351", "-0.127758"));
        put("110.232.250.29",new GeoLocation("New Delhi","India", "28.613939", "77.209023"));
        put("69.60.8.207",new GeoLocation("New York","United States", "40.712776", "-74.005974"));
        put("83.202.128.19",new GeoLocation("Paris","France", "48.856613", "2.352222"));
        put("195.211.23.32",new GeoLocation("Moscow","Russia", "55.751244", "37.618423"));
        put("191.81.100.70",new GeoLocation("Buenos Aires","Argentina", "-34.603722", "-58.381557"));

    }};

    public static GeoLocation getGeoLocation(String ip) {
        return geoLocations.get(ip);
    }
}