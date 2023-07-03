package com.example.clashofclans.Model.Building;

import com.example.clashofclans.Model.Interfaces.IDamageHandler;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Values;


public abstract class Building implements IGameComponent {
    protected int damage = 0 ;
    private int health ;
    private Values.DefensiveType type;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Building(int health, Values.DefensiveType type) {
        this.health = health;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
//        System.out.println(damage);
    }

    public Values.DefensiveType getType() {
        return type;
    }

    public void setType(Values.DefensiveType type) {
        this.type = type;
    }
}
