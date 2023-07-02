package com.example.clashofclans.Model.Interfaces;

import com.example.clashofclans.Model.Hero.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ITargetHolder {

    List<IGameComponent> getTargets();

    IGameComponent getTargetFor(IGameComponent gameComponent);

    default Map<IGameComponent, Double> getTargetDistanceMap(double top, double left, Boolean isHero) {
        List<IGameComponent> targets = getTargets();
        Map<IGameComponent, Double> targetDistanceMap = new HashMap<>();
        targets.forEach(target -> {
            if (!(target instanceof Hero && isHero)) {
                double targetTop = target.getInsets().getTop();
                double targetLeft = target.getInsets().getLeft();
                double distance = Math.sqrt(Math.pow(targetTop - top, 2) + Math.pow(targetLeft - left, 2));
                targetDistanceMap.put(target, distance);
            }
        });
        return targetDistanceMap;

    }
}
