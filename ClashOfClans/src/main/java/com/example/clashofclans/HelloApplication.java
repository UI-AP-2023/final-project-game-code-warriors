package com.example.clashofclans;

import com.example.clashofclans.Model.Account;
import com.example.clashofclans.Utility.MapHandler;
import com.example.clashofclans.View.*;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
//        WelcomePage.show(stage);
        Values.setStage(stage);
        WelcomePage.show();
        stage.setTitle("Clash Of Clans");
        stage.getIcons().add(new Image(getClass().getResource("Stage Icon.png").toString()));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        MapHandler.addToList();
        Account account = new Account("hossein", "123", "hossein@gmail.com");
        account.setMap(Values.maps.get(1));
        Values.users.add(account);
        launch();
    }
}