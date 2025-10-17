package com.GoPRO.GoPRO.entity;

public class Budget {

    private String userId;
    private double totalBudget;
    private double travelBudget;
    private double accommodationBudget;
    private int days;
    private String date;
    private String transport;
    private String from;
    private String to;

    public Budget() {}

    // Getters and Setters
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public double getTotalBudget() { return totalBudget; }
    public void setTotalBudget(double totalBudget) { this.totalBudget = totalBudget; }

    public double getTravelBudget() { return travelBudget; }
    public void setTravelBudget(double travelBudget) { this.travelBudget = travelBudget; }

    public double getAccommodationBudget() { return accommodationBudget; }
    public void setAccommodationBudget(double accommodationBudget) { this.accommodationBudget = accommodationBudget; }

    public int getDays() { return days; }
    public void setDays(int days) { this.days = days; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getTransport() { return transport; }
    public void setTransport(String transport) { this.transport = transport; }

    public String getFrom() { return from; }
    public void setFrom(String from) { this.from = from; }

    public String getTo() { return to; }
    public void setTo(String to) { this.to = to; }
}