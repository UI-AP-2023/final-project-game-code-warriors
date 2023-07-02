package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Dragon extends Hero  {
    private ImageView imageView;
    public Dragon(double size) {
        this();
        getImageView(size);
    }

    public Dragon() {
        super(new Image(HelloApplication.class.getResource("Heroes/Dragon/Dragon - Walk.png").toString()),Values.DRAGON_HEALTH, Values.DRAGON_HIT, 10 ,Values.DRAGON_SPEED, Values.DRAGON_HITRANGE);
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


}
