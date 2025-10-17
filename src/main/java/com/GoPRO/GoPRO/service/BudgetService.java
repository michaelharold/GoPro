package com.GoPRO.GoPRO.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.Budget;

@Service
public class BudgetService {

    // In-memory storage for budgets
    private final ConcurrentHashMap<String, List<Budget>> userBudgets = new ConcurrentHashMap<>();

    public Budget saveBudget(Budget budget) {
        // Split budget into 70% travel, 30% accommodation
        budget.setTravelBudget(budget.getTotalBudget() * 0.7);
        budget.setAccommodationBudget(budget.getTotalBudget() * 0.3);

        // Store in-memory
        userBudgets.computeIfAbsent(budget.getUserId(), k -> new ArrayList<>()).add(budget);

        return budget;
    }

    public List<Budget> getUserBudgets(String userId) {
        return userBudgets.getOrDefault(userId, new ArrayList<>());
    }
}