package ru.kdv.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {

    @Pointcut("execution(* ru.kdv.dao.*.*(..))")
    public void forDaoPackage() {
    }

    @Pointcut("execution(* ru.kdv.dao.*.get*(..))")
    public void getter() {
    }

    @Pointcut("execution(* ru.kdv.dao.*.set*(..))")
    public void setter() {
    }

    @Pointcut("forDaoPackage() && !(getter()||setter())")
    public void forDaoPackageNoGetterSetter() {
    }
}
