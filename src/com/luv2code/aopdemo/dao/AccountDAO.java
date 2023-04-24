package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(Account account){
        System.out.println(getClass() + "Doing my db work");
    }
}
