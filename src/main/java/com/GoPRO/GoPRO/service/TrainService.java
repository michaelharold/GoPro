package com.GoPRO.GoPRO.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.TrainDTO;

@Service
public class TrainService {

    private List<TrainDTO> allTrains = List.of(
        // --- 2025-10-19 Mumbai → Delhi ---  new TrainDTO("Rajdhani Express", "12301", "Delhi", "Mumbai", "2025-10-18", 2200.0, "06:30 AM"),
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
        new TrainDTO("Duronto Express", "12240", "Mumbai", "Delhi", "2025-10-19", 2500.0, "09:15 AM"),
        new TrainDTO("Golden Temple Mail", "12904", "Mumbai", "Delhi", "2025-10-19", 2000.0, "05:00 AM"),
        new TrainDTO("Punjab Mail", "12138", "Mumbai", "Delhi", "2025-10-19", 2100.0, "07:10 AM"),
        new TrainDTO("Mumbai Rajdhani", "12952", "Mumbai", "Delhi", "2025-10-19", 2400.0, "03:00 PM"),
        new TrainDTO("Konark Express", "11019", "Mumbai", "Delhi", "2025-10-19", 2200.0, "10:30 PM"),
        new TrainDTO("Kolkata Express", "12345", "Mumbai", "Delhi", "2025-10-19", 2600.0, "11:15 AM"),
        new TrainDTO("Western Express", "12900", "Mumbai", "Delhi", "2025-10-19", 2100.0, "04:00 PM"),
        new TrainDTO("Southern Mail", "12550", "Mumbai", "Delhi", "2025-10-19", 2250.0, "08:45 AM"),
        new TrainDTO("Central Express", "12777", "Mumbai", "Delhi", "2025-10-19", 2300.0, "12:30 PM"),

        // --- 2025-10-20 Mumbai → Delhi ---
        new TrainDTO("Rajdhani Express", "12303", "Mumbai", "Delhi", "2025-10-20", 2300.0, "06:45 AM"),
        new TrainDTO("Duronto Express", "12241", "Mumbai", "Delhi", "2025-10-20", 2500.0, "09:15 AM"),
        new TrainDTO("Golden Temple Mail", "12905", "Mumbai", "Delhi", "2025-10-20", 2000.0, "05:00 AM"),
        new TrainDTO("Punjab Mail", "12139", "Mumbai", "Delhi", "2025-10-20", 2100.0, "07:10 AM"),
        new TrainDTO("Mumbai Rajdhani", "12953", "Mumbai", "Delhi", "2025-10-20", 2400.0, "03:00 PM"),
        new TrainDTO("Konark Express", "11021", "Mumbai", "Delhi", "2025-10-20", 2200.0, "10:30 PM"),
        new TrainDTO("Kolkata Express", "12346", "Mumbai", "Delhi", "2025-10-20", 2600.0, "11:15 AM"),
        new TrainDTO("Western Express", "12901", "Mumbai", "Delhi", "2025-10-20", 2100.0, "04:00 PM"),
        new TrainDTO("Southern Mail", "12551", "Mumbai", "Delhi", "2025-10-20", 2250.0, "08:45 AM"),
        new TrainDTO("Central Express", "12778", "Mumbai", "Delhi", "2025-10-20", 2300.0, "12:30 PM"),

        // --- 2025-10-19 Delhi → Mumbai ---
        new TrainDTO("Rajdhani Express", "12304", "Delhi", "Mumbai", "2025-10-19", 2300.0, "07:00 AM"),
        new TrainDTO("Duronto Express", "12242", "Delhi", "Mumbai", "2025-10-19", 2500.0, "10:00 AM"),
        new TrainDTO("Golden Temple Mail", "12906", "Delhi", "Mumbai", "2025-10-19", 2000.0, "05:30 AM"),
        new TrainDTO("Punjab Mail", "12140", "Delhi", "Mumbai", "2025-10-19", 2100.0, "08:00 AM"),
        new TrainDTO("Delhi Rajdhani", "12954", "Delhi", "Mumbai", "2025-10-19", 2400.0, "02:00 PM"),
        new TrainDTO("Konark Express", "11022", "Delhi", "Mumbai", "2025-10-19", 2200.0, "11:00 PM"),
        new TrainDTO("Kolkata Express", "12347", "Delhi", "Mumbai", "2025-10-19", 2600.0, "09:30 AM"),
        new TrainDTO("Western Express", "12902", "Delhi", "Mumbai", "2025-10-19", 2100.0, "03:15 PM"),
        new TrainDTO("Southern Mail", "12552", "Delhi", "Mumbai", "2025-10-19", 2250.0, "06:45 AM"),
        new TrainDTO("Central Express", "12779", "Delhi", "Mumbai", "2025-10-19", 2300.0, "01:30 PM"),

        // --- 2025-10-20 Delhi → Mumbai ---
        new TrainDTO("Rajdhani Express", "12305", "Delhi", "Mumbai", "2025-10-20", 2300.0, "07:00 AM"),
        new TrainDTO("Duronto Express", "12243", "Delhi", "Mumbai", "2025-10-20", 2500.0, "10:00 AM"),
        new TrainDTO("Golden Temple Mail", "12907", "Delhi", "Mumbai", "2025-10-20", 2000.0, "05:30 AM"),
        new TrainDTO("Punjab Mail", "12141", "Delhi", "Mumbai", "2025-10-20", 2100.0, "08:00 AM"),
        new TrainDTO("Delhi Rajdhani", "12955", "Delhi", "Mumbai", "2025-10-20", 2400.0, "02:00 PM"),
        new TrainDTO("Konark Express", "11023", "Delhi", "Mumbai", "2025-10-20", 2200.0, "11:00 PM"),
        new TrainDTO("Kolkata Express", "12348", "Delhi", "Mumbai", "2025-10-20", 2600.0, "09:30 AM"),
        new TrainDTO("Western Express", "12903", "Delhi", "Mumbai", "2025-10-20", 2100.0, "03:15 PM"),
        new TrainDTO("Southern Mail", "12553", "Delhi", "Mumbai", "2025-10-20", 2250.0, "06:45 AM"),
        new TrainDTO("Central Express", "12780", "Delhi", "Mumbai", "2025-10-20", 2300.0, "01:30 PM")
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