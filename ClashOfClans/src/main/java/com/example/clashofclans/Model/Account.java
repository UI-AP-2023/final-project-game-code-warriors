package com.example.clashofclans.Model;


import lombok.Getter;
import lombok.Setter;
import com.example.clashofclans.Widgets.Map;




@Setter
@Getter
public class Account {
    private String username;
    private String password;
    private String email;
    private Map map;
    private double score = 0;
    private Map attackMap;

    public Account(String username, String password,String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

}
