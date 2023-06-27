package com.example.clashofclans.Model.Building;

import com.example.clashofclans.Values;
import javafx.scene.image.Image;

import java.io.FileInputStream;

public class Building extends Image{
    private int damage;
    private Values.DefensiveType type;

    public Building(int damage, Values.DefensiveType type,String imagePath) {
        super(imagePath);
        this.damage = damage;
        this.type = type;
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
