package com.example.clashofclans.Model.Building;

import com.example.clashofclans.Model.IGameComponent;
import com.example.clashofclans.Values;

public abstract class DefensiveBuilding extends Building {
    private int hit;
    private int hitRange;

    public DefensiveBuilding(int damage, int hit, int hitRange) {
        super(damage, Values.DefensiveType.DEFENSIVE);
        this.hit = hit;
        this.hitRange = hitRange;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getHitRange() {
        return hitRange;
    }

    public void setHitRange(int hitRange) {
        this.hitRange = hitRange;
    }
}
