package com.example.clashofclans.Widgets;

import com.example.clashofclans.HelloApplication;
import javafx.animation.ScaleTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class HeroCard extends VBox {
    public HeroCard(ImageView imageView, String name, String health, String hit, String hitRange, String speed, double width, double height) {
        VBox vBox_Information = new VBox();
        CardInformation lbl_Name = new CardInformation("Name", name);
        CardInformation lbl_Health = new CardInformation("Health", health);
        CardInformation lbl_Hit = new CardInformation("Hit", hit);
        CardInformation lbl_HitRange = new CardInformation("Hit Range", hitRange);
        CardInformation lbl_Speed = new CardInformation("Speed", speed);

        vBox_Information.getChildren().addAll(lbl_Name, lbl_Hit, lbl_HitRange, lbl_Health, lbl_Speed);
        vBox_Information.setPadding(new Insets(0, 0, 0, 25));

        this.getChildren().addAll(imageView, vBox_Information);
        Image backgroundImage = new Image(HelloApplication.class.getResource("Buttons/Menu.png").toString());
        this.setBackground(new Background(new BackgroundImage(backgroundImage, BackgroundRepeat
                .NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(width, height, false, false, false, false))));
        this.setMinSize(width, height);
        this.setMaxSize(width, height);
        this.setAlignment(Pos.CENTER);

        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setDuration(Duration.millis(200));
        scaleTransition.setNode(this);
        this.setOnMouseEntered(event -> {
            scaleTransition.setToX(1.05);
            scaleTransition.setToY(1.05);
            scaleTransition.play();
        });
        this.setOnMouseExited(event -> {
            scaleTransition.setToX(1);
            scaleTransition.setToY(1);
            scaleTransition.play();
        });
        this.setOnMousePressed(event -> {
            DropShadow dropShadow = new DropShadow();
            dropShadow.setColor(Color.BLACK);
            dropShadow.setRadius(5);
            this.setEffect(dropShadow);
        });
        this.setOnMouseReleased(event ->{
            this.setEffect(null);
        });
    }
}
