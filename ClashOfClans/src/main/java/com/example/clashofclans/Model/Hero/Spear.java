package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.IAnimated;
import com.example.clashofclans.Model.IMortal;
import com.example.clashofclans.Utility.FramerTimeLine;
import com.example.clashofclans.Utility.IFramer;
import com.example.clashofclans.Values;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.List;

public class Spear extends Hero implements IAnimated , IMortal {

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



    @Override
    public void initDefaultAnimation() {
        IFramer iFramer  = new FramerTimeLine(imageView , List.of(Values.SpearFrame1, Values.SpearFrame2 , Values.SpearFrame3 , Values.SpearFrame4 ,Values.SpearFrame0) , Duration.seconds(1));
        timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
    }

    @Override
    public void setDieToDefaultAnim() {
        IFramer iFramer = new FramerTimeLine(imageView , List.of(Values.SpearDieFrame0 , Values.SpearDieFrame1 , Values.SpearDieFrame2 , Values.SpearDieFrame3  , Values.SpearDieFrame4),Duration.seconds(1));
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
    }



}
