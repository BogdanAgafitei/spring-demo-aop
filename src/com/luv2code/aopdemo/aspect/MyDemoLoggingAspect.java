package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {

    // create a pointCut
    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
   private void pointcutForPackage(){}

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
    private void getter(){}

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
    private void setter(){}


    @Pointcut("pointcutForPackage() && !(getter() || setter())")
    private void noSetterAndGetter(){}
    // @before advice

    @Before("noSetterAndGetter()")
    public void beforeAddAccount(){
        System.out.println("Executed before addAccount ******");
    }
}
