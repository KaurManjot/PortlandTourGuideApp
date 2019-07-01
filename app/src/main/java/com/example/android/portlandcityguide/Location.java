package com.example.android.portlandcityguide;

public class Location {

    private int image;
    private String name;
    private String streetAddress;
    private String hours;
    private String travelTime;

    public Location(int image, String name, String streetAddress, String hours, String travelTime) {
        this.image = image;
        this.name = name;
        this.streetAddress = streetAddress;
        this.hours = hours;
        this.travelTime = travelTime;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getHours() {
        return hours;
    }

    public String getTravelTime() {
        return travelTime;
    }
}
