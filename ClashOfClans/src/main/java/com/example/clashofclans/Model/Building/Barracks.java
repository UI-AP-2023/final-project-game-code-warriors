package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;

public class Barracks extends Building{
    public Barracks() {
        super(Values.BARRACKS_DAMAGE, Values.DefensiveType.NORMAL,new HelloApplication().getClass().getResource("Building/Barracks.png").toString(),30);
    }
}
