package com.example.clashofclans;

import com.example.clashofclans.Model.Account;
import com.example.clashofclans.Model.Field;
import com.example.clashofclans.Model.Hero.Spear;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Utility.ComponentMover;
import com.example.clashofclans.Utility.MapHandler;
import com.example.clashofclans.View.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Values.setStage(stage);
        WelcomePage.show();
        stage.setTitle("Clash Of Clans");
        stage.getIcons().add(new Image(getClass().getResource("Stage Icon.png").toString()));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        MapHandler.addToList();
        Account account = new Account("hossein", "123", "hossein@gmial.com");
        account.setMap(Values.maps.get(1));
        Values.users.add(account);
        Values.loggedInUser = account;
        launch();
    }
}