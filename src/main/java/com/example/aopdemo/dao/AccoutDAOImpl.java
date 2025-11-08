package com.example.aopdemo.dao;

import com.example.aopdemo.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccoutDAOImpl implements AccountDAO {

    private String name;

    private String serviceCode;

    @Override
    public List<Account> findAccounts(boolean tripWire) {

        if (tripWire){
            throw new RuntimeException("for academic purposes");

        }
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("John", "silver"));
        accounts.add(new Account("Paul", "platinum"));
        accounts.add(new Account("Mary", "gold"));
        return accounts;
    }

    @Override
    public List<Account> findAccounts() {
        return findAccounts(false);
    }

    @Override
    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + ": DOING MY DB WORK");
    }

    public String getName() {
        System.out.println(getClass() + ": getName");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": setName");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + ": getServiceCode");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ": setServiceCode");
        this.serviceCode = serviceCode;
    }
}
