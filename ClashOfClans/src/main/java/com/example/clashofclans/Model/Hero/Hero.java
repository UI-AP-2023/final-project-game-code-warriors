package com.example.clashofclans.Model.Hero;

import javafx.scene.image.Image;

public class Hero {
    private int health;
    private int hit;
    private int speed;
    private int unlockLevel;
    private int hitRange; // how far a hero can hit

    public Hero(int health, int hit, int speed,int hitRange) {
        this.health = health;
        this.hit = hit;
        this.speed = speed;
        this.hitRange=hitRange;
    }

    public int getHitRange() {
        return hitRange;
    }

    public void setHitRange(int hitRange) {
        this.hitRange = hitRange;
    }

    public int getUnlockLevel() {
        return unlockLevel;
    }

    public void setUnlockLevel(int unlockLevel) {
        this.unlockLevel = unlockLevel;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
