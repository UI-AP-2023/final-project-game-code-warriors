package com.example.clashofclans.Utility;

import com.example.clashofclans.Event.OnAttackerArriveToTargetEvents;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

import java.util.LinkedList;


public class ComponentMover {

    public static void moveComponent(IGameComponent target, IGameComponent gameComponent) {
        Timeline timeline = new Timeline();
        Insets targetPosition = target.getInsets();


        Platform.runLater(() -> {
            LinkedList<KeyFrame> keyFrames = getKeyFrames(targetPosition, gameComponent);
            timeline.getKeyFrames().addAll(keyFrames);
            timeline.play();
            timeline.setOnFinished(actionEvent -> {
                System.out.println("asdasdasdasdasdasdasdasdadasdasdasd");
                OnAttackerArriveToTargetEvents.runEvents(target , gameComponent);
                gameComponent.setAttackToDefaultAnimation(target);
            });

        });

    }

    public static void arcMover(IGameComponent gameComponent ,IGameComponent destenation ,  IGameComponent target){
        double currentTop = destenation.getInsets().getTop();
        double currentLeft = destenation.getInsets().getLeft();
        double targetTop = target.getInsets().getTop();
        double targetLeft = target.getInsets().getLeft();

        Path path = new Path();
        path.getElements().add(new MoveTo(currentLeft, currentTop));
        path.getElements().add(new CubicCurveTo(currentLeft, currentTop, currentLeft, currentTop, targetLeft, targetTop));
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.seconds(3));
        pathTransition.setNode(gameComponent.getImageView());
        pathTransition.setPath(path);
        pathTransition.play();
        pathTransition.onFinishedProperty().set(actionEvent -> {
            OnAttackerArriveToTargetEvents.runEvents(target , gameComponent);
            gameComponent.setInsets(targetTop , targetLeft);
        });
    }

    private static LinkedList<KeyFrame> getKeyFrames(Insets targetPosition, IGameComponent iGameComponent) {

        LinkedList<KeyFrame> keyFrames = new LinkedList<>();
        ImageView component = iGameComponent.getImageView();
        double destenationX = targetPosition.getLeft();
        double destenationY = targetPosition.getTop();
        double currentX = component.getX();
        double currentY = component.getY();
        long index = 0;
        int speed = 5;
        while (true){
            double differenceX = destenationX > currentX ? destenationX - currentX : currentX - destenationX;
            double differenceY = destenationY > currentY ? destenationY - currentY : currentY - destenationY;
            if (differenceY < speed*1.3 && differenceX < speed*1.3)break;
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
                iGameComponent.setInsets(finalCurrentY , finalCurrentX);
            }));
            index += 200;
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
