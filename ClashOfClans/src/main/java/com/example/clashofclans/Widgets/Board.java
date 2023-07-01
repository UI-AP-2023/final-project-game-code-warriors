package com.example.clashofclans.Widgets;

import com.example.clashofclans.HelloApplication;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Board extends Label {
    public Board(double width, double height, String text) {
        this.setPrefSize(width, height);
        this.setText(text);
        Image backgroundImage = new Image(HelloApplication.class.getResource("Buttons/Board.png").toString());
        this.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(width, height, false, false, false, false))));
        this.setCursor(Cursor.HAND);
        this.setTextFill(Color.WHITE);
        this.setFont(Font.font(this.getFont().getFamily(), FontWeight.BOLD, 13));
        this.setAlignment(Pos.CENTER);
    }
}
