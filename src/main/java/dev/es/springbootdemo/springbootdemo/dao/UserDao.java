package dev.es.springbootdemo.springbootdemo.dao;


import dev.es.springbootdemo.springbootdemo.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
}
