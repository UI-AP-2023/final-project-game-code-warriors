package com.example.clashofclans.Model.Building;

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
}
