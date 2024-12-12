package com.BankManagement.Backend.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.BankManagement.Backend.entity.User;
import com.BankManagement.Backend.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Optional<User> findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }
}
