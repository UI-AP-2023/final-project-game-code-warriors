package com.example.clashofclans.Widgets;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class TextInput extends VBox {
    public TextInput(String lableText) {
        Label lbl_Username = new Label(lableText);
        lbl_Username.setFont(Font.font(11));
        TextField textField_Username = new TextField();
        textField_Username.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, new CornerRadii(0), new Insets(0))));
        textField_Username.setBorder(new Border(new BorderStroke(Color.TRANSPARENT, Color.TRANSPARENT, Color.BLACK, Color.TRANSPARENT, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(1), new Insets(0))));
        textField_Username.setMaxSize(220, 30);
        textField_Username.setFont(Font.font(textField_Username.getFont().getFamily(), FontWeight.BOLD, 14));
        textField_Username.focusedProperty().addListener((event) -> {
            if (textField_Username.isFocused()) {
                lbl_Username.setTextFill(Color.WHITE);
                textField_Username.setBorder(new Border(new BorderStroke(Color.TRANSPARENT, Color.TRANSPARENT, Color.WHITE, Color.TRANSPARENT, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(1), new Insets(0))));
                textField_Username.setStyle("-fx-text-fill: white");
                this.setSpacing(5);
            } else {
                lbl_Username.setTextFill(Color.BLACK);
                textField_Username.setBorder(new Border(new BorderStroke(Color.TRANSPARENT, Color.TRANSPARENT, Color.BLACK, Color.TRANSPARENT, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(1), new Insets(0))));
                textField_Username.setStyle("-fx-text-fill: black");
                this.setSpacing(0);
            }
        });

        this.getChildren().addAll(lbl_Username, textField_Username);
    }
}
