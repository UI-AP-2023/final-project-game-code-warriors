package com.example.clashofclans.Utility;

import com.example.clashofclans.Model.Interfaces.IGameComponent;

public class OnFrameExecutedEventImpl implements OnFrameExecutedEvent {
    private IGameComponent target;
    private IGameComponent attacker;
    private double damage;


    public OnFrameExecutedEventImpl(IGameComponent target, IGameComponent attacker, double damage) {
        this.target = target;
        this.attacker = attacker;
        this.damage = damage;
    }

    @Override
    public void event() {
        target.getDamageHandler().addDamage(damage ,attacker);
    }
}
