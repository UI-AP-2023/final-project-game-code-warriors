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
import javafx.util.Duration;

import java.util.List;

public class Spear extends Hero implements IAnimated {

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
    public Timeline getAnimation() {
        IFramer iFramer  = new FramerTimeLine(imageView , List.of(Values.SpearFrame1, Values.SpearFrame2 , Values.SpearFrame3 , Values.SpearFrame4 ,Values.SpearFrame0) , Duration.seconds(1));
        return iFramer.getTimeLine();
    }
}
