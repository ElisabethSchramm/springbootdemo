package com.example.aopdemo;

import com.example.aopdemo.dao.AccountDAO;
import com.example.aopdemo.dao.MembershipDAO;
import com.example.aopdemo.service.TrafficFortuneService;
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
    CommandLineRunner runner(AccountDAO accountDAO, MembershipDAO membershipDAO,
                             TrafficFortuneService trafficFortuneService) {
        return runner -> {
            demoTheAroundAdviceHandleException(trafficFortuneService);
        };
    }

    private void demoTheAroundAdviceHandleException(TrafficFortuneService trafficFortuneService) {

        System.out.println("Main Programm: demoTheAroundAdviceHandleException");
        System.out.println("Calling getFortune()");

        boolean tripWire = true;
        String data = trafficFortuneService.getFortune(tripWire);

        System.out.println("My fortune is: " + data);

    }

    private void demoTheAroundAdvice(TrafficFortuneService trafficFortuneService) {

        System.out.println("Main Programm: demoTheAroundAdvice");
        System.out.println("Calling getFortune()");

        String data = trafficFortuneService.getFortune();

        System.out.println("My fortune is: " + data);
    }

    private void demoTheAfterAdvice(AccountDAO accountDAO) {
        List<Account> accounts = null;
        try {
            boolean tripWire = false;
            accounts = accountDAO.findAccounts(tripWire);
        }catch (Exception e){
            System.out.println("caught exception" + e);
        }

        System.out.println("Main Programm: demoTheAfterThrowingAdvice");
        System.out.println(accounts);
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
