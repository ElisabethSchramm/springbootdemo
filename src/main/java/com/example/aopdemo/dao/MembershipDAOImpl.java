package com.example.aopdemo.dao;

import com.example.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {

    @Override
    public void addAccount(Account account) {
        System.out.println(getClass() + ": DOING MY DB WORK");
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println(getClass() + ": DOING MY DB WORK");
    }
}
