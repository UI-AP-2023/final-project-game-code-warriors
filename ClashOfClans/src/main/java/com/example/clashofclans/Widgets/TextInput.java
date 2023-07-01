package com.example.clashofclans.Widgets;

import javafx.animation.FillTransition;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

public class TextInput extends VBox {
    public TextInput(String lableText) {
        Label label = new Label(lableText);
        label.setFont(Font.font(11));
        TextField textField = new TextField();
        textField.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, new CornerRadii(0), new Insets(0))));
        textField.setBorder(new Border(new BorderStroke(Color.TRANSPARENT, Color.TRANSPARENT, Color.BLACK, Color.TRANSPARENT, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(1), new Insets(0))));

        textField.setMaxSize(220, 30);
        textField.setFont(Font.font(textField.getFont().getFamily(), FontWeight.BOLD, 14));
        textField.focusedProperty().addListener((event) -> {
            if (textField.isFocused()) {
                label.setTextFill(Color.WHITE);
                textField.setBorder(new Border(new BorderStroke(Color.TRANSPARENT, Color.TRANSPARENT, Color.WHITE, Color.TRANSPARENT, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(1), new Insets(0))));
                textField.setStyle("-fx-text-fill: white");
                this.setSpacing(5);
            } else {
                label.setTextFill(Color.BLACK);
                textField.setBorder(new Border(new BorderStroke(Color.TRANSPARENT, Color.TRANSPARENT, Color.BLACK, Color.TRANSPARENT, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(1), new Insets(0))));
                textField.setStyle("-fx-text-fill: black");
                this.setSpacing(0);
            }
        });

        this.getChildren().addAll(label, textField);
    }


}
