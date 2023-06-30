package com.example.clashofclans.Widgets;

import com.example.clashofclans.HelloApplication;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class BackwardButton extends Button {
    public BackwardButton(double size) {
        Image backgroundImage = new Image(HelloApplication.class.getResource("Buttons/Backward Button.png").toString());
        this.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat
                .NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(size - 5, size + 2, true, true, true, true))));

        this.setPrefSize(size, size + 7);
        this.setCursor(Cursor.HAND);
    }
}
