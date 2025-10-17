package com.GoPRO.GoPRO.entity;

public class BusDTO {
    private String name;
    private String from;
    private String to;
    private String date;
    private double price;

    public BusDTO(String name, String from, String to, String date, double price) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.date = date;
        this.price = price;
    }

    public String getName() { return name; }
    public String getFrom() { return from; }
    public String getTo() { return to; }
    public String getDate() { return date; }
    public double getPrice() { return price; }

    public void setName(String name) { this.name = name; }
    public void setFrom(String from) { this.from = from; }
    public void setTo(String to) { this.to = to; }
    public void setDate(String date) { this.date = date; }
    public void setPrice(double price) { this.price = price; }
}