package com.example.clashofclans.Model.Interfaces;

import com.example.clashofclans.Event.FightPairList;
import javafx.scene.image.ImageView;

public interface IDamageHandler {
    void setDamage(int damage);

    int getDamage();

    int getHealth();

    boolean getIsAlive();

    void setIsAlive(boolean isAlive);

    ImageView getImageView();

    default void addDamage(double damage, IGameComponent attacker) {
        synchronized (this) {
            setDamage((int) (getDamage() + damage));
            System.out.println(getDamage() +"=>" +getHealth());
            if (getDamage() > getHealth()) {
                setIsAlive(false);
                FightPairList.onAnyGameComponentDestroyed(attacker);
            }
            ;
        }
    }
}


