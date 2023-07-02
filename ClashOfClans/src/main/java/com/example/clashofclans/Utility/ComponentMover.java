package com.example.clashofclans.Utility;

import com.example.clashofclans.Model.Interfaces.IGameComponent;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ComponentMover {

    public static void moveComponent(Insets targetPosition, IGameComponent gameComponent, Duration duration) {
        Timeline timeline = new Timeline();
        ImageView component = gameComponent.getImageView();

        Platform.runLater(() -> {
            LinkedList<KeyFrame> keyFrames = getKeyFrames(targetPosition, component);
            timeline.getKeyFrames().addAll(keyFrames);
            timeline.play();
        });


    }

    private static LinkedList<KeyFrame> getKeyFrames(Insets targetPosition, ImageView component) {
//        double oneFrameLeftMove = (targetPosition.getLeft() - component.getX()) / (duration.toMillis() / 10);
//        double oneFrameTopMove = (targetPosition.getTop() - component.getY()) / (duration.toMillis() / 10);
//
//        LinkedList<KeyFrame> res = new LinkedList<>();
//        for (int i = 0; i < duration.toMillis(); i += 10) {
//            double interpolatedLeftValue = oneFrameLeftMove * (i/10) + component.getX();
//            double interpolatedTopValue = oneFrameTopMove * (i/10) + component.getY();
//
//
//            res.add(new KeyFrame(Duration.millis(i), event -> {
//                component.setX(interpolatedLeftValue);
//                component.setY(interpolatedTopValue);
//            }));
//
//        }
//        return res;

        LinkedList<KeyFrame> keyFrames = new LinkedList<>();

        double destenationX = targetPosition.getLeft();
        double destenationY = targetPosition.getTop();
        double currentX = component.getX();
        double currentY = component.getY();
        long index = 0;
        int speed = 5;
        while (true){
            double differenceX = destenationX > currentX ? destenationX - currentX : currentX - destenationX;
            double differenceY = destenationY > currentY ? destenationY - currentY : currentY - destenationY;
            if (differenceY < speed*2 && differenceX < speed*2)break;
            if (currentX == destenationX && currentY == destenationY) break;
            if (differenceX > speed){
                if (currentX != destenationX){
                    if (currentX > destenationX) currentX-=speed;
                    else currentX+=speed;
                }
            }
            if (differenceY > speed){
                if (currentY != destenationY){
                    if (currentY > destenationY +speed) currentY-=speed;
                    else currentY+=speed;
                }
            }

            double finalCurrentX = currentX;
            double finalCurrentY = currentY;
            keyFrames.add(new KeyFrame(Duration.millis(index), event -> {
                component.setX(finalCurrentX);
                component.setY(finalCurrentY);
            }));
            index += 20;
        }
        return keyFrames;


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
