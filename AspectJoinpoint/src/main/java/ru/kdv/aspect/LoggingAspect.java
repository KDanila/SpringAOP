package ru.kdv.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.kdv.entity.Account;

@Aspect
@Order(-1)
@Component
public class LoggingAspect {

    @Before("ru.kdv.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        System.out.println("=============>Message for all method in package<===============");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method Signature " + methodSignature);
        Object[] args = joinPoint.getArgs();
        for (Object a : args) {
            System.out.println(a);
            if(a instanceof Account){
                Account account = (Account)a;
                System.out.println("Account name: " + account.getName());
                System.out.println("Account level: " + account.getLevel());
            }
        }
    }
}
