package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Spear extends Hero {
    private ImageView imageView ;

    public Spear() {
        super(new Image(HelloApplication.class.getResource("Heroes/Spear/2 WALK_000.png").toString()), Values.SPEAR_HEALTH, Values.SPEAR_HIT, 10, Values.SPEAR_SPEED, Values.SPEAR_HITRANGE);
        imageView =  new ImageView(this.getImage());
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
}
