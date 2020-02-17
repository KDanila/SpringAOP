package ru.kdv.dao;

import org.springframework.stereotype.Component;
import ru.kdv.entity.Account;

@Component
public class AccountDAO {

    public void getAccount() {
        System.out.println(getClass() + " getting an account");
    }

    public void addAccount(Account account) {
        System.out.println(getClass() + " adding an account");
    }

    public void addVipAccount(Account account, boolean isVip) {
        System.out.println(getClass() + " adding an VIP account");
    }

    public boolean doSomeWork() {
        System.out.println(getClass() + " do work");
        return true;
    }
}
