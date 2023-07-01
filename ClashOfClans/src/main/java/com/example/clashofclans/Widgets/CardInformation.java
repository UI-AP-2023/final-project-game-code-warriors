package com.example.clashofclans.Widgets;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class CardInformation extends Label {
    public CardInformation(String key, String value) {
        this.setText(key + ": " + value);
        this.setAlignment(Pos.CENTER_LEFT);
        this.setFont(Font.font(this.getFont().getFamily(), FontWeight.BOLD, 13));
        this.setTextFill(Color.WHITE);
    }
}
