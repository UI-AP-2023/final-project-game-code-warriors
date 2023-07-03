package com.example.clashofclans.Model.Interfaces;

import javafx.scene.image.ImageView;

public interface IDamageHandler {
    void setDamage(int damage);
    int getDamage();
    int getHealth();
    ImageView getImageView();
    default void addDamage(double damage) {
        setDamage((int) (getDamage() + damage));
        System.out.println(getDamage());
       if (getDamage() > getHealth()) getImageView().setOpacity(0);
    }
}


