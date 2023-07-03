package com.example.clashofclans.Controller;

import com.example.clashofclans.Event.FightPairList;
import com.example.clashofclans.Model.Building.FireBall;
import com.example.clashofclans.Model.Field;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Model.Interfaces.ITargetHolder;
import com.example.clashofclans.Utility.ComponentMover;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefensiveBuildingController implements IDefensiveBuildingController {
    private final List<IGameComponent> defensiveBuildings;
    private ITargetHolder targetHolder;
    private Map<IGameComponent , Timeline> defenceWithTimeLine;

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

    @Override
    public void initiateDefensiveBuildings(Field field) {
        defenceWithTimeLine.forEach((defensiveBuilding , timeline)->{
            timeline.stop();
            timeline.getKeyFrames().clear();
        });
        for (IGameComponent defensiveBuilding : defensiveBuildings) {
            Timeline timeline = new Timeline();
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(3), event -> {
                        Platform.runLater(() -> {
                            IGameComponent target = field.keepGettingTargetFor(defensiveBuilding, 400);
                            if (target != null) {
                                System.out.println("Target Found");
                                FireBall fireBall = new FireBall();
                                field.getChildren().add(fireBall.getImageView());
                                FightPairList.addFight(target , defensiveBuilding);
                                ComponentMover.arcMover(fireBall, defensiveBuilding, target , ()->{});
                            }
                        });
                    })
            );
            defenceWithTimeLine.put(defensiveBuilding , timeline);
            timeline.play();
        }

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

        if (defenceWithTimeLine.get(defensiveBuilding) != null){
            defenceWithTimeLine.get(defensiveBuilding).stop();
            defenceWithTimeLine.remove(defensiveBuilding);
        }
        defensiveBuildings.remove(defensiveBuilding);

    }
}
