package com.example.cmp325.service;

import com.example.cmp325.model.User;
import com.example.cmp325.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplement implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        Optional<User> optionalUser = userRepository.findById(user.id);
        if (optionalUser.isPresent()) {
            User updateUser = new User();
            updateUser.id = user.id;
            updateUser.setFullName(user.getFullName());
            updateUser.setEmail(user.getEmail());
            updateUser.setPassword(user.getPassword());
            return userRepository.save(updateUser);
        } else {
            throw new RuntimeException("User not found");
        }
        // return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}