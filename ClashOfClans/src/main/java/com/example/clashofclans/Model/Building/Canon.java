package com.example.clashofclans.Model.Building;

import com.example.clashofclans.Values;
import javafx.scene.image.Image;

public class Canon extends DefensiveBuilding {
    public Canon() {
        super(Values.CANON_DAMAGE, Values.CANON_HIT, Values.CANON_HITRANGE);
        this.setImage(new Image(getClass().getResource("Building/Canon.png").toString()));
    }

}
