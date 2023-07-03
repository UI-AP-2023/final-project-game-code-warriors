package com.example.clashofclans.Model.Interfaces;

import com.example.clashofclans.Event.FightPairList;
import javafx.scene.image.ImageView;

public interface IDamageHandler {
    void setDamage(int damage);

    int getDamage();

    int getHealth();

    ImageView getImageView();

    default void addDamage(double damage, IGameComponent attacker) {
        setDamage((int) (getDamage() + damage));
        System.out.println(getDamage());
        if (getDamage() > getHealth()) {
            getImageView().setOpacity(0);
            FightPairList.onAnyGameComponentDestroyed(attacker);
        }
        ;
    }
}


