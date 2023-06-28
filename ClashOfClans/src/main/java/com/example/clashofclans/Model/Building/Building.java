package com.example.clashofclans.Model.Building;

import com.example.clashofclans.Values;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;

public class Building extends ImageView {
    private int damage;
    private Values.DefensiveType type;

    public Building(int damage, Values.DefensiveType type,String imagePath,double size) {
        super(new Image(imagePath));
        this.damage = damage;
        this.type = type;
        this.setFitWidth(size);
        this.setPreserveRatio(true);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Values.DefensiveType getType() {
        return type;
    }

    public void setType(Values.DefensiveType type) {
        this.type = type;
    }

}
