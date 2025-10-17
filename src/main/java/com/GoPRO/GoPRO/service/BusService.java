package com.GoPRO.GoPRO.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.BusDTO;

@Service
public class BusService {

    private List<BusDTO> allBuses = List.of(
        // --- Existing buses ---
        new BusDTO("Volvo Express", "Bangalore", "Chennai", "2025-10-18", 950.0),
        new BusDTO("Greenline Travels", "Bangalore", "Chennai", "2025-10-18", 1100.0),
        new BusDTO("SRS Travels", "Bangalore", "Chennai", "2025-10-18", 1250.0),
        new BusDTO("KPN Travels", "Bangalore", "Hyderabad", "2025-10-18", 1350.0),
        new BusDTO("Rajdhani Travels", "Delhi", "Mumbai", "2025-10-19", 1200.0),
        new BusDTO("RedLine Express", "Delhi", "Mumbai", "2025-10-19", 1350.0),
        new BusDTO("InterCity Volvo", "Delhi", "Mumbai", "2025-10-19", 1500.0),
        new BusDTO("ComfortRide", "Delhi", "Mumbai", "2025-10-19", 1100.0),
        new BusDTO("BlueSky Travels", "Mumbai", "Delhi", "2025-10-19", 1250.0),
        new BusDTO("UrbanExpress", "Mumbai", "Delhi", "2025-10-19", 1400.0),
        new BusDTO("NightLine Volvo", "Mumbai", "Delhi", "2025-10-19", 1550.0),
        new BusDTO("SuperSaver Bus", "Mumbai", "Delhi", "2025-10-19", 1000.0),
        // --- 2025-10-19 Kerala routes (Kollam, Ernakulam, Trivandrum, etc.) ---
        new BusDTO("Kerala Deluxe 1", "Kollam", "Ernakulam", "2025-10-19", 600.0),
        new BusDTO("Kerala Deluxe 2", "Kollam", "Ernakulam", "2025-10-19", 650.0),
        new BusDTO("Kerala Express 1", "Kollam", "Ernakulam", "2025-10-19", 700.0),
        new BusDTO("Kerala Express 2", "Kollam", "Ernakulam", "2025-10-19", 750.0),
        new BusDTO("Trivandrum Ernakulam Express", "Trivandrum", "Ernakulam", "2025-10-19", 800.0),
        new BusDTO("Kochi Deluxe", "Kochi", "Ernakulam", "2025-10-19", 550.0),
        new BusDTO("Alleppey Express", "Alleppey", "Ernakulam", "2025-10-19", 600.0),
        new BusDTO("Kottayam Comfort", "Kottayam", "Ernakulam", "2025-10-19", 620.0),
        new BusDTO("Calicut Express", "Calicut", "Ernakulam", "2025-10-19", 900.0),
        new BusDTO("Kannur Express", "Kannur", "Ernakulam", "2025-10-19", 1000.0),
        new BusDTO("Kerala Deluxe 1", "Kollam", "Kannur", "2025-10-19", 600.0),
        new BusDTO("Kerala Deluxe 2", "Kannur", "Kollam", "2025-10-19", 650.0),

        // --- 2025-10-20 Kerala routes (Kollam → Ernakulam etc.) ---
        new BusDTO("Kerala Deluxe 1", "Kollam", "Ernakulam", "2025-10-20", 600.0),
        new BusDTO("Kerala Deluxe 2", "Kollam", "Ernakulam", "2025-10-20", 650.0),
        new BusDTO("Kerala Express 1", "Kollam", "Ernakulam", "2025-10-20", 700.0),
        new BusDTO("Kerala Express 2", "Kollam", "Ernakulam", "2025-10-20", 750.0),
        new BusDTO("Trivandrum Ernakulam Express", "Trivandrum", "Ernakulam", "2025-10-20", 800.0),
        new BusDTO("Kochi Deluxe", "Kochi", "Ernakulam", "2025-10-20", 550.0),
        new BusDTO("Alleppey Express", "Alleppey", "Ernakulam", "2025-10-20", 600.0),
        new BusDTO("Kottayam Comfort", "Kottayam", "Ernakulam", "2025-10-20", 620.0),
        new BusDTO("Calicut Express", "Calicut", "Ernakulam", "2025-10-20", 900.0),
        new BusDTO("Kannur Express", "Kannur", "Ernakulam", "2025-10-20", 1000.0)
        
        // You can add more as needed for other dates and cities
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