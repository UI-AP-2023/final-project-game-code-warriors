package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class HomeLevel1 extends Building {
    private ImageView imageView;

    public HomeLevel1() {
        super(Values.HOME1_DAMAGE, Values.DefensiveType.NORMAL);
        imageView = new ImageView(new Image(HelloApplication.class.getResource("Building/HomeLevel1.png").toString()));
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
