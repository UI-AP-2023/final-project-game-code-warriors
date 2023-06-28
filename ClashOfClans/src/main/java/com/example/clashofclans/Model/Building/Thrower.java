package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.scene.image.Image;

public class Thrower extends DefensiveBuilding {
    public Thrower() {
        super(Values.THROWER_DAMAGE, Values.THROWER_HIT, Values.THROWER_HITRANGE,new HelloApplication().getClass().getResource("Building/Thrower.png").toString(),40);
    }
}
