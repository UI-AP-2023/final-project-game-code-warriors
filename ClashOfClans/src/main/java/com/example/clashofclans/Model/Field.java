package com.example.clashofclans.Model;

import com.example.clashofclans.Event.FightPairList;
import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Building.Building;
import com.example.clashofclans.Model.Hero.Spear;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Model.Interfaces.ITargetHolder;
import com.example.clashofclans.Utility.ComponentMover;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.util.Duration;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@Getter
@Setter
public class Field extends Pane implements ITargetHolder {
    List<IGameComponent> targets = new ArrayList<>();
    private double score = 0;

    public Field() {

        AtomicBoolean isDragged = new AtomicBoolean(false);
        this.setOnDragDetected(mouseEvent -> {
            isDragged.set(true);
        });
        this.setOnMouseClicked(event -> {
            if (!isDragged.get()) {
                Spear spear = new Spear();
                this.addChildren(spear);
                spear.initDefaultAnimation();
                spear.getTimeLine().play();
                spear.setInsets(event.getY(), event.getX());
                AtomicReference<IGameComponent> iGameComponent = this.getTargetFor(spear);
                ComponentMover.moveComponent(iGameComponent.get(), spear);
            }
            isDragged.set(false);
        });


        Image image = new Image(HelloApplication.class.getResource("Field.jpg").toString());
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, new BackgroundPosition(Side.RIGHT, 0, true, Side.BOTTOM, 0, true), new BackgroundSize(1150, 865, true, false, true, false));

        this.setBackground(new Background(backgroundImage));
        this.setPrefSize(1150, 865);

        FightPairList.addOnAttackerDestroyTarget(iGameComponent -> {
            this.getTargets().remove(iGameComponent);
            this.getChildren().remove(iGameComponent.getImageView());
        });
    }

    public void move(Insets targetPosition, IGameComponent gameComponent, Duration duration) {
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


    @Override
    public ObservableList<Node> getChildren() {
        return super.getChildren();
    }

    public void addChildren(IGameComponent iGameComponent) {
        targets.add(iGameComponent);
        this.getChildren().add(iGameComponent.getImageView());
    }

    public void addBulkChildren(IGameComponent... iGameComponents) {
        targets.addAll(List.of(iGameComponents));
        this.getChildren().addAll(Arrays.stream(iGameComponents).map(IGameComponent::getImageView).toList());
        for (IGameComponent b : iGameComponents) {
            if (b instanceof Building) {
                this.score += ((Building) b).getScore();
            }
        }
    }

    @Override
    public List<IGameComponent> getTargets() {
        return targets;
    }

    @Override
    public AtomicReference<IGameComponent> getTargetFor(IGameComponent gameComponent) {
        double top = gameComponent.getInsets().getTop();
        double left = gameComponent.getInsets().getLeft();
        Map<IGameComponent, Double> targetDistanceMap = getTargetDistanceMap(top, left, true);
        AtomicReference<Double> min = new AtomicReference<>(Double.MAX_VALUE);
        AtomicReference<IGameComponent> target = new AtomicReference<>();
        targetDistanceMap.forEach((key, value) -> {

            if (value < min.get()) {
                target.set(key);
                min.set(value);
            };
        });
        System.out.println("Target selected for attacker     "+target.get().getClass());
        FightPairList.addFight(target.get() , gameComponent);
        return target;
    }


}
