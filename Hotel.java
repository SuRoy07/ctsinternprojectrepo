package com.hotel.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

//use appropriate annotation to make this class as component class
@Component
public class Hotel {
    //use appropriate annotation
    @Value("${hotel.name}")
    private String hotelName;
    
    //use appropriate annotation
    @Value("${hotel.location}")
    private String location;
    
    //use appropriate annotation
    @Value("${hotel.roomRates}")
    private Map<String, Double> roomRates;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Map<String, Double> getRoomRates() {
        return roomRates;
    }

    public void setRoomRates(Map<String, Double> roomRates) {
        this.roomRates = roomRates;
    }
}