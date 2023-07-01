package com.example.clashofclans.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.SplittableRandom;

@Setter
@Getter
public class Account {
    private String username;
    private String password;
    private String email;
    private Field map;
    private double score = 0;

    public Account(String username, String password,String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

}
