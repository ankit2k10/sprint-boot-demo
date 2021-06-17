package com.ankit.demo.controllers;

import com.ankit.demo.models.User;
import com.ankit.demo.repository.UserRepository;
import com.ankit.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HealthController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String greeting() {
        return "Hello";
    }

    @GetMapping("/users")
    public Iterable<User> findAll() {
        userService.findAll();
        System.out.println(userService);
        List<User> list = new ArrayList<>();
        list.add(new User(1, "ankit", "ch"));
        return list;
    }
}
