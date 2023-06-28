package com.example.clashofclans.Model.Building;

import com.example.clashofclans.Values;

public class DefensiveBuilding extends Building {
    private int hit;
    private int hitRange;

    public DefensiveBuilding(int damage, int hit, int hitRange,String imagePath,double size) {
        super(damage, Values.DefensiveType.DEFENSIVE,imagePath,size);
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
