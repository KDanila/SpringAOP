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

        List<Account> accounts = accountDAO.findAccounts();
        System.out.println(accounts);

        context.close();
    }
}