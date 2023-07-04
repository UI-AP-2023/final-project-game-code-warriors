package com.example.clashofclans.Controller;

import com.example.clashofclans.Event.FightPairList;
import com.example.clashofclans.Model.Building.DefensiveBuilding;
import com.example.clashofclans.Model.Building.FireBall;
import com.example.clashofclans.Model.Field;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Model.Interfaces.ITargetHolder;
import com.example.clashofclans.Utility.ComponentMover;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.geometry.Point2D;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefensiveBuildingController implements IDefensiveBuildingController {
    private final List<IGameComponent> defensiveBuildings;
    private ITargetHolder targetHolder;
    private Map<IGameComponent, Timeline> defenceWithTimeLine;

    public Map<IGameComponent, Timeline> getDefenceWithTimeLine() {
        return defenceWithTimeLine;
    }

    public DefensiveBuildingController() {

        defensiveBuildings = new ArrayList<>();
        defenceWithTimeLine = new HashMap<>();
    }

    @Override
    public void setTargetHolder(ITargetHolder targetHolder) {
        this.targetHolder = targetHolder;
    }

    Timeline timeline = new Timeline();

    @Override
    public void initiateDefensiveBuildings(Field field) {
        timeline.stop();
        timeline.getKeyFrames().clear();
        defenceWithTimeLine.forEach((defensiveBuilding, timeline) -> {
            if (!defensiveBuilding.getIsAlive()) timeline.stop();
        });
        defensiveBuildings.clear();
        field.getTargets().forEach(target -> {
            if (target instanceof DefensiveBuilding) {
                defensiveBuildings.add(target);
            }
        });
        for (IGameComponent defensiveBuilding : defensiveBuildings) {
            if (defensiveBuilding.getIsAlive()) {
                timeline.setCycleCount(Timeline.INDEFINITE);
                FireBall fireBall = new FireBall();
                field.getChildren().add(fireBall.getImageView());
                fireBall.getImageView().setOpacity(0);
                timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(2.9), event -> {
                            Platform.runLater(() -> {
                                IGameComponent target = field.keepGettingTargetFor(defensiveBuilding, 400);
                                if (target != null) {
                                    System.out.println("Target Found");
                                    FightPairList.addFight(target, defensiveBuilding);
                                    fireBall.getImageView().setOpacity(1);
                                    ComponentMover.arcMover(fireBall, defensiveBuilding, target, () -> {
                                        Platform.runLater(() -> {

                                            Point2D targetPos = new Point2D(fireBall.getImageView().getTranslateX(), fireBall.getImageView().getTranslateY());
                                            Point2D fireBallPos = new Point2D(fireBall.getImageView().getTranslateX(), fireBall.getImageView().getTranslateY());

                                            if (targetPos.distance(fireBallPos) < 30) {
                                                target.getDamageHandler().addDamage(50D, defensiveBuilding);
                                            }
                                            field.getChildren().remove(fireBall.getImageView());
                                            field.getTargets().remove(fireBall);
                                        });

                                    });
                                }
                            });
                        })
                );

            }

        }
        timeline.play();
    }

    @Override
    public void addDefensiveBuilding(IGameComponent defensiveBuilding) {
        defensiveBuildings.add(defensiveBuilding);
    }

    @Override
    public void addAllDefensiveBuildings(List<IGameComponent> defensiveBuildings) {
        this.defensiveBuildings.addAll(defensiveBuildings);
    }

    @Override
    public void removeDefensiveBuilding(IGameComponent defensiveBuilding) {
        defensiveBuildings.remove(defensiveBuilding);

    }
}
