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

    @GetMapping
    public List<FlightDTO> getFlights(@RequestParam Double budget,
                                      @RequestParam String from,
                                      @RequestParam String to,
                                      @RequestParam String date) {
        return flightService.getFlights(budget, from, to, date);
    }
}