package com.example.clashofclans;

import com.example.clashofclans.Utility.MapHandler;
import com.example.clashofclans.Widgets.HomeButton;
import com.example.clashofclans.Widgets.MenuButton;
import com.example.clashofclans.Widgets.SettingButton;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ScrollPane map = new ScrollPane(Values.maps.get(1));
        map.setPannable(true);
        map.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        map.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        MenuButton menuButton = new MenuButton(30);
        menuButton.setTranslateX(-470);
        menuButton.setTranslateY(-270);
        menuButton.setOnMouseClicked(mouseEvent -> {
            VBox vBox_Menu = new VBox();

        });

        SettingButton settingButton = new SettingButton(30);
        settingButton.setTranslateX(-435);
        settingButton.setTranslateY(-270);

        StackPane root = new StackPane(map, menuButton,settingButton);
        root.setPrefSize(1000, 600);

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