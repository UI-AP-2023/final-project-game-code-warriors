package com.example.clashofclans.Model;

import java.util.SplittableRandom;

public class Account {
    private String username;
    private String password;
    private Field map;

    public Account(String username, String password, Field map) {
        this.username = username;
        this.password = password;
        this.map = map;
    }
}
