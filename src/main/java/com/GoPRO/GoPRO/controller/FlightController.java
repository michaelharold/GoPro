package com.GoPRO.GoPRO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.GoPRO.GoPRO.entity.FlightDTO;
import com.GoPRO.GoPRO.service.FlightService;

@RestController
@RequestMapping("/api/flights")
@CrossOrigin(origins = "*")
public class FlightController {

    @Autowired
    private FlightService flightService;

    /**
     * GET /api/flights?budget=5000&from=BOM&to=DEL&date=2025-10-16
     * - budget and date are recommended; from/to optional
     */
    @GetMapping
    public List<FlightDTO> getFlights(
            @RequestParam(required = false) Double budget,
            @RequestParam(required = false) String from,
            @RequestParam(required = false) String to,
            @RequestParam(required = false) String date) {

        return flightService.getFlights(budget, from, to, date);
    }

    /** optional endpoint to get mock destination codes used by UI */
    @GetMapping("/destinations")
    public List<String> getDestinations() {
        return flightService.getAllDestinations();
    }
}