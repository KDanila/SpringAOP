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

    @Pointcut("execution(* ru.kdv.dao.*.get*(..))")
    private void getter() {
    }

    @Pointcut("execution(* ru.kdv.dao.*.set*(..))")
    private void setter() {
    }

    @Pointcut("forDaoPackage() && !(getter()||setter())")
    private void forDaoPackageNoGetterSetter() {
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("=============>Message for all method in package<===============");
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics() {
        System.out.println("=============>Performing API analytics<===============");
    }
}
