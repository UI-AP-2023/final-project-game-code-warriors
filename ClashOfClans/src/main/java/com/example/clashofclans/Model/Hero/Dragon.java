package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Interfaces.IAnimated;
import com.example.clashofclans.Model.Interfaces.IDamageHandler;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Values;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Dragon extends Hero implements IDamageHandler {
    private ImageView imageView;
    public Dragon(double size) {
        this();
        getImageView(size);
    }

    public Dragon() {
        super(new Image(HelloApplication.class.getResource("Heroes/Dragon/Dragon - Walk.png").toString()),Values.DRAGON_HEALTH, Values.DRAGON_HIT, 10 ,Values.DRAGON_SPEED, Values.DRAGON_HITRANGE, new Timeline());
        imageView = new ImageView(this.getImage());
    }

    @Override
    public ImageView getImageView(double size) {
        imageView.setFitWidth(size);
        imageView.setPreserveRatio(true);
        return imageView;
    }

    @Override
    public ImageView getImageView() {
        return imageView;
    }



    @Override
    public Insets getInsets() {
        return null;
    }

    @Override
    public void setAttackToDefaultAnimation(IGameComponent target) {

    }

    @Override
    public IDamageHandler getDamageHandler() {
        return this;
    }

    @Override
    public IAnimated getAnimHandler() {
        return null;
    }


}
