package com.GoPRO.GoPRO.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.TrainDTO;

@Service
public class TrainService {

    private List<TrainDTO> mockTrains = List.of(
        new TrainDTO("Rajdhani Express", "Delhi", "Mumbai", "2025-10-18", 3200.0),
        new TrainDTO("Shatabdi Express", "Delhi", "Mumbai", "2025-10-18", 2700.0),
        new TrainDTO("Duronto Express", "Delhi", "Mumbai", "2025-10-18", 3500.0),
        new TrainDTO("Garib Rath", "Delhi", "Kolkata", "2025-10-18", 1600.0),
        new TrainDTO("Superfast Express", "Delhi", "Kolkata", "2025-10-18", 1900.0),
        new TrainDTO("Chennai Mail", "Bangalore", "Chennai", "2025-10-18", 850.0),
        new TrainDTO("Intercity Express", "Bangalore", "Mysore", "2025-10-18", 500.0),
        new TrainDTO("Tejas Express", "Delhi", "Lucknow", "2025-10-18", 2200.0)
    );

    public List<TrainDTO> getTrains(Double budget, String from, String to, String date) {
        return mockTrains.stream()
                .filter(t -> (budget == null || t.getPrice() <= budget))
                .filter(t -> (from == null || t.getFrom().equalsIgnoreCase(from)))
                .filter(t -> (to == null || t.getTo().equalsIgnoreCase(to)))
                .filter(t -> (date == null || t.getDate().equals(date)))
                .collect(Collectors.toList());
    }

    // optional for UI dropdowns
    public List<String> getAllStations() {
        return mockTrains.stream()
                .flatMap(t -> List.of(t.getFrom(), t.getTo()).stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}