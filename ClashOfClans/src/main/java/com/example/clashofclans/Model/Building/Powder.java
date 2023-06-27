package com.example.clashofclans.Model.Building;

import com.example.clashofclans.Values;
import javafx.scene.image.Image;

public class Powder extends DefensiveBuilding{
    public Powder() {
        super(Values.POWDER_DAMAGE, Values.POWDER_HIT, Values.POWDER_HITRANGE);
        this.setImage(new Image(getClass().getResource("Building/Powder.png").toString()));
    }
}
