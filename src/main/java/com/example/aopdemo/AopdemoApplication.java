package com.example.aopdemo;

import com.example.aopdemo.dao.AccountDAO;
import com.example.aopdemo.dao.MembershipDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AopdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopdemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(AccountDAO accountDAO, MembershipDAO membershipDAO) {
        return runner -> {
            demoTheAfterThrowingAdvice(accountDAO);
        };
    }

    private void demoTheAfterThrowingAdvice(AccountDAO accountDAO) {
        List<Account> accounts = null;
        try {
            boolean tripWire = true;
            accounts = accountDAO.findAccounts(tripWire);
        }catch (Exception e){
            System.out.println("caught exception" + e);
        }

        System.out.println("Main Programm: demoTheAfterThrowingAdvice");
        System.out.println(accounts);
    }

    private void demoTheAfterReturnAdvice(AccountDAO accountDAO) {
        List<Account> accounts = accountDAO.findAccounts();
        System.out.println("Main Programm: demoTheAfterReturnAdvice");
        System.out.println(accounts);
    }

    private void demoTheBeforeAdvice(AccountDAO accountDAO, MembershipDAO membershipDAO) {
        Account account = new Account();
        account.setName("Accountname");
        account.setLevel("silver");
        accountDAO.getName();
        accountDAO.setName("name");
        accountDAO.getServiceCode();
        accountDAO.setServiceCode("some code");
        accountDAO.addAccount(account, true);
        membershipDAO.addAccount(account);
        membershipDAO.updateAccount(account);
    }
}
