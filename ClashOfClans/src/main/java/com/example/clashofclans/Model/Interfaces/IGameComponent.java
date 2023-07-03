package com.example.clashofclans.Model.Interfaces;

import javafx.geometry.Insets;
import javafx.scene.image.ImageView;

public interface IGameComponent {
    ImageView getImageView(double size);
    ImageView getImageView();
    default void setInsets(double topInset, double leftInset){
        getImageView().setY(topInset);
        getImageView().setX(leftInset);
    }
    int getHitRange();

    default Insets getInsets(){
        return new Insets(getImageView().getY(),0,0,getImageView().getX());
    };

    void setAttackToDefaultAnimation(IGameComponent target);

    IDamageHandler getDamageHandler();
    IAnimated getAnimHandler();
}