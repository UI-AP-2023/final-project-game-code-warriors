package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Castle extends Building {
    private ImageView imageView;
    public Castle() {

        super(Values.CASTLE_DAMAGE, Values.DefensiveType.NORMAL);
        imageView = new ImageView(new Image(HelloApplication.class.getResource("Building/Castle.png").toString()));
    }
    @Override
    public ImageView getImageView(double size) {

        imageView.setFitWidth(size);
        imageView.setPreserveRatio(true);
        return imageView;
    }

    @Override
    public ImageView getImageView() {
        return null;
    }

    @Override
    public Insets getInsets() {
        return null;
    }
}
