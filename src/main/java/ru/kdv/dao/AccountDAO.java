package ru.kdv.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void getAccount() {
        //todo adding account
        System.out.println(getClass() + " getting an account");
    }
}
