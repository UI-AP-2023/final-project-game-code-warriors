package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.IGameComponent;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public abstract class Building implements IGameComponent {
    private int damage;
    private Values.DefensiveType type;

    public Building(int damage, Values.DefensiveType type) {
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
