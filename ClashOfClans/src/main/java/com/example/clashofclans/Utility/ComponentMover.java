package com.example.clashofclans.Utility;

import com.example.clashofclans.Model.Interfaces.IGameComponent;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.util.LinkedList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


public class ComponentMover {

    public static void moveComponent(Insets targetPosition, IGameComponent gameComponent, Duration duration) {
        Timeline timeline = new Timeline();
        ImageView component = gameComponent.getImageView();

        Platform.runLater(() -> {
            System.out.println("hello");
            LinkedList<KeyFrame> keyFrames = getKeyFrames(targetPosition, duration, component);
            timeline.getKeyFrames().addAll(keyFrames);
            System.out.println("done");
            timeline.play();
        });


    }

    private static LinkedList<KeyFrame> getKeyFrames(Insets targetPosition, Duration duration, ImageView component) {
        System.out.println(AnchorPane.getLeftAnchor(component) + " " + AnchorPane.getTopAnchor(component));
        double oneFrameLeftMove = (targetPosition.getLeft() - component.getX()) / (duration.toMillis() / 10);
        double oneFrameTopMove = (targetPosition.getTop() - component.getY()) / (duration.toMillis() / 10);
        if (oneFrameTopMove < 0) oneFrameTopMove = -oneFrameTopMove;
        if (oneFrameLeftMove < 0) oneFrameLeftMove = -oneFrameLeftMove;

        System.out.println(oneFrameLeftMove + " " + oneFrameTopMove);
        LinkedList<KeyFrame> res = new LinkedList<>();
        for (int i = 0; i < duration.toMillis(); i += 10) {
            double interpolatedLeftValue = oneFrameLeftMove * (i/10);
            double interpolatedTopValue = oneFrameTopMove * (i/10);


            res.add(new KeyFrame(Duration.millis(i), event -> {
                component.setX(interpolatedLeftValue);
                component.setY(interpolatedTopValue);
//                AnchorPane.setLeftAnchor(component, interpolatedLeftValue);
//                AnchorPane.setTopAnchor(component, interpolatedTopValue);
                System.out.println("Key Frame" + interpolatedLeftValue + " " + interpolatedTopValue);
            }));

        }
        return res;

    }

    public static double calculateMoveLength(double currentTop, double currentLeft, double targetTop, double targetLeft) {
        var height = (currentTop - targetTop);
        var base = (currentLeft - targetLeft);
        if (height < 0) height = -height;
        if (base < 0) base = -base;
        height *= height;
        base *= base;
        System.out.println(height + base);
        return Math.sqrt(height + base);
    }

}
