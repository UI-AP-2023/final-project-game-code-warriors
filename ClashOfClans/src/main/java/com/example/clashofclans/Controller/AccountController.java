package com.example.clashofclans.Controller;

import com.example.clashofclans.Model.Account;
import com.example.clashofclans.Values;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountController {
    public static boolean login(String username, String password) {
        for (Account a : Values.users) {
            if (a.getUsername().equals(username) && a.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static boolean signUp(String username, String password, String email) {
        if (checkEmailValidation(email)) {
            Account account = new Account(username, password, email);
            Values.users.add(account);
            Values.loggedInUser = account;
            return true;
        }
        return false;
    }

    private static boolean checkEmailValidation(String email) {
        Pattern pattern = Pattern.compile("^\\w+@\\w+.\\w");
        Matcher matcher = pattern.matcher(email);

        return matcher.find();
    }
}
