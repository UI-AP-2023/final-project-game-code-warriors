package com.example.clashofclans.Model;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Building.Canon;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.util.Duration;

public class Field extends AnchorPane {
    public Field() {
        Image image = new Image(HelloApplication.class.getResource("Field.jpg").toString());
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, new BackgroundPosition(Side.RIGHT, 0, true, Side.BOTTOM, 0, true), new BackgroundSize(Screen.getPrimary().getBounds().getHeight() * 3 / 4, Screen.getPrimary().getBounds().getHeight(), true, false, true, false));

        this.setBackground(new Background(backgroundImage));
    }
    public void move(Insets targetPosition, IGameComponent gameComponent, Duration duration){
        Timeline timeline = new Timeline();
        ImageView component = gameComponent.getImageView();
        timeline.setCycleCount(Timeline.INDEFINITE);
//        double moveLength = calculateMoveLength(AnchorPane.getTopAnchor(component), AnchorPane.getLeftAnchor(component), targetPosition.getTop(), targetPosition.getLeft());
        for (int i = 0; i < 1000; i++) {
            final double initialLeftAnchor = AnchorPane.getLeftAnchor(component); // Get the initial position
            final double initialTopAnchor = AnchorPane.getTopAnchor(component); // Get the initial position
            final double finalI = i;
            timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(i), event -> {
                double interpolatedLeftValue = initialLeftAnchor + (finalI / 1000) * (targetPosition.getLeft() - initialLeftAnchor);
                double interpolatedTopValue = initialLeftAnchor + (finalI / 1000) * (targetPosition.getTop() - initialTopAnchor);
                AnchorPane.setLeftAnchor(component, interpolatedLeftValue);
                AnchorPane.setTopAnchor(component, interpolatedTopValue);
            }));
        }
        timeline.play();
    }
}
