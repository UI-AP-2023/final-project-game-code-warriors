package com.example.clashofclans.Model.Building;

import com.example.clashofclans.Values;
import javafx.scene.image.Image;

public class Canon extends DefensiveBuilding {

    public Canon() {
        super(Values.CANON_DAMAGE, Values.CANON_HIT, Values.CANON_HITRANGE);
        this.setImagePath(null);
    }

    @Override
    public void setImagePath(String imagePath){
        super.setImagePath(getClass().getResource("Heroes/Knight/Knight_01__WALK_006.png").toString());
    }

}
