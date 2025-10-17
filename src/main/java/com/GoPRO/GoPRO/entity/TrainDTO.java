package com.GoPRO.GoPRO.entity;

public class TrainDTO {
    private String name;
    private String number;
    private String from;
    private String to;
    private String date;
    private double price;
    private String departureTime;

    public TrainDTO(String name, String number, String from, String to, String date, double price, String departureTime) {
        this.name = name;
        this.number = number;
        this.from = from;
        this.to = to;
        this.date = date;
        this.price = price;
        this.departureTime = departureTime;
    }

    public String getName() { return name; }
    public String getNumber() { return number; }
    public String getFrom() { return from; }
    public String getTo() { return to; }
    public String getDate() { return date; }
    public double getPrice() { return price; }
    public String getDepartureTime() { return departureTime; }

    public void setName(String name) { this.name = name; }
    public void setNumber(String number) { this.number = number; }
    public void setFrom(String from) { this.from = from; }
    public void setTo(String to) { this.to = to; }
    public void setDate(String date) { this.date = date; }
    public void setPrice(double price) { this.price = price; }
    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }
}