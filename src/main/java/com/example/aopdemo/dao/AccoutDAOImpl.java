package com.example.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccoutDAOImpl implements AccountDAO {

    @Override
    public void addAccount() {
        System.out.println(getClass() + ": DOING MY DB WORK");
    }
}
