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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Clash Of Clans");
//        WelcomePage.show(stage);
        Field field = Values.maps.get(0);
        Spear spear = new Spear();
        field.getChildren().add(spear.getImageView(60));
        spear.initDefaultAnimation();
        IGameComponent iGameComponent  = field.getTargetFor(spear);
        System.out.println(iGameComponent.getInsets());
        ComponentMover.moveComponent(iGameComponent.getInsets() , spear , Duration.seconds(2));

        Scene scene = new Scene(field );
        stage.setScene(scene);
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