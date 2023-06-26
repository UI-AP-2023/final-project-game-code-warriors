package com.example.clashofclans.Model.Hero;

import javafx.scene.image.Image;

public class Hero {
    private int health;
    private int hit;
    private int hitSpeed;
    private int speed;
    private int unlockLevel;

    public Hero(int health, int hit, int hitSpeed, int speed) {
        this.health = health;
        this.hit = hit;
        this.hitSpeed = hitSpeed;
        this.speed = speed;
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

    public int getHitSpeed() {
        return hitSpeed;
    }

    public void setHitSpeed(int hitSpeed) {
        this.hitSpeed = hitSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
