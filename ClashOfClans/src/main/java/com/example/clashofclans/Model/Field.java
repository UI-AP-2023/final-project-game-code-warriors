package com.example.clashofclans.Model;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Building.Canon;
import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Screen;

public class Field extends AnchorPane {
    public Field() {
        this.setMaxSize(Screen.getPrimary().getBounds().getWidth() * 3 / 4, Screen.getPrimary().getBounds().getHeight());
        this.setPrefSize(Screen.getPrimary().getBounds().getWidth() * 3 / 4, Screen.getPrimary().getBounds().getHeight());

        Image image = new Image(new HelloApplication().getClass().getResource("Field.jpg").toString());
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, new BackgroundPosition(Side.RIGHT, 0, true, Side.BOTTOM, 0, true), new BackgroundSize(Screen.getPrimary().getBounds().getHeight() * 3 / 4, Screen.getPrimary().getBounds().getHeight(), true, false, true, false));

        this.setBackground(new Background(backgroundImage));

    }
}
