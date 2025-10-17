package com.GoPRO.GoPRO.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;

@Service
public class UserService {

    private final Firestore firestore;

    public UserService(Firestore firestore) {
        this.firestore = firestore;
    }

    public String saveUser(User user) throws ExecutionException, InterruptedException {
        try {
            // Use email as document ID
            DocumentReference docRef = firestore.collection("users").document(user.getEmail());
            ApiFuture<WriteResult> result = docRef.set(user);
            return "User registered at: " + result.get().getUpdateTime();
        } catch (Exception e) {
            e.printStackTrace();
            throw e; // so controller can send error response
        }
    }

    public User getUser(String email) throws ExecutionException, InterruptedException {
        DocumentReference docRef = firestore.collection("users").document(email);
        return docRef.get().get().toObject(User.class);
    }
}