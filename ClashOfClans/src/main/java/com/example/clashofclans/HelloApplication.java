package com.example.clashofclans;

import com.example.clashofclans.Utility.MapHandler;
import com.example.clashofclans.Widgets.MenuButton;
import com.example.clashofclans.Widgets.MenuItem;
import com.example.clashofclans.Widgets.SettingButton;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        StackPane root = new StackPane();
        root.setPrefSize(1000, 600);

        ScrollPane map = new ScrollPane(Values.maps.get(1));
        map.setPannable(true);
        map.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        map.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        MenuButton menuButton = new MenuButton(30);
        menuButton.setTranslateX(-470);
        menuButton.setTranslateY(-270);

        AtomicBoolean activeMenu = new AtomicBoolean(false);
        menuButton.setOnMouseClicked(mouseEvent -> {
            if (!activeMenu.get()) {
                VBox vBox_Menu = new VBox();
                vBox_Menu.setPrefWidth(100);

                MenuItem item1 = new MenuItem(90, 40, "test");
                vBox_Menu.getChildren().add(item1);
                vBox_Menu.setTranslateX(10);
                vBox_Menu.setTranslateY(50);
                root.getChildren().add(vBox_Menu);
                activeMenu.set(true);
            } else {
                root.getChildren().remove(root.getChildren().size()-1);
                activeMenu.set(false);
            }
        });

        SettingButton settingButton = new SettingButton(30);
        settingButton.setTranslateX(-435);
        settingButton.setTranslateY(-270);

        root.getChildren().addAll(map, menuButton, settingButton);

        Scene scene = new Scene(root, 1000, 600);

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