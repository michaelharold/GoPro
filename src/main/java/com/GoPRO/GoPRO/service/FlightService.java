package com.GoPRO.GoPRO.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.FlightDTO;

@Service
public class FlightService {

    private final List<FlightDTO> allFlights;

    public FlightService() {
        allFlights = new ArrayList<>();

        String[] dates = { "2025-10-16", "2025-10-17", "2025-10-18" };
        // use city names now instead of airport codes
        String[][] routes = {
            { "Mumbai", "Delhi" },
            { "Mumbai", "Bangalore" },
            { "Mumbai", "Chennai" },
            { "Delhi", "Bangalore" },
            { "Bangalore", "Hyderabad" },
            { "Kolkata", "Mumbai" }
        };

        int counter = 100;
        for (String date : dates) {
            for (String[] route : routes) {
                String from = route[0];
                String to = route[1];

                allFlights.add(new FlightDTO("IndiGo", "6E" + (counter++), from, to, date, 3500.0, "06:00", "08:00"));
                allFlights.add(new FlightDTO("SpiceJet", "SG" + (counter++), from, to, date, 4200.0, "08:30", "10:30"));
                allFlights.add(new FlightDTO("Air India", "AI" + (counter++), from, to, date, 5200.0, "11:00", "13:00"));
                allFlights.add(new FlightDTO("Vistara", "UK" + (counter++), from, to, date, 6500.0, "14:00", "16:00"));
                allFlights.add(new FlightDTO("GoAir", "G8" + (counter++), from, to, date, 3000.0, "17:30", "19:30"));
                allFlights.add(new FlightDTO("Akasa", "QP" + (counter++), from, to, date, 2800.0, "20:00", "22:00"));
            }
        }

        // extra mock flights for Mumbai → Delhi on primary date
        for (int i = 0; i < 5; i++) {
            allFlights.add(new FlightDTO("MockAir", "MK" + (counter++), "Mumbai", "Delhi", "2025-10-16", 2500.0 + i * 500,
                                         String.format("%02d:00", 6 + i), String.format("%02d:30", 8 + i)));
        }
    }

    public List<FlightDTO> getFlights(Double budget, String from, String to, String date) {
        return allFlights.stream()
                .filter(f -> date == null || date.isBlank() || date.equals(f.getDate()))
                .filter(f -> budget == null || f.getPrice() <= budget)
                .filter(f -> from == null || from.isBlank() || f.getFrom().equalsIgnoreCase(from))
                .filter(f -> to == null || to.isBlank() || f.getTo().equalsIgnoreCase(to))
                .collect(Collectors.toList());
    }

    public List<String> getAllDestinations() {
        return allFlights.stream()
                .map(FlightDTO::getTo)
                .distinct()
                .collect(Collectors.toList());
    }
}
