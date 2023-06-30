package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.IAnimated;
import com.example.clashofclans.Utility.FramerTimeLine;
import com.example.clashofclans.Utility.IFramer;
import com.example.clashofclans.Values;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Dragon extends Hero  {
    private ImageView imageView;
    public Dragon() {
        super(new Image(HelloApplication.class.getResource("Heroes/Dragon/Dragon - Walking.png").toString()),Values.DRAGON_HEALTH, Values.DRAGON_HIT, 10 ,Values.DRAGON_SPEED, Values.DRAGON_HITRANGE);
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




}
