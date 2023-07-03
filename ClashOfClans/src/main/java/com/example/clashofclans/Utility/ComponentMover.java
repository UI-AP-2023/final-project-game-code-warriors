package com.example.clashofclans.Utility;

import com.example.clashofclans.Event.OnAttackerArriveToTargetEvents;
import com.example.clashofclans.Model.Building.DefensiveBuilding;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.image.ImageView;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

import java.util.LinkedList;
import java.util.Random;
import java.util.random.RandomGenerator;


public class ComponentMover {

    public static void moveComponent(IGameComponent target, IGameComponent gameComponent) {
        Timeline timeline = new Timeline();
        Insets targetPosition = target.getInsets();
//
//        double currentTop = gameComponent.getInsets().getTop();
//        double currentLeft = gameComponent.getInsets().getLeft();
//        double targetTop = targetPosition.getTop();
//        double targetLeft = targetPosition.getLeft();
//
//        Point2D start = new Point2D(currentLeft , currentTop);
//        Point2D end = new Point2D(targetLeft , targetTop);
//
//        double distance = start.distance(end);
//        Duration duration = Duration.seconds(distance / 100);
//
//        Path path = new Path();
//        path.getElements().add(new MoveTo(currentLeft , currentTop));
//        path.getElements().add(new LineTo(targetLeft , targetTop));
//        path.getElements().add(new MoveTo(targetLeft , targetTop));
//
//        PathTransition pathTransition =  new PathTransition();
//        pathTransition.setPath(path);
//        pathTransition.setDuration(duration);
//        pathTransition.setCycleCount(1);
//        pathTransition.autoReverseProperty().set(false);
//        pathTransition.setNode(gameComponent.getImageView());
//        pathTransition.play();
//
//        pathTransition.setOnFinished(actionEvent -> {
//            gameComponent.setInsets(targetTop , targetLeft);
//            OnAttackerArriveToTargetEvents.runEvents(target , gameComponent);
//            gameComponent.setAttackToDefaultAnimation(target);
//        });

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

    public static void arcMover(IGameComponent gameComponent ,IGameComponent destenation ,  IGameComponent target , IOnArcMoveFinish onArcMoveFinish){
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
            int min = 1;
            int max = 10;

            // Create a Random object
            Random random = new Random();

            // Generate a random integer within the specified range
            int randomNumber = random.nextInt(max - min + 1) + min;
            try {
                Thread.sleep(java.time.Duration.ofMillis(randomNumber));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            target.getDamageHandler().addDamage(50D , gameComponent);
            onArcMoveFinish.onFinish();
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
        int speed = 2;
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
            keyFrames.add(new KeyFrame(Duration.millis(index * 2 ), event -> {
                iGameComponent.setInsets(finalCurrentY , finalCurrentX);
            }));
            index += 10;
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
