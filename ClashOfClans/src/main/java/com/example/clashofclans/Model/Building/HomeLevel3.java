package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;

public class HomeLevel3 extends Building {
    public HomeLevel3() {
        super(Values.HOME3_DAMAGE, Values.DefensiveType.NORMAL, new HelloApplication().getClass().getResource("Building/HomeLevel3.png").toString(),30);
    }
}
