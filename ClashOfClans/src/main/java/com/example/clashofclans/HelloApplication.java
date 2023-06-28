package com.example.clashofclans;

import com.example.clashofclans.Model.Building.Canon;
import com.example.clashofclans.Model.Building.Castle;
import com.example.clashofclans.Model.Building.HomeLevel1;
import com.example.clashofclans.Model.Field;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*Image KNIGHT_0 = new Image(getClass().getResource("Heroes/Knight/Knight_01__WALK_000.png").toString());
        Image KNIGHT_1 = new Image(getClass().getResource("Heroes/Knight/Knight_01__WALK_001.png").toString());
        Image KNIGHT_2 = new Image(getClass().getResource("Heroes/Knight/Knight_01__WALK_002.png").toString());
        Image KNIGHT_3 = new Image(getClass().getResource("Heroes/Knight/Knight_01__WALK_003.png").toString());
        Image KNIGHT_4 = new Image(getClass().getResource("Heroes/Knight/Knight_01__WALK_004.png").toString());
        Image KNIGHT_5 = new Image(getClass().getResource("Heroes/Knight/Knight_01__WALK_005.png").toString());
        Image KNIGHT_6 = new Image(getClass().getResource("Heroes/Knight/Knight_01__WALK_006.png").toString());
        Image KNIGHT_7 = new Image(getClass().getResource("Heroes/Knight/Knight_01__WALK_007.png").toString());
        Image KNIGHT_8 = new Image(getClass().getResource("Heroes/Knight/Knight_01__WALK_008.png").toString());
        Image KNIGHT_9 = new Image(getClass().getResource("Heroes/Knight/Knight_01__WALK_009.png").toString());

        ImageView knight0 = new ImageView(KNIGHT_0);
        knight0.setFitWidth(300);
        knight0.setPreserveRatio(true);

        ImageView knight1 = new ImageView(KNIGHT_1);
        knight1.setFitWidth(300);
        knight1.setPreserveRatio(true);

        ImageView knight2 = new ImageView(KNIGHT_2);
        knight2.setFitWidth(300);
        knight2.setPreserveRatio(true);

        ImageView knight3 = new ImageView(KNIGHT_3);
        knight3.setFitWidth(300);
        knight3.setPreserveRatio(true);

        ImageView knight4 = new ImageView(KNIGHT_4);
        knight4.setFitWidth(300);
        knight4.setPreserveRatio(true);

        ImageView knight5 = new ImageView(KNIGHT_5);
        knight5.setFitWidth(300);
        knight5.setPreserveRatio(true);

        ImageView knight6 = new ImageView(KNIGHT_6);
        knight6.setFitWidth(300);
        knight6.setPreserveRatio(true);

        ImageView knight7 = new ImageView(KNIGHT_7);
        knight7.setFitWidth(300);
        knight7.setPreserveRatio(true);

        ImageView knight8 = new ImageView(KNIGHT_8);
        knight8.setFitWidth(300);
        knight8.setPreserveRatio(true);

        ImageView knight9 = new ImageView(KNIGHT_9);
        knight9.setFitWidth(300);
        knight9.setPreserveRatio(true);

        HBox root = new HBox(knight1);

        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);

        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight1);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(300),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight2);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(400),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight3);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(500),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight4);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(600),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight5);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(700),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight6);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(800),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight7);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(900),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight8);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000),
                (ActionEvent event) -> {
                    root.getChildren().setAll(knight9);
                }
        ));
        t.play();*/


        HBox root = new HBox();

        VBox menu = new VBox();
        menu.setPrefWidth(Screen.getPrimary().getBounds().getWidth()/4);
        menu.setPrefHeight(Screen.getPrimary().getBounds().getHeight());
        menu.setBackground(new Background(new BackgroundFill(Color.RED,new CornerRadii(0),new Insets(0))));

        root.getChildren().addAll(menu,Values.maps.get(0));


        Scene scene = new Scene(root, Screen.getPrimary().getBounds().getWidth(), Screen.getPrimary().getBounds().getHeight());

        stage.setTitle("Clash Of Clans");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        //stage.setFullScreen(true);
    }

    public static void main(String[] args) {
        //map 1
        Field field = new Field();

        HomeLevel1 home1 = new HomeLevel1();
        AnchorPane.setLeftAnchor(home1,Screen.getPrimary().getBounds().getHeight()/2);
        AnchorPane.setTopAnchor(home1,400.0);

        Castle castle = new Castle();
        AnchorPane.setLeftAnchor(castle,Screen.getPrimary().getBounds().getHeight()/2+50);
        AnchorPane.setTopAnchor(castle,400.0);

        Canon canon = new Canon();
        AnchorPane.setLeftAnchor(canon,Screen.getPrimary().getBounds().getHeight()/2+200);
        AnchorPane.setTopAnchor(canon,200.0);

        field.getChildren().addAll(home1,castle,canon);
        Values.maps.add(field);

        launch();
    }
}