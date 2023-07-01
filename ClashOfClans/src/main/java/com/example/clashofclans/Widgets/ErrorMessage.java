package com.example.clashofclans.Widgets;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ErrorMessage extends Label {
    public ErrorMessage(String message) {
        this.setText("* " + message);
        this.setFont(Font.font(11));
        this.setTextFill(Color.RED);
    }
}
