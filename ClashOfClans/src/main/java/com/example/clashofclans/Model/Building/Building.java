package com.example.clashofclans.Model.Building;

import com.example.clashofclans.Model.Interfaces.IDamageHandler;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Values;


public abstract class Building implements IGameComponent , IDamageHandler {
    private int damage;
    private Values.DefensiveType type;

    @Override
    public void addDamage(double damage) {
        this.damage += damage;
    }

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
