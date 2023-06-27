package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.scene.image.Image;

public class Powder extends DefensiveBuilding{
    public Powder() {
        super(Values.POWDER_DAMAGE, Values.POWDER_HIT, Values.POWDER_HITRANGE,new HelloApplication().getClass().getResource("Building/Powder").toString());
    }
}
