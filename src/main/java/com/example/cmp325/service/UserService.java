package com.example.cmp325.service;

import com.example.cmp325.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User updateUser(User user);
    List<User> getAllUsers();
}
