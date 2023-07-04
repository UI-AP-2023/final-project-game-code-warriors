package com.example.clashofclans.Utility;

import com.example.clashofclans.Model.Building.*;
import com.example.clashofclans.Model.Field;
import com.example.clashofclans.Values;
import com.example.clashofclans.Widgets.Map;

public class MapHandler {
    public static Map map1() {
        HomeLevel3 home1 = new HomeLevel3(60);
        home1.setInsets(280, 530);

        HomeLevel2 home2 = new HomeLevel2(60);
        home2.setInsets(300, 500);

        HomeLevel2 home3 = new HomeLevel2(60);
        home3.setInsets(320, 470);

        HomeLevel2 home4 = new HomeLevel2(60);
        home4.setInsets(340, 440);

        Storage storage1 = new Storage(80);
        storage1.setInsets(450, 300);

        Storage storage2 = new Storage(80);
        storage2.setInsets(475, 335);

        Storage storage3 = new Storage(80);
        storage3.setInsets(500, 370);

        Canon canon1 = new Canon(60);
        canon1.setInsets(350, 550);

        Canon canon2 = new Canon(60);
        canon2.setInsets(400, 900);

        Thrower thrower1 = new Thrower(80);
        thrower1.setInsets(130, 500);

        Barracks barracks1 = new Barracks(60);
        barracks1.setInsets(250, 700);

        Field field = new Field();
        field.addBulkChildren(home1, home2, home3, home4, storage1, storage2, storage3, canon1, canon2, thrower1, barracks1);

        Map map = new Map(field);

        return map;
    }

    public static Map map2() {
        HomeLevel2 home1 = new HomeLevel2(70);
        home1.setInsets(350, 550);

        Barracks barracks1 = new Barracks(60);
        barracks1.setInsets(380, 700);

        Barracks barracks2 = new Barracks(60);
        barracks2.setInsets(500, 550);

        Storage storage1 = new Storage(70);
        storage1.setInsets(350, 430);

        Thrower thrower1 = new Thrower(60);
        thrower1.setInsets(430, 550);

        Thrower thrower2 = new Thrower(60);
        thrower2.setInsets(260, 550);

        Canon canon1 = new Canon(50);
        canon1.setInsets(280, 450);

        Canon canon2 = new Canon(50);
        canon2.setInsets(500, 700);

        Castle castle = new Castle(60);
        castle.setInsets(250, 700);

        HomeLevel2 home2 = new HomeLevel2(70);
        home2.setInsets(450, 210);

        HomeLevel2 home3 = new HomeLevel2(70);
        home3.setInsets(480, 255);

        HomeLevel2 home4 = new HomeLevel2(70);
        home4.setInsets(650, 600);

        Field field = new Field();
        field.addBulkChildren(home1, barracks1, barracks2, storage1, thrower1, thrower2, canon1, canon2, castle, home2, home3, home4);

        return new Map(field);
    }

    public static Map map3() {
        Castle castle1 = new Castle(70);
        castle1.setInsets(400, 500);

        HomeLevel3 home1 = new HomeLevel3(70);
        home1.setInsets(430,460);

        Powder powder1 = new Powder(70);
        powder1.setInsets(350, 200);

        Barracks barracks1 = new Barracks(80);
        barracks1.setInsets(250, 500);

        Barracks barracks2 = new Barracks(80);
        barracks2.setInsets(270, 530);

        Barracks barracks3 = new Barracks(80);
        barracks3.setInsets(290, 560);

        Barracks barracks4 = new Barracks(80);
        barracks4.setInsets(310, 590);

        Barracks barracks5 = new Barracks(80);
        barracks5.setInsets(270, 470);

        Barracks barracks6 = new Barracks(80);
        barracks6.setInsets(290, 440);

        Barracks barracks7 = new Barracks(80);
        barracks7.setInsets(310, 410);

        Canon canon1 = new Canon(60);
        canon1.setInsets(110,540);

        Canon canon2 = new Canon(60);
        canon2.setInsets(400,800);


        Field field = new Field();
        field.addBulkChildren(castle1,home1, powder1, barracks1, barracks2, barracks3, barracks4, barracks5, barracks6, barracks7,canon1,canon2);

        return new Map(field);
    }

    public static void addToList() {
        Values.maps.add(map1());
        Values.maps.add(map2());
        Values.maps.add(map3());
    }
}
