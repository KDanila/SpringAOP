package ru.kdv.dao;

import org.springframework.stereotype.Component;


@Component
public class MembershipDAO {

    public void getAccount(){
        System.out.println(getClass() + "Getting a membership account");
    }
}
