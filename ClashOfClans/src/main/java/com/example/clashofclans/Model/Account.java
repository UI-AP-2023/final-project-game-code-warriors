package com.example.clashofclans.Model;

import javafx.scene.control.ScrollPane;
import lombok.Getter;
import lombok.Setter;

import java.util.SplittableRandom;

@Setter
@Getter
public class Account {
    private String username;
    private String password;
    private String email;
    private ScrollPane map;
    private double score = 0;

    public Account(String username, String password,String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

}
