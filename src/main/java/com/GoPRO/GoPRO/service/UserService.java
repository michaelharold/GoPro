package com.GoPRO.GoPRO.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.GoPRO.GoPRO.entity.User;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class UserService {

    private static final String COLLECTION_NAME = "users";

    public String saveUser(User user) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        db.collection(COLLECTION_NAME).document(user.getId()).set(user).get();
        return "User saved successfully!";
    }

    public User getUser(String id) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        return db.collection(COLLECTION_NAME).document(id).get().get().toObject(User.class);
    }
}