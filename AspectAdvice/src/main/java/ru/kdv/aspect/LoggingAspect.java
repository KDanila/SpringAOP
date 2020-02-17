package ru.kdv.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    //@Before("execution(public void getAccount())") ->> for all getAccount method.
    //@Before("execution(public void get*())") ->> for any method start with "get"
    //@Before("execution(public void ru.kdv.dao.AccountDAO.getAccount())")
    //@Before("execution(* getAccount())") ->> return for any type(boolean, string, list...)
    @Before("execution(public void getAccount())")
    public void beforeGetAccountAdvice() {
        System.out.println("\n =============> Executing before getAccount() from aspect \n");
    }

    //@Before("execution(* add*( ..))") ->> .. Match on any number of arguments
    //@Before("execution(* add*(ru.kdv.entity.Account, ..))") ->> .. Account and any number of arguments
    //@Before("execution(* ru.kdv.dao.*.*(..))") ->>any class in package first '.*' class, second '.*' method
    @Before("execution(* add*(ru.kdv.entity.Account))")
    public void beforeAddAccountAdvice() {
        System.out.println("=============> Executing before addAccount() from aspect <===============");
    }
}
