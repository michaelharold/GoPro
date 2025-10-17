package com.GoPRO.GoPRO.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "budget")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "total_budget")
    private Double totalBudget;

    @Column(name = "travel_budget")
    private Double travelBudget;

    @Column(name = "accommodation_budget")
    private Double accommodationBudget;

    private Integer days;

    private String date;

    private String transport;

    @Column(name = "from_location") // renamed to avoid SQL keyword conflict
    private String from;

    @Column(name = "to_location")
    private String to;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public Double getTotalBudget() { return totalBudget; }
    public void setTotalBudget(Double totalBudget) { this.totalBudget = totalBudget; }

    public Double getTravelBudget() { return travelBudget; }
    public void setTravelBudget(Double travelBudget) { this.travelBudget = travelBudget; }

    public Double getAccommodationBudget() { return accommodationBudget; }
    public void setAccommodationBudget(Double accommodationBudget) { this.accommodationBudget = accommodationBudget; }

    public Integer getDays() { return days; }
    public void setDays(Integer days) { this.days = days; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getTransport() { return transport; }
    public void setTransport(String transport) { this.transport = transport; }

    public String getFrom() { return from; }
    public void setFrom(String from) { this.from = from; }

    public String getTo() { return to; }
    public void setTo(String to) { this.to = to; }
}