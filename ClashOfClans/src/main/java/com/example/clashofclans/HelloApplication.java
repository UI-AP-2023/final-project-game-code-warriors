package com.example.clashofclans;

import com.example.clashofclans.Utility.MapHandler;
import com.example.clashofclans.View.LoginPage;
import com.example.clashofclans.View.SignUpPage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        Scene scene = new Scene(SignUpPage.show(), 1000, 600);

        stage.setTitle("Clash Of Clans");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        MapHandler.map1();
        MapHandler.map2();
        launch();
    }
}