package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;

public class HomeLevel1 extends Building {
    public HomeLevel1() {
        super(Values.HOME1_DAMAGE, Values.DefensiveType.NORMAL, new HelloApplication().getClass().getResource("Building/HomeLevel1.png").toString());
    }
}
