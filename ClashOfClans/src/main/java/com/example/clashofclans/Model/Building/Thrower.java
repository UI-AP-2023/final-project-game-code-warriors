package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Thrower extends DefensiveBuilding {
    private ImageView imageView;

    public Thrower() {
        super(Values.THROWER_DAMAGE, Values.THROWER_HIT, Values.THROWER_HITRANGE);
        imageView = new ImageView(new Image(HelloApplication.class.getResource("Building/Thrower.png").toString()));
    }
    public Thrower(double size) {
        this();
        getImageView(size);
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
    public void setAttackToDefaultAnimation() {

    }

    @Override
    public void addDamage(IGameComponent target, double damage) {

    }


}
