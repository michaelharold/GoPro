package com.GoPRO.GoPRO.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GoPRO.GoPRO.entity.Budget;
import com.GoPRO.GoPRO.service.BudgetService;

@RestController
@RequestMapping("/api/budget")
@CrossOrigin(origins = "*")
public class BudgetController {

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @PostMapping("/save")
    public String saveBudget(@RequestBody Budget budget) throws ExecutionException, InterruptedException {
        return budgetService.saveBudget(budget);
    }

    @GetMapping("/{userId}")
    public Budget getBudget(@PathVariable String userId) throws ExecutionException, InterruptedException {
        return budgetService.getBudget(userId);
    }
}