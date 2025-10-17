package com.GoPRO.GoPRO.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.Budget;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class FirebaseService {

    private static final String COLLECTION_NAME = "budgets";

    public Budget saveBudget(Budget budget) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();

        // Compute budgets
        budget.setTravelBudget(budget.getTotalBudget() * 0.7);
        budget.setAccommodationBudget(budget.getTotalBudget() * 0.3);

        ApiFuture<WriteResult> future = db.collection(COLLECTION_NAME).document().set(budget);
        future.get(); // Wait for write completion
        return budget;
    }
}