package com.example.clashofclans.Model.Building;

import com.example.clashofclans.Model.Interfaces.IAnimated;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Values;


public abstract class Building implements IGameComponent {
    protected int damage = 0 ;
    private int health ;
    private Values.DefensiveType type;
    private int score;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Building(int health, Values.DefensiveType type,int score) {
        this.health = health;
        this.type = type;
        this.score=score;
//        System.out.println(damage);
    }

    public Building(int health,int damage, Values.DefensiveType type,int score) {
        this.health = health;
        this.damage = damage;
        this.type = type;
        this.score=score;
//        System.out.println(damage);
    }

    public Values.DefensiveType getType() {
        return type;
    }

    public void setType(Values.DefensiveType type) {
        this.type = type;
    }

    @Override
    public IAnimated getAnimHandler() {
        return null;
    }
}
