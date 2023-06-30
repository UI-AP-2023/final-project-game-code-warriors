package com.example.clashofclans;

import com.example.clashofclans.Utility.MapHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ScrollPane root = new ScrollPane(Values.maps.get(1));

        Scene scene = new Scene(root, 1000, 600);

        stage.setTitle("Clash Of Clans");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        //stage.setFullScreen(true);
    }

    public static void main(String[] args) {
        MapHandler.map1();
        MapHandler.map2();
        launch();
    }
}