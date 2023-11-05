package com.prm392PhoneShop.restapi.Model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
@Entity
@Data
public class Account{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="Username")
    private String username;
    @Column(name ="Password")
    private String password;
    @Column(name ="Email")
    private String email;
    @Column(name = "full_name")
    private String fullname;
    public Account() {
    }

    public Account(String username, String password, String email, String fullName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullname = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

}
