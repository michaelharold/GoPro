package com.GoPRO.GoPRO.entity;

public class FlightDTO {
    private String airline;
    private String flightNumber;
    private String from;
    private String to;
    private String date; // yyyy-MM-dd
    private Double price;
    private String departureTime; // e.g. 08:30
    private String arrivalTime;   // e.g. 10:55

    public FlightDTO() {}

    public FlightDTO(String airline, String flightNumber, String from, String to, String date, Double price, String departureTime, String arrivalTime) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        this.from = from;
        this.to = to;
        this.date = date;
        this.price = price;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    // Getters & setters
    public String getAirline() { return airline; }
    public void setAirline(String airline) { this.airline = airline; }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public String getFrom() { return from; }
    public void setFrom(String from) { this.from = from; }

    public String getTo() { return to; }
    public void setTo(String to) { this.to = to; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getDepartureTime() { return departureTime; }
    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }

    public String getArrivalTime() { return arrivalTime; }
    public void setArrivalTime(String arrivalTime) { this.arrivalTime = arrivalTime; }
}