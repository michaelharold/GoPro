package com.GoPRO.GoPRO.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.BusDTO;

@Service
public class BusService {

    private List<BusDTO> allBuses = List.of(
        new BusDTO("Volvo Express", "Bangalore", "Chennai", "2025-10-18", 950.0),
        new BusDTO("Greenline Travels", "Bangalore", "Chennai", "2025-10-18", 1100.0),
        new BusDTO("SRS Travels", "Bangalore", "Chennai", "2025-10-18", 1250.0),
        new BusDTO("KPN Travels", "Bangalore", "Hyderabad", "2025-10-18", 1350.0),
        new BusDTO("VRL Bus", "Chennai", "Hyderabad", "2025-10-19", 1400.0),
        new BusDTO("Orange Travels", "Hyderabad", "Bangalore", "2025-10-18", 1000.0),
        new BusDTO("Shivaji Bus Service", "Mumbai", "Pune", "2025-10-20", 700.0),
        new BusDTO("Delhi Travels", "Delhi", "Mumbai", "2025-10-21", 1800.0),
        new BusDTO("Pune Express", "Pune", "Bangalore", "2025-10-22", 1200.0),
        new BusDTO("Kochi Travels", "Kochi", "Chennai", "2025-10-23", 950.0),
        new BusDTO("Hyderabad Deluxe", "Hyderabad", "Delhi", "2025-10-24", 2000.0),
        new BusDTO("Mumbai Night Rider", "Mumbai", "Delhi", "2025-10-25", 2100.0),
        new BusDTO("Bangalore Comfort", "Bangalore", "Pune", "2025-10-26", 1100.0),
        new BusDTO("Chennai Superfast", "Chennai", "Kochi", "2025-10-27", 1300.0),
        new BusDTO("Pune Night Express", "Pune", "Delhi", "2025-10-28", 1900.0),
        new BusDTO("Delhi Star", "Delhi", "Kochi", "2025-10-29", 2200.0),
        new BusDTO("Kochi Deluxe", "Kochi", "Mumbai", "2025-10-30", 1700.0),
        new BusDTO("Hyderabad Express", "Hyderabad", "Pune", "2025-10-31", 1600.0),
        new BusDTO("Greenline Night", "Bangalore", "Delhi", "2025-11-01", 2300.0),
        new BusDTO("Volvo Comfort", "Chennai", "Mumbai", "2025-11-02", 2000.0),
        new BusDTO("National Express", "Bangalore", "Chennai", "2025-10-18", 900.0),
        new BusDTO("CityLink Travels", "Bangalore", "Chennai", "2025-10-18", 1150.0),
        new BusDTO("Raj Express", "Bangalore", "Hyderabad", "2025-10-18", 1400.0),
        new BusDTO("Skyline Travels", "Bangalore", "Hyderabad", "2025-10-18", 1250.0),
        new BusDTO("Metroline Deluxe", "Hyderabad", "Bangalore", "2025-10-18", 950.0),
        new BusDTO("Classic Tours", "Hyderabad", "Bangalore", "2025-10-18", 1100.0),
        new BusDTO("Comfort Line", "Mumbai", "Pune", "2025-10-18", 800.0),
        new BusDTO("SpeedStar Travels", "Bangalore", "Chennai", "2025-10-18", 1300.0),
        new BusDTO("NightKing Express", "Bangalore", "Chennai", "2025-10-18", 1450.0),
        new BusDTO("Elite Express", "Bangalore", "Hyderabad", "2025-10-18", 1550.0)
    );

    public List<BusDTO> getBuses(Double budget, String from, String to, String date) {
        return allBuses.stream()
                .filter(b -> b.getPrice() <= budget)
                .filter(b -> b.getFrom().equalsIgnoreCase(from))
                .filter(b -> b.getTo().equalsIgnoreCase(to))
                .filter(b -> b.getDate().equals(date))
                .collect(Collectors.toList());
    }

    public List<String> getAvailableCities() {
        return allBuses.stream()
                .flatMap(b -> List.of(b.getFrom(), b.getTo()).stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}