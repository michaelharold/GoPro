package com.GoPRO.GoPRO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.GoPRO.GoPRO.entity.HotelDTO;
import com.GoPRO.GoPRO.service.HotelService;

@RestController
@RequestMapping("/api/hotels")
@CrossOrigin(origins = "*")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<HotelDTO> getHotels(@RequestParam double budget,
                                    @RequestParam String location,
                                    @RequestParam int days,
                                    @RequestParam String date) {
        return hotelService.getHotels(budget, location, days, date);
    }
}
