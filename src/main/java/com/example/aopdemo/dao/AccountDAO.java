package com.example.aopdemo.dao;

import com.example.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account account, boolean vipFlag);

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);
}
