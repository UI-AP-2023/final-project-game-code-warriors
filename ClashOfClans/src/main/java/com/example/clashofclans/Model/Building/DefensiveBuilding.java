package com.example.clashofclans.Model.Building;

import com.example.clashofclans.Model.Interfaces.IAnimated;
import com.example.clashofclans.Values;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class DefensiveBuilding extends Building {
    private int hit;
    private int hitRange;

    public DefensiveBuilding(int damage, int hit, int hitRange,int score) {
        super(damage, Values.DefensiveType.DEFENSIVE,score);
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

    @Override
    public boolean getIsAlive() {
        return false;
    }

    @Override
    public void setIsAlive(boolean isAlive) {

    }

    public void setHitRange(int hitRange) {
        this.hitRange = hitRange;
    }


    @Override
    public IAnimated getAnimHandler() {
        return null;
    }
}
