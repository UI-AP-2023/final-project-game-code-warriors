package com.example.clashofclans.Utility;

import com.example.clashofclans.Model.IGameComponent;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;


public class ComponentMover {

    public static void moveComponent(Insets targetPosition, IGameComponent gameComponent, Duration duration) {
        Timeline timeline = new Timeline();
        ImageView component = gameComponent.getImageView();

        timeline.setCycleCount(Timeline.INDEFINITE);
        double moveLength = calculateMoveLength(AnchorPane.getTopAnchor(component), AnchorPane.getLeftAnchor(component), targetPosition.getTop(), targetPosition.getLeft());
        Platform.runLater(()-> {
            addKeyFrames(targetPosition, duration, timeline, component);
            timeline.play();
            timeline.setCycleCount(1);
        });
    }

    private static void addKeyFrames(Insets targetPosition, Duration duration, Timeline timeline, ImageView component) {
        for (int i = 0; i < duration.toMillis(); i++) {
            final double initialLeftAnchor = AnchorPane.getLeftAnchor(component); // Get the initial position
            final double initialTopAnchor = AnchorPane.getTopAnchor(component); // Get the initial position
            final double finalI = i;
            timeline.getKeyFrames().add(new KeyFrame(Duration.millis(i), event -> {
                double interpolatedLeftValue = initialLeftAnchor + (finalI / duration.toMillis()) * (targetPosition.getLeft() - initialLeftAnchor);
                double interpolatedTopValue = initialLeftAnchor + (finalI / duration.toMillis()) * (targetPosition.getTop() - initialTopAnchor);
                AnchorPane.setLeftAnchor(component, interpolatedLeftValue);
                AnchorPane.setTopAnchor(component, interpolatedTopValue);
            }));
        }
    }

    public static double calculateMoveLength(double currentTop, double currentLeft, double targetTop, double targetLeft) {
        var height = (currentTop - targetTop);
        var base = (currentLeft - targetLeft);
        if (height < 0 ) height = -height;
        if (base < 0 ) base = -base;
        height *= height;
        base *= base;
        System.out.println(height + base);
        return Math.sqrt(height + base);
    }

}
