package com.example.clashofclans.Widgets;

import com.example.clashofclans.HelloApplication;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class ForwardButton extends Button {
    public ForwardButton(double size) {
        Image backgroundImage = new Image(HelloApplication.class.getResource("Buttons/Forward Button.png").toString());
        this.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat
                .NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size - 5, size, true, true, true, true))));

        this.setPrefSize(size, size+5);
        this.setCursor(Cursor.HAND);

        this.setOnMousePressed(event ->{
            DropShadow shadow = new DropShadow();
            shadow.setBlurType(BlurType.GAUSSIAN);
            shadow.setRadius(10);
            shadow.setSpread(0);
            shadow.setColor(Color.BLACK);

            this.setEffect(shadow);
        });
        this.setOnMouseReleased(event ->{
            this.setEffect(null);
        });
    }
}
