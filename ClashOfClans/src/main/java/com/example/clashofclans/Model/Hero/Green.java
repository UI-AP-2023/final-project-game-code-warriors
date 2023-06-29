package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Green extends Hero{
    private ImageView imageView ;
    public Green() {
        super(new Image(HelloApplication.class.getResource("Heroes/Green/GREEN_WALK_000.png").toString()),Values.GREEN_HEALTH,Values.GREEN_HIT,10,Values.GREEN_SPEED,Values.GREEN_HITRANGE);
        imageView= new ImageView(this.getImage());
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
