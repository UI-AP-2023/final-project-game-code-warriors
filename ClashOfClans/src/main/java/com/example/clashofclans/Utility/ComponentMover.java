package com.example.clashofclans.Utility;

import com.example.clashofclans.Event.OnAttackerArriveToTargetEvents;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.LinkedList;


public class ComponentMover {

    public static void moveComponent(IGameComponent target, IGameComponent gameComponent, Duration duration) {
        Timeline timeline = new Timeline();
        Insets targetPosition = target.getInsets();
        ImageView component = gameComponent.getImageView();

        Platform.runLater(() -> {
            LinkedList<KeyFrame> keyFrames = getKeyFrames(targetPosition, component);
            timeline.getKeyFrames().addAll(keyFrames);
            timeline.play();
            timeline.setOnFinished(actionEvent -> {
                System.out.println("asdasdasdasdasdasdasdasdadasdasdasd");
                OnAttackerArriveToTargetEvents.runEvents(target , gameComponent);
                gameComponent.setAttackToDefaultAnimation(target);
            });

        });

    }

    private static LinkedList<KeyFrame> getKeyFrames(Insets targetPosition, ImageView component) {

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
