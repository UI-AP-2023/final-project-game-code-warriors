package com.example.clashofclans.Controller;

import com.example.clashofclans.Exception.InvalidEmailException;
import com.example.clashofclans.Exception.InvalidInputException;
import com.example.clashofclans.Model.Account;
import com.example.clashofclans.Utility.Holder;
import com.example.clashofclans.Values;
import com.example.clashofclans.View.GamePage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountController {
    public static void login(String username, String password) throws InvalidInputException {
        for (Account a : Values.users) {
            if (a.getUsername().equals(username) && a.getPassword().equals(password)) {
                Holder.setLoggedInUser(a);
                return;
            }
        }
        throw new InvalidInputException("Invalid username or password");
    }

    public static void signUp(String username, String password, String email) throws InvalidEmailException {
        if (!checkEmailValidation(email)) {
            throw new InvalidEmailException();
        }
        Account account = new Account(username, password, email);
        Values.users.add(account);
        Holder.setLoggedInUser(account);
    }

    private static boolean checkEmailValidation(String email) {
        Pattern pattern = Pattern.compile("^\\w+@\\w+\\.\\w");
        Matcher matcher = pattern.matcher(email);

        return matcher.find();
    }

    public static void endGame(double score) {
        Holder.getLoggedInUser().setScore(Holder.getLoggedInUser().getScore() + score);
        Holder.getLoggedInUser().setAttackMap(null);
        GamePage.show(Holder.getLoggedInUser().getMap(), Holder.getLoggedInUser().getScore(), "login");

    }
}
