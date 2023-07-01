package com.example.clashofclans.Widgets;

import com.example.clashofclans.HelloApplication;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class SubmitButton extends Button {
    public SubmitButton(double width, double height) {
        Image backgroundImage = new Image(HelloApplication.class.getResource("Buttons/Menu Item.png").toString());
        this.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat
                .NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(width - 5, height - 5, false, false, false, false))));
        this.setTextFill(Color.WHITE);
        this.setFont(Font.font(this.getFont().getFamily(), FontWeight.BOLD,13));

        this.setPrefSize(width, height);
        this.setCursor(Cursor.HAND);
        this.setText("Login");

        this.setOnMouseEntered(event ->{
            this.setOpacity(0.9);
        });
        this.setOnMouseExited(event ->{
            this.setOpacity(1);
        });
        this.setOnMousePressed(event ->{
            this.setOpacity(0.7);
        });
        this.setOnMouseReleased(event ->{
            this.setOpacity(0.9);
        });
    }
}
