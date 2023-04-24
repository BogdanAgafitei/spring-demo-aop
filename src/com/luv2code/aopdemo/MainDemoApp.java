package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.Account;
import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {
        // read spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        // get the bean from the spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO theMember = context.getBean("membershipDAO", MembershipDAO.class);
        Account account = context.getBean("account",Account.class);
        // call the business method
        theAccountDAO.addAccount(new Account());

        System.out.println("***************** ");

        theMember.addAccount();

        System.out.println("nnn");

        account.setLevel("2");

        // close the context
        context.close();
    }
}
