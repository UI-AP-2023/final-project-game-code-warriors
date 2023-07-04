package com.example.clashofclans.Model;

import com.example.clashofclans.Controller.DefensiveBuildingController;
import com.example.clashofclans.Controller.IDefensiveBuildingController;
import com.example.clashofclans.Event.FightPairList;
import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Building.Building;
import com.example.clashofclans.Model.Building.DefensiveBuilding;
import com.example.clashofclans.Model.Hero.Hero;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Model.Interfaces.ITargetHolder;
import com.example.clashofclans.Utility.ComponentMover;
import com.example.clashofclans.Utility.Holder;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
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
    private IDefensiveBuildingController defensiveBuildingController;
    private double score = 0;
    boolean isPlayable = true;

    public void setPlayable(boolean playable) {
        this.isPlayable = playable;
    }

    public Field() {

        defensiveBuildingController = new DefensiveBuildingController();

        AtomicBoolean isDragged = new AtomicBoolean(false);
        this.setOnDragDetected(mouseEvent -> {
            isDragged.set(true);
        });

        AtomicBoolean isFirstClick = new AtomicBoolean(true);
        this.setOnMouseClicked(event -> {
            if (!isDragged.get()) {
                if (isPlayable){
                    if (isFirstClick.get()) {
                        defensiveBuildingController.setTargetHolder(this);
                        defensiveBuildingController.addAllDefensiveBuildings(getDefensiveBuildings());
                        defensiveBuildingController.initiateDefensiveBuildings(this);
                    } else isFirstClick.set(false);
                    IGameComponent gameComponent = Holder.getSelectedHero();
                    this.addChildren(gameComponent);
                    gameComponent.getAnimHandler().initDefaultAnimation();
                    gameComponent.getAnimHandler().geTimeLine().play();
                    gameComponent.setInsets(event.getY(), event.getX());
                    AtomicReference<IGameComponent> iGameComponent = this.getTargetFor(gameComponent, false);
                    ComponentMover.moveComponent(iGameComponent.get(), gameComponent);
                }

            }
            isDragged.set(false);
        });


        Image image = new Image(HelloApplication.class.getResource("Field.jpg").toString());
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, new BackgroundPosition(Side.RIGHT, 0, true, Side.BOTTOM, 0, true), new BackgroundSize(1150, 865, true, false, true, false));

        this.setBackground(new Background(backgroundImage));
        this.setPrefSize(1150, 865);


        FightPairList.addOnAttackerDestroyTarget(iGameComponent -> {
            if (!iGameComponent.getIsAlive()) {
                System.out.println(iGameComponent.getClass() + " is destroyed");
                iGameComponent.getImageView().setOpacity(0);


                if (iGameComponent instanceof DefensiveBuilding) {
                    this.getChildren().remove(iGameComponent.getImageView());
                    this.getChildren().remove(iGameComponent.getImageView());
                    defensiveBuildingController.removeDefensiveBuilding(iGameComponent);
                    getChildren().remove(iGameComponent.getImageView());
                    defensiveBuildingController.setTargetHolder(this);
                    defensiveBuildingController.initiateDefensiveBuildings(this);
                }
                if (iGameComponent instanceof Hero) {
                    defensiveBuildingController.initiateDefensiveBuildings(this);
                    iGameComponent.getAnimHandler().setDieToDefaultAnim();
                    iGameComponent.getAnimHandler().geTimeLine().setOnFinished(actionEvent -> {
                        this.getChildren().remove(iGameComponent.getImageView());
                        this.getChildren().remove(iGameComponent.getImageView());
                    });
                } else {
                    this.getChildren().remove(iGameComponent.getImageView());
                    this.getChildren().remove(iGameComponent.getImageView());

                }
            }
        });
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
        List<IGameComponent> _targets = new ArrayList<>();
        targets.forEach(iGameComponent -> {
            if (iGameComponent.getIsAlive()) {
                _targets.add(iGameComponent);
            }
        });
        return _targets;
    }

    @Override
    public IGameComponent keepGettingTargetFor(IGameComponent gameComponent, int radius) {
        var distanceMap = getTargetDistanceMap(gameComponent.getInsets().getTop(), gameComponent.getInsets().getLeft(), false);
        for (IGameComponent iGameComponent : distanceMap.keySet()) {
            if (distanceMap.get(iGameComponent) < radius && distanceMap.get(iGameComponent) > 5) {
                return iGameComponent;
            }
        }
        return null;
    }


    @Override
    public AtomicReference<IGameComponent> getTargetFor(IGameComponent gameComponent,
                                                        boolean isForDefenciveBuilding) {
        double top = gameComponent.getInsets().getTop();
        double left = gameComponent.getInsets().getLeft();
        Map<IGameComponent, Double> targetDistanceMap = getTargetDistanceMap(top, left, !isForDefenciveBuilding);
        AtomicReference<Double> min = new AtomicReference<>(Double.MAX_VALUE);
        AtomicReference<IGameComponent> target = new AtomicReference<>();
        targetDistanceMap.forEach((key, value) -> {

            if (value < min.get()) {
                target.set(key);
                min.set(value);
            }
            ;
        });
        System.out.println("Target selected for attacker     " + target.get().getClass());
        FightPairList.addFight(target.get(), gameComponent);
        target.get().setIsTargeted(true);
        return target;
    }


}
