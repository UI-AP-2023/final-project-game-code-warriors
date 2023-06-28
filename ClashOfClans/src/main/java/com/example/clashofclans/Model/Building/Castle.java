package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;

public class Castle extends Building {
    public Castle() {
        super(Values.CASTLE_DAMAGE, Values.DefensiveType.NORMAL, new HelloApplication().getClass().getResource("Building/Castle.png").toString(),50);
    }
}
