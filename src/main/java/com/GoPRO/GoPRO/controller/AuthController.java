package com.GoPRO.GoPRO.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GoPRO.GoPRO.entity.User;
import com.GoPRO.GoPRO.service.UserService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
public String register(@RequestBody User user) {
    try {
        return userService.saveUser(user);
    } catch (Exception e) {
        e.printStackTrace();
        return "Error: " + e.getMessage();
    }
}

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) throws ExecutionException, InterruptedException {
        return userService.getUser(id);
    }
}