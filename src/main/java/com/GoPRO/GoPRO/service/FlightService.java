package com.GoPRO.GoPRO.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.FlightDTO;
@Service
public class FlightService {

    private List<FlightDTO> allFlights = List.of(
        new FlightDTO("IndiGo", "BOM", "DEL", "2025-10-16", 5000.0),
        new FlightDTO("SpiceJet", "BOM", "DEL", "2025-10-16", 7000.0),
        new FlightDTO("AirIndia", "BOM", "DEL", "2025-10-16", 10000.0)
    );

    public List<FlightDTO> getFlights(Double budget, String from, String to, String date) {
        return allFlights.stream()
                .filter(f -> f.getPrice() <= budget)
                .filter(f -> f.getFrom().equalsIgnoreCase(from))
                .filter(f -> f.getTo().equalsIgnoreCase(to))
                .filter(f -> f.getDate().equals(date))
                .collect(Collectors.toList());
    }
}