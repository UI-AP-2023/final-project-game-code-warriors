package com.example.clashofclans;

import com.example.clashofclans.Model.Account;
import com.example.clashofclans.Utility.MapHandler;
import com.example.clashofclans.View.GamePage;
import com.example.clashofclans.View.LoginPage;
import com.example.clashofclans.View.MapSelectionPage;
import com.example.clashofclans.View.SignUpPage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Clash Of Clans");
        GamePage.show(stage);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        MapHandler.map1();
        MapHandler.map2();
        Account account = new Account("hossein","123","hossein@gmial.com");
        account.setMap(Values.maps.get(1));
        Values.users.add(account);
        Values.loggedInUser = account;
        launch();
    }
}