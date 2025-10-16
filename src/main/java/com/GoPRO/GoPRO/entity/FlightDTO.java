package com.GoPRO.GoPRO.entity;

public class FlightDTO {
    private String airline;
    private String from;
    private String to;
    private String date;
    private Double price;

    public FlightDTO(String airline, String from, String to, String date, Double price) {
        this.airline = airline;
        this.from = from;
        this.to = to;
        this.date = date;
        this.price = price;
    }

    // Getters & Setters
    public String getAirline() { return airline; }
    public void setAirline(String airline) { this.airline = airline; }
    public String getFrom() { return from; }
    public void setFrom(String from) { this.from = from; }
    public String getTo() { return to; }
    public void setTo(String to) { this.to = to; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}