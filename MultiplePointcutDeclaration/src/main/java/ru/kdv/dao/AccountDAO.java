package ru.kdv.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import ru.kdv.entity.Account;

@Getter
@Setter
@Component
public class AccountDAO {

    //it's added just for test exception for getter and setter.
    private String name;
    private String serviceCode;



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
