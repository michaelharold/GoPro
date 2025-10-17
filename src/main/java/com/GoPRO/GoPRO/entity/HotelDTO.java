package com.GoPRO.GoPRO.entity;

public class HotelDTO {
    private String name;
    private String location;
    private double rating;
    private double pricePerNight;

    public HotelDTO(String name, String location, double rating, double pricePerNight) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.pricePerNight = pricePerNight;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public double getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(double pricePerNight) { this.pricePerNight = pricePerNight; }
}
