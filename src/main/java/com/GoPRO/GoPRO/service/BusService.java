package com.GoPRO.GoPRO.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.BusDTO;

@Service
public class BusService {

    private List<BusDTO> mockBuses = List.of(
        new BusDTO("KPN Travels", "Bangalore", "Chennai", "2025-10-18", 950.0),
        new BusDTO("VRL Deluxe", "Bangalore", "Chennai", "2025-10-18", 1200.0),
        new BusDTO("SRS Express", "Bangalore", "Chennai", "2025-10-18", 1500.0),
        new BusDTO("Orange Tours", "Hyderabad", "Bangalore", "2025-10-18", 1100.0),
        new BusDTO("GreenLine Volvo", "Hyderabad", "Bangalore", "2025-10-18", 1300.0),
        new BusDTO("RedBus Travels", "Mumbai", "Pune", "2025-10-18", 700.0),
        new BusDTO("KSRTC Airavat", "Bangalore", "Mysore", "2025-10-18", 600.0),
        new BusDTO("National Express", "Delhi", "Jaipur", "2025-10-18", 800.0)
    );

    public List<BusDTO> getBuses(Double budget, String from, String to, String date) {
        return mockBuses.stream()
                .filter(b -> (budget == null || b.getPrice() <= budget))
                .filter(b -> (from == null || b.getFrom().equalsIgnoreCase(from)))
                .filter(b -> (to == null || b.getTo().equalsIgnoreCase(to)))
                .filter(b -> (date == null || b.getDate().equals(date)))
                .collect(Collectors.toList());
    }

    // optional for dropdowns
    public List<String> getAllCities() {
        return mockBuses.stream()
                .flatMap(b -> List.of(b.getFrom(), b.getTo()).stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}