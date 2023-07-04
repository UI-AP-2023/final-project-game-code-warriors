package com.example.clashofclans.View;

import com.example.clashofclans.Utility.Holder;
import com.example.clashofclans.Values;
import com.example.clashofclans.Widgets.*;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;


public class GamePage {
    private static StackPane root;

    public static void show(Map map, double score, String sender) {
        root = new StackPane();
        root.setPrefSize(1000, 600);

        Map gameField = map;
        gameField.getField().setPlayable(false);
        InGameMenu menu = new InGameMenu(sender);
        menu.setTranslateX(-440);
        menu.setTranslateY(50);

        MenuButton menuButton = new MenuButton(30);
        menuButton.setTranslateX(-470);
        menuButton.setTranslateY(-270);
        menuButton.setOnMouseClicked(event -> {
            menu.setVisible(!menu.isVisible());
        });

        SettingButton settingButton = new SettingButton(30);
        settingButton.setTranslateX(-435);
        settingButton.setTranslateY(-270);

        Board scoreBoard = new Board(100, 30, "Score: " + score);
        scoreBoard.setTranslateY(-270);
        scoreBoard.setTranslateX(440);

        HeroesList heroesList = new HeroesList();
        heroesList.setTranslateY(225);


        root.getChildren().addAll(map, menuButton, menu, settingButton, scoreBoard, heroesList);
        Values.getStage().setScene(new Scene(root, 1000, 600));
    }

    public static void showHeroList() {
        (root.getChildren().get(root.getChildren().size() - 1)).setVisible(!root.getChildren().get(root.getChildren().size() - 1).isVisible());
    }
}

