package com.GoPRO.GoPRO.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.Budget;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class BudgetService {

    private static final String COLLECTION_NAME = "budgets";

    public String saveBudget(Budget budget) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        db.collection(COLLECTION_NAME).document(budget.getUserId()).set(budget).get();
        return "Budget saved successfully!";
    }

    public Budget getBudget(String userId) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        return db.collection(COLLECTION_NAME).document(userId).get().get().toObject(Budget.class);
    }
}