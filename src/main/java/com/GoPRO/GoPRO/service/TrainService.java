package com.GoPRO.GoPRO.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.TrainDTO;

@Service
public class TrainService {

    private List<TrainDTO> allTrains = List.of(
        // --- 2025-10-18 ---
        new TrainDTO("Rajdhani Express", "12301", "Delhi", "Mumbai", "2025-10-18", 2200.0, "06:30 AM"),
        new TrainDTO("Shatabdi Express", "12009", "Delhi", "Bhopal", "2025-10-18", 1500.0, "07:45 AM"),
        new TrainDTO("Duronto Express", "12239", "Mumbai", "Pune", "2025-10-18", 900.0, "09:00 AM"),
        new TrainDTO("Chennai Express", "12609", "Chennai", "Bangalore", "2025-10-18", 800.0, "08:15 AM"),
        new TrainDTO("Bangalore Mail", "12658", "Bangalore", "Chennai", "2025-10-18", 950.0, "10:45 AM"),
        new TrainDTO("Hyderabad Express", "17032", "Hyderabad", "Bangalore", "2025-10-18", 1100.0, "05:15 PM"),
        new TrainDTO("Goa Sampark Kranti", "12449", "Delhi", "Goa", "2025-10-18", 3200.0, "03:20 PM"),
        new TrainDTO("Konark Express", "11020", "Bhubaneswar", "Mumbai", "2025-10-18", 2900.0, "07:00 PM"),
        new TrainDTO("Jan Shatabdi", "12056", "Bangalore", "Mysore", "2025-10-18", 700.0, "01:00 PM"),

        // --- 2025-10-19 ---
        new TrainDTO("Rajdhani Express", "12302", "Mumbai", "Delhi", "2025-10-19", 2300.0, "06:45 AM"),
        new TrainDTO("Shatabdi Express", "12010", "Bhopal", "Delhi", "2025-10-19", 1550.0, "08:00 AM"),
        new TrainDTO("Duronto Express", "12240", "Pune", "Mumbai", "2025-10-19", 950.0, "09:15 AM"),
        new TrainDTO("Chennai Express", "12610", "Bangalore", "Chennai", "2025-10-19", 850.0, "08:30 AM"),
        new TrainDTO("Bangalore Mail", "12657", "Chennai", "Bangalore", "2025-10-19", 970.0, "10:30 AM"),
        new TrainDTO("Hyderabad Express", "17031", "Bangalore", "Hyderabad", "2025-10-19", 1150.0, "05:45 PM"),
        new TrainDTO("Goa Express", "12779", "Delhi", "Goa", "2025-10-19", 3100.0, "03:10 PM"),
        new TrainDTO("Konark Express", "11019", "Mumbai", "Bhubaneswar", "2025-10-19", 2850.0, "07:30 PM"),
        new TrainDTO("Jan Shatabdi", "12055", "Mysore", "Bangalore", "2025-10-19", 750.0, "12:45 PM")
    );

    public List<TrainDTO> getTrains(Double budget, String from, String to, String date) {
        return allTrains.stream()
                .filter(t -> t.getPrice() <= budget)
                .filter(t -> t.getFrom().equalsIgnoreCase(from))
                .filter(t -> t.getTo().equalsIgnoreCase(to))
                .filter(t -> t.getDate().equals(date))
                .collect(Collectors.toList());
    }

    public List<String> getAvailableStations() {
        return allTrains.stream()
                .flatMap(t -> List.of(t.getFrom(), t.getTo()).stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}