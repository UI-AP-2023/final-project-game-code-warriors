package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;

public class HomeLevel2 extends Building{
    public HomeLevel2() {
        super(Values.HOME2_DAMAGE, Values.DefensiveType.NORMAL, new HelloApplication().getClass().getResource("Building/HomeLevel2.png").toString(),30);
    }
}
