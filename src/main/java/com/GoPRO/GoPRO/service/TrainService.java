package com.GoPRO.GoPRO.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.TrainDTO;

@Service
public class TrainService {

    private List<TrainDTO> allTrains = List.of(
        new TrainDTO("Rajdhani Express", "BOM", "DEL", "2025-10-16", 2500.0),
        new TrainDTO("Shatabdi Express", "BOM", "DEL", "2025-10-16", 3000.0),
        new TrainDTO("Duronto Express", "BOM", "DEL", "2025-10-16", 3500.0)
    );

    public List<TrainDTO> getTrains(Double budget, String from, String to, String date) {
        return allTrains.stream()
                .filter(t -> t.getPrice() <= budget)
                .filter(t -> t.getFrom().equalsIgnoreCase(from))
                .filter(t -> t.getTo().equalsIgnoreCase(to))
                .filter(t -> t.getDate().equals(date))
                .collect(Collectors.toList());
    }
}