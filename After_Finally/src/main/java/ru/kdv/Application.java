package ru.kdv;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kdv.configuration.Config;
import ru.kdv.dao.AccountDAO;
import ru.kdv.entity.Account;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        List<Account> accounts = null;
        try {
            boolean sendExceptionFlag = false;
            accounts = accountDAO.findAccounts(sendExceptionFlag);
        } catch (Exception e) {
            System.out.println("Main program has exception");
        }
        System.out.println(accounts);

        context.close();
    }
}