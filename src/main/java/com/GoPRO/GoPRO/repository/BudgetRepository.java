package com.GoPRO.GoPRO.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GoPRO.GoPRO.entity.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    List<Budget> findByUserId(Long userId);
}