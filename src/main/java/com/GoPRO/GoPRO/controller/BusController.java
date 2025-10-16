package com.GoPRO.GoPRO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.GoPRO.GoPRO.entity.BusDTO;
import com.GoPRO.GoPRO.service.BusService;

@RestController
@RequestMapping("/api/buses")
@CrossOrigin(origins = "*")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping
    public List<BusDTO> getBuses(@RequestParam Double budget,
                                 @RequestParam String from,
                                 @RequestParam String to,
                                 @RequestParam String date) {
        return busService.getBuses(budget, from, to, date);
    }
}