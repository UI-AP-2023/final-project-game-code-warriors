package com.example.clashofclans.Controller;

import com.example.clashofclans.Model.Building.DefensiveBuilding;
import com.example.clashofclans.Model.Field;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Model.Interfaces.ITargetHolder;

import java.util.List;

public interface IDefensiveBuildingController {
    void setTargetHolder(ITargetHolder targetHolder);

    void initiateDefensiveBuildings(Field field);

    void addDefensiveBuilding(IGameComponent defensiveBuilding);
    void addAllDefensiveBuildings(List<IGameComponent> defensiveBuildings);

    void removeDefensiveBuilding(IGameComponent defensiveBuilding);
}
