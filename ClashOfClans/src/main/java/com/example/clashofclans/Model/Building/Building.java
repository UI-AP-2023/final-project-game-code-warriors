package com.example.clashofclans.Model.Building;

import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Values;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Building implements IGameComponent {
    private int damage;
    private Values.DefensiveType type;
    private int score;

    public Building(int damage, Values.DefensiveType type,int score) {
        this.damage = damage;
        this.type = type;
        this.score=score;
    }

}
