package com.prm392PhoneShop.restapi.Services;

import com.prm392PhoneShop.restapi.Model.Account;
import com.prm392PhoneShop.restapi.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServices {
    private final AccountRepository Repository;
    public AccountServices(AccountRepository Repository) {
        this.Repository = Repository;
    }
    public List<Account> getAll(){
        return this.Repository.findAll();
    }
    public Account getByUsername(String username){
        return this.Repository.findAccountByUsername(username);
    }
    public Account getByUsernameAndPassword(String username, String password){
        return  this.Repository.findAccountByUsernameAndPassword(username,password);
    }
}
