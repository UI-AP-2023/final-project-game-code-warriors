package com.example.clashofclans.Utility;

import com.example.clashofclans.Model.Building.*;
import com.example.clashofclans.Model.Field;
import com.example.clashofclans.Values;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

public class MapHandler {
    public static void map1() {
        HomeLevel3 home1 = new HomeLevel3();
        home1.getInsets(280, 530);

        HomeLevel2 home2 = new HomeLevel2();
        home2.getInsets(300, 500);

        HomeLevel2 home3 = new HomeLevel2();
        home3.getInsets(320, 470);

        HomeLevel2 home4 = new HomeLevel2();
        home4.getInsets(340, 440);

        Storage storage1 = new Storage();
        storage1.getInsets(450, 300);

        Storage storage2 = new Storage();
        storage2.getInsets(475, 335);

        Storage storage3 = new Storage();
        storage3.getInsets(500, 370);

        Canon canon1 = new Canon();
        canon1.getInsets(350, 550);

        Canon canon2 = new Canon();
        canon2.getInsets(400, 900);

        Thrower thrower1 = new Thrower();
        thrower1.getInsets(130, 500);

        Barracks barracks1 = new Barracks();
        barracks1.getInsets(250, 700);

        Field map1 = new Field();
        map1.getChildren().addAll(home1.getImageView(60), home2.getImageView(60), home3.getImageView(60), home4.getImageView(60), storage1.getImageView(80), storage2.getImageView(80), storage3.getImageView(80), canon1.getImageView(60), canon2.getImageView(60), thrower1.getImageView(80), barracks1.getImageView(60));

        Values.maps.add(map1);
    }

    public static void map2() {
        HomeLevel2 home1 = new HomeLevel2();
        home1.getInsets(350, 550);

        Barracks barracks1 = new Barracks();
        barracks1.getInsets(380, 700);

        Barracks barracks2 = new Barracks();
        barracks2.getInsets(500, 550);

        Storage storage1 = new Storage();
        storage1.getInsets(350, 430);

        Thrower thrower1 = new Thrower();
        thrower1.getInsets(430, 550);

        Thrower thrower2 = new Thrower();
        thrower2.getInsets(260, 550);

        Canon canon1 = new Canon();
        canon1.getInsets(280, 450);

        Canon canon2 = new Canon();
        canon2.getInsets(500, 700);

        Castle castle = new Castle();
        castle.getInsets(250,700);

        HomeLevel2 home2 = new HomeLevel2();
        home2.getInsets(450,210);

        HomeLevel2 home3 = new HomeLevel2();
        home3.getInsets(480,255);

        HomeLevel2 home4 = new HomeLevel2();
        home4.getInsets(650,600);

        Field field = new Field();
        field.getChildren().addAll(home1.getImageView(70), barracks1.getImageView(60), barracks2.getImageView(60), storage1.getImageView(70), thrower1.getImageView(60), thrower2.getImageView(60), canon1.getImageView(50), canon2.getImageView(50), castle.getImageView(60),home2.getImageView(70),home3.getImageView(70),home4.getImageView(70));

        Values.maps.add(field);
    }
}
