package com.example.onlineeducationplatform.mapper;


import com.example.onlineeducationplatform.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface UserMapper {
    User selectUserById(int id);
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(int id);

    List<User> getUserList();
}
