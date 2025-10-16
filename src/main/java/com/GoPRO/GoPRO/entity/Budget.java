package com.GoPRO.GoPRO.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Double totalBudget;
    private Integer days;
    private String date;
    private String transport;
    private Double travelBudget;
    private Double accommodationBudget;
    private String from;
    private String to;

    public Budget() {}

    public Budget(Long userId, Double totalBudget, Integer days, String date, String transport, String from, String to) {
        this.userId = userId;
        this.totalBudget = totalBudget;
        this.days = days;
        this.date = date;
        this.transport = transport;
        this.travelBudget = totalBudget * 0.7;
        this.accommodationBudget = totalBudget * 0.3;
        this.from = from;
        this.to = to;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Double getTotalBudget() { return totalBudget; }
    public void setTotalBudget(Double totalBudget) { this.totalBudget = totalBudget; }

    public Integer getDays() { return days; }
    public void setDays(Integer days) { this.days = days; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getTransport() { return transport; }
    public void setTransport(String transport) { this.transport = transport; }

    public Double getTravelBudget() { return travelBudget; }
    public void setTravelBudget(Double travelBudget) { this.travelBudget = travelBudget; }

    public Double getAccommodationBudget() { return accommodationBudget; }
    public void setAccommodationBudget(Double accommodationBudget) { this.accommodationBudget = accommodationBudget; }

    public String getFrom() { return from; }
    public void setFrom(String from) { this.from = from; }

    public String getTo() { return to; }
    public void setTo(String to) { this.to = to; }
}