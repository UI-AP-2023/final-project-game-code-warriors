package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Interfaces.IAnimated;
import com.example.clashofclans.Model.Interfaces.IDamageHandler;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FireBall implements IGameComponent {
    private ImageView imageView;

    public FireBall() {
        imageView = new ImageView(new Image(HelloApplication.class.getResource("fire.png").toString()));
        imageView.setFitWidth(10);
        imageView.setPreserveRatio(true);
    }


    @Override
    public ImageView getImageView(double size) {
        imageView.setFitWidth(size);
        return imageView;
    }

    @Override
    public ImageView getImageView() {
        return imageView;
    }

    @Override
    public int getHitRange() {
        return 0;
    }

    @Override
    public void setAttackToDefaultAnimation(IGameComponent target) {

    }

    @Override
    public IDamageHandler getDamageHandler() {
        return null;
    }

    @Override
    public IAnimated getAnimHandler() {
        return null;
    }
}
