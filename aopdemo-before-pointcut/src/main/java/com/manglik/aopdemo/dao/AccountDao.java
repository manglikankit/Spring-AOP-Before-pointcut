package com.manglik.aopdemo.dao;

import com.manglik.aopdemo.Account;

public interface AccountDao {
     boolean doWork();
     public String getName() ;

     public void setName(String name) ;

     public String getServiceCode() ;

     public void setServiceCode(String serviceCode);
     void addAccount(Account account, boolean vipFlag);
}
