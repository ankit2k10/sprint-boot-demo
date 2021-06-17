package com.ankit.demo.services;

import com.ankit.demo.models.User;
import com.ankit.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
//    @Autowired
//    private UserRepository userRepository;

//    @Autowired
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public Iterable<User> findAll() {
        return null;
    }
}
