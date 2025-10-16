package com.GoPRO.GoPRO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GoPRO.GoPRO.entity.Budget;
import com.GoPRO.GoPRO.repository.BudgetRepository;

@RestController
@RequestMapping("/api/budget")
@CrossOrigin(origins = "*")
public class BudgetController {

    @Autowired
    private BudgetRepository budgetRepository;

    @PostMapping("/set")
    public ResponseEntity<Budget> setBudget(@RequestBody Budget budget) {
        budget.setTravelBudget(budget.getTotalBudget() * 0.7);
        budget.setAccommodationBudget(budget.getTotalBudget() * 0.3);
        Budget saved = budgetRepository.save(budget);
        return ResponseEntity.ok(saved);
    }
}