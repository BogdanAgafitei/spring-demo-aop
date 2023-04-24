package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyCloudLogAspect {

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    public void allMethod(){}

    @Before("allMethod()")
    public void logToCloudAdvice(){
        System.out.println("-------logged to cloud------");
    }

}
