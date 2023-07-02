package com.example.clashofclans.Model.Interfaces;

import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public interface IGameComponent {
    ImageView getImageView(double size);
    ImageView getImageView();
    default void setInsets(double topInset, double leftInset){
        getImageView().setY(topInset);
        getImageView().setX(leftInset);
    }


    default Insets getInsets(){
        return new Insets(getImageView().getY(),0,0,getImageView().getX());
    };

    void setAttackToDefaultAnimation();
    void addDamage(IGameComponent target,double damage);
}