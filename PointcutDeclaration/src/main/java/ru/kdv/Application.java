package ru.kdv;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kdv.configuration.Config;
import ru.kdv.dao.AccountDAO;
import ru.kdv.dao.MembershipDAO;
import ru.kdv.entity.Account;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        accountDAO.addAccount(new Account());
        accountDAO.doSomeWork();

        membershipDAO.getAccount();

        context.close();
    }
}