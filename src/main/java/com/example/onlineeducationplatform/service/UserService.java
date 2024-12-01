package com.example.onlineeducationplatform.service;

import com.example.onlineeducationplatform.dao.User;

import java.util.List;

public interface UserService {
    User getUserById(int id);

    List<User> getUserList();

    void addUser(User user);

    void updateUser(User user);

    void delete(int id);
}
