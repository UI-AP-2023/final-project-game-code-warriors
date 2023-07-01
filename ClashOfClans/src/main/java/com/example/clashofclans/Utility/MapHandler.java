package com.example.clashofclans.Utility;

import com.example.clashofclans.Model.Building.*;
import com.example.clashofclans.Model.Field;
import com.example.clashofclans.Values;

public class MapHandler {
    public static void map1() {
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

        Thrower thrower1 = new Thrower(60);
        thrower1.setInsets(130, 500);

        Barracks barracks1 = new Barracks(60);
        barracks1.setInsets(250, 700);

        Field map1 = new Field();

        map1.addBulkChildren(home1 , home2 , home3 , home4 , storage1  , storage3 , canon1 , canon2 , thrower1 , barracks1);
        Values.maps.add(map1);
    }

    public static void map2() {
        HomeLevel2 home1 = new HomeLevel2();
        home1.setInsets(350, 550);

        Barracks barracks1 = new Barracks();
        barracks1.setInsets(380, 700);

        Barracks barracks2 = new Barracks();
        barracks2.setInsets(500, 550);

        Storage storage1 = new Storage();
        storage1.setInsets(350, 430);

        Thrower thrower1 = new Thrower();
        thrower1.setInsets(430, 550);

        Thrower thrower2 = new Thrower();
        thrower2.setInsets(260, 550);

        Canon canon1 = new Canon();
        canon1.setInsets(280, 450);

        Canon canon2 = new Canon();
        canon2.setInsets(500, 700);

        Castle castle = new Castle();
        castle.setInsets(250,700);

        HomeLevel2 home2 = new HomeLevel2();
        home2.setInsets(450,210);

        HomeLevel2 home3 = new HomeLevel2();
        home3.setInsets(480,255);

        HomeLevel2 home4 = new HomeLevel2();
        home4.setInsets(650,600);

        Field field = new Field();
        field.getChildren().addAll(home1.getImageView(70), barracks1.getImageView(60), barracks2.getImageView(60), storage1.getImageView(70), thrower1.getImageView(60), thrower2.getImageView(60), canon1.getImageView(50), canon2.getImageView(50), castle.getImageView(60),home2.getImageView(70),home3.getImageView(70),home4.getImageView(70));

        Values.maps.add(field);
    }
}
