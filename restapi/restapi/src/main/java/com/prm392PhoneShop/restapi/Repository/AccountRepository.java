package com.prm392PhoneShop.restapi.Repository;

import com.prm392PhoneShop.restapi.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<Account,String> {

    Account findAccountByUsernameAndPassword(String username, String password);
    Account findAccountByUsername(String username);


}
