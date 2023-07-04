package com.example.clashofclans.Utility;

import com.example.clashofclans.Model.Account;
import com.example.clashofclans.Model.Hero.Hero;
import com.example.clashofclans.Model.Hero.Spear;

public class Holder {
    private static Account loggedInUser;
    private static Hero selectedHero = new Spear();

    public static Account getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(Account loggedInUser) {
        Holder.loggedInUser = loggedInUser;
    }

    public static Hero getSelectedHero() {
        return selectedHero;
    }

    public static void setSelectedHero(Hero selectedHero) {
        Holder.selectedHero = selectedHero;
    }
}
