package com.example.clashofclans.View;

import com.example.clashofclans.Widgets.MenuButton;
import com.example.clashofclans.Widgets.MenuItem;
import com.example.clashofclans.Widgets.SettingButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;

import java.util.concurrent.atomic.AtomicBoolean;

public class GamePage {
    public static StackPane show(AnchorPane map) {
        StackPane root = new StackPane();
        root.setPrefSize(1000, 600);

        ScrollPane scrollPane = new ScrollPane(map);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setPannable(true);

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
                root.getChildren().remove(root.getChildren().size() - 1);
                activeMenu.set(false);
            }
        });

        SettingButton settingButton = new SettingButton(30);
        settingButton.setTranslateX(-435);
        settingButton.setTranslateY(-270);

        root.getChildren().addAll(scrollPane, menuButton, settingButton);
        return root;
    }
}
