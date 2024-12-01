package com.example.onlineeducationplatform.dao;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String password;
    private String email;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }


}
