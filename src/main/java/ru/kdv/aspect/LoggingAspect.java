package ru.kdv.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(public void getAccount())")
    //@Before("execution(public void get*())") ->> for any method start with "get"
    public void beforeAddAccountAdvice(){
        System.out.println("\n =============> Executing before getAccount() from aspect \n" );
    }
}
