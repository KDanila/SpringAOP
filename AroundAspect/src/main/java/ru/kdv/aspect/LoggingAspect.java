package ru.kdv.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.kdv.entity.Account;

import java.util.List;
import java.util.logging.Logger;

@Aspect
@Order(-1)
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Around("execution(* ru.kdv.service.*.getFortune(..))")
    public Object aroundGetFortuneAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String method = proceedingJoinPoint.getSignature().toShortString();
        logger.info("Method signature in around advice: " + method);

        long start = System.currentTimeMillis();

        Object result = proceedingJoinPoint.proceed();

        long ends = System.currentTimeMillis();

        logger.info("Duration is: " + (ends - start) / 1000.0 + " seconds");

        return result;

    }

    @After("execution(* ru.kdv.dao.AccountDAO.findAccounts(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().toShortString();
        System.out.println("Method signature " + method);
        System.out.println("AFTER advice");
    }
}
