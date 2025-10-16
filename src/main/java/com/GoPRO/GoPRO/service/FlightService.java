package com.GoPRO.GoPRO.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.FlightDTO;

@Service
public class FlightService {

    private List<FlightDTO> allFlights = List.of(
        new FlightDTO("IndiGo", "BOM", "DEL", 5000.0),
        new FlightDTO("SpiceJet", "BOM", "DEL", 7000.0),
        new FlightDTO("AirIndia", "BOM", "DEL", 10000.0)
    );

    public List<FlightDTO> getFlightsUnderBudget(Double budget) {
        return allFlights.stream()
                         .filter(f -> f.getPrice() <= budget)
                         .collect(Collectors.toList());
    }
}