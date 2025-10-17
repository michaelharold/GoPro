package com.GoPRO.GoPRO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.GoPRO.GoPRO.entity.TrainDTO;
import com.GoPRO.GoPRO.service.TrainService;

@RestController
@RequestMapping("/api/trains")

@CrossOrigin(origins = "*")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @GetMapping
    public List<TrainDTO> getTrains(@RequestParam Double budget,
                                    @RequestParam String from,
                                    @RequestParam String to,
                                    @RequestParam String date) {
        return trainService.getTrains(budget, from, to, date);
    }
}