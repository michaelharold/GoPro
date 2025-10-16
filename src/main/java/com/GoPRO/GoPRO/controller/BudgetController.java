package com.GoPRO.GoPRO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    // Compute 70/30 split
    budget.setTravelBudget(budget.getTotalBudget() * 0.7);
    budget.setAccommodationBudget(budget.getTotalBudget() * 0.3);

    // Save to database
    Budget saved = budgetRepository.save(budget);

    // Return saved budget as JSON
    return ResponseEntity.ok(saved);
}

    @GetMapping("/{userId}")
    public List<Budget> getUserBudgets(@PathVariable Long userId) {
        return budgetRepository.findByUserId(userId);
    }
}