package com.manglik.aopdemo.dao;

import com.manglik.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoIml implements AccountDao{

    private String name;
    private String serviceCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceCode() {
        return serviceCode;
    }
    @Override
    public boolean doWork(){
        return true;
    }
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + "Doing my work in an account");
    }
}
