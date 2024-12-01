package com.example.onlineeducationplatform.service.impl;

import com.example.onlineeducationplatform.dao.User;
//import com.example.onlineeducationplatform.mapper.UserMapper;
import com.example.onlineeducationplatform.mapper.UserMapper;
import com.example.onlineeducationplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void delete(int id) {
        userMapper.deleteUser(id);
    }
    // 实现其他方法...
}