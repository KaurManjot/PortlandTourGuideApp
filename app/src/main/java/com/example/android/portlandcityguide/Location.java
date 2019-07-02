package com.example.android.portlandcityguide;

public class Location {

    private int image;
    private String name;
    private String streetAddress;
    private String visitingHours;
    private float rating;

    public Location(int image, String name, String streetAddress, String visitingHours, float rating) {
        this.image = image;
        this.name = name;
        this.streetAddress = streetAddress;
        this.visitingHours = visitingHours;
        this.rating = rating;
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

    public String getVisitingHours() {
        return visitingHours;
    }

    public float getRating() {
        return rating;
    }
}
