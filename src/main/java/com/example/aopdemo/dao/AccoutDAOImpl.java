package com.example.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccoutDAOImpl implements AccountDAO {

    @Override
    public void addAccount() {
        System.out.println(getClass() + ": DOING MY DB WORK");
    }

    @Override
    public boolean updateAccount() {
        System.out.println(getClass() + ": DOING MY DB WORK");
        return true;
    }
}
