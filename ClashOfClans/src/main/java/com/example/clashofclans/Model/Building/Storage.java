package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;

public class Storage extends Building{
    public Storage() {
        super(Values.BARRACKS_DAMAGE, Values.DefensiveType.NORMAL,new HelloApplication().getClass().getResource("Building/Storage.png").toString());
    }
}
