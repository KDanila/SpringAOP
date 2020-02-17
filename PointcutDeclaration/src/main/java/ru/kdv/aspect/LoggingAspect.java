package ru.kdv.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* ru.kdv.dao.*.*(..))")
    public void forDaoPackage() {
    }

    @Before("forDaoPackage()")
    public void beforeAddAccountAdvice() {
        System.out.println("=============>Message for all method in package<===============");
    }

    @Before("forDaoPackage()")
    public void performApiAnalytics(){
        System.out.println("=============>Performing API analytics<===============");
    }
}
