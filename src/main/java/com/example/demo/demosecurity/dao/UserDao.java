package com.example.demo.demosecurity.dao;


import com.example.demo.demosecurity.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
}
