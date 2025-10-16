package com.GoPRO.GoPRO.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.BusDTO;

@Service
public class BusService {

    private List<BusDTO> allBuses = List.of(
        new BusDTO("Volvo Express", "BOM", "DEL", "2025-10-16", 5000.0),
        new BusDTO("SRS Travels", "BOM", "DEL", "2025-10-16", 7000.0),
        new BusDTO("RedBus Deluxe", "BOM", "DEL", "2025-10-16", 9000.0)
    );

    public List<BusDTO> getBuses(Double budget, String from, String to, String date) {
        return allBuses.stream()
                .filter(b -> b.getPrice() <= budget)
                .filter(b -> b.getFrom().equalsIgnoreCase(from))
                .filter(b -> b.getTo().equalsIgnoreCase(to))
                .filter(b -> b.getDate().equals(date))
                .collect(Collectors.toList());
    }
}