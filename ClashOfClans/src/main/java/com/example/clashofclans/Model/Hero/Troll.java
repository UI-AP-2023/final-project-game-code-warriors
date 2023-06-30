package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Troll extends Hero {
    private ImageView imageView ;
    public Troll() {
        super(new Image(HelloApplication.class.getResource("Heroes/Troll/Troll_01_1_WALK_000.png").toString()),Values.TROLL_HEALTH, Values.TROLL_HIT,10, Values.TROLL_SPEED, Values.TROLL_HITRANGE);
        imageView = new ImageView();
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
}
