package com.prm392PhoneShop.restapi.Controller;

import com.prm392PhoneShop.restapi.Model.Account;
import com.prm392PhoneShop.restapi.Repository.AccountRepository;
import com.prm392PhoneShop.restapi.Services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {
    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }


}
