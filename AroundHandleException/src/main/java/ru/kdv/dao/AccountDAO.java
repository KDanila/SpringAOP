package ru.kdv.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import ru.kdv.entity.Account;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Component
public class AccountDAO {

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

    public List<Account> findAccounts(boolean sendExceptionFlag) {
        if(sendExceptionFlag){
            throw new RuntimeException("Sorry, shit is happen");
        }
        List<Account> accounts = new ArrayList<>();
        Account account1 = new Account("John", "Gold");
        Account account2 = new Account("Mad", "Silver");
        Account account3 = new Account("Eratosphene", "Platinum");
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        return accounts;
    }
}
