package com.example.clashofclans.Model.Interfaces;

import com.example.clashofclans.Model.Building.DefensiveBuilding;
import com.example.clashofclans.Model.Hero.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public interface ITargetHolder {

    List<IGameComponent> getTargets();


    IGameComponent keepGettingTargetFor(IGameComponent gameComponent, int radius);

    AtomicReference<IGameComponent> getTargetFor(IGameComponent gameComponent, boolean isHero);

    default List<IGameComponent> getDefensiveBuildings() {
        List<IGameComponent> defensiveBuildings = new ArrayList<>();
        for (IGameComponent target : getTargets()) {
            if (target instanceof DefensiveBuilding) {
                defensiveBuildings.add(target);
            }
        }
        return defensiveBuildings;
    }

    default Map<IGameComponent, Double> getTargetDistanceMap(double top, double left, Boolean isHero) {
        List<IGameComponent> targets = getTargets();
        Map<IGameComponent, Double> targetDistanceMap = new HashMap<>();
        targets.forEach(target -> {
            if (!(target instanceof Hero)) {
                if (isHero){
                    double targetTop = target.getInsets().getTop();
                    double targetLeft = target.getInsets().getLeft();
                    double distance = Math.sqrt(Math.pow(targetTop - top, 2) + Math.pow(targetLeft - left, 2));
                    targetDistanceMap.put(target, distance);
                }
            }
            if (target instanceof Hero) {
                if (!isHero){
                    double targetTop = target.getInsets().getTop();
                    double targetLeft = target.getInsets().getLeft();
                    double distance = Math.sqrt(Math.pow(targetTop - top, 2) + Math.pow(targetLeft - left, 2));
                    targetDistanceMap.put(target, distance);
                }
            }
        });
        return targetDistanceMap;

    }
}
