package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Interfaces.IAnimated;
import com.example.clashofclans.Model.Interfaces.IDamageHandler;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Model.Interfaces.IMortal;
import com.example.clashofclans.Utility.FramerTimeLine;
import com.example.clashofclans.Utility.IFramer;
import com.example.clashofclans.Utility.OnFrameExecutedEvent;
import com.example.clashofclans.Utility.OnFrameExecutedEventImpl;
import com.example.clashofclans.Values;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.List;

import static com.example.clashofclans.Values.*;
import static com.example.clashofclans.Values.SpearDieFrames;

public class Dragon extends Hero implements IAnimated, IMortal, IDamageHandler {
    private ImageView imageView;
    public Dragon(double size) {
        this();
        getImageView(size);
    }

    public Dragon() {
        super(new Image(HelloApplication.class.getResource("Heroes/Dragon/Dragon - Walk.png").toString()),Values.DRAGON_HEALTH, Values.DRAGON_HIT, Values.DRAGON_SPEED,3, Values.DRAGON_HITRANGE, new Timeline());
        imageView = new ImageView(this.getImage());
        imageView.setFitWidth(120);
        imageView.setPreserveRatio(true);
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
    public void setAttackToDefaultAnimation(IGameComponent target) {
        OnFrameExecutedEvent onFrameExecutedEvent = new OnFrameExecutedEventImpl(target, this, 5);
        IFramer framer = new FramerTimeLine(imageView, List.of(DragonAttackFrame), Duration.millis(40000), onFrameExecutedEvent);
        imageView.setFitWidth(120);
        timeLine.stop();
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(framer.getKeyFrames());
        timeLine.play();
    }


    @Override
    public IDamageHandler getDamageHandler() {
        return this;
    }

    @Override
    public IAnimated getAnimHandler() {
        return null;
    }

    @Override
    public void initDefaultAnimation() {
        timeLine.stop();
        timeLine.getKeyFrames().clear();
        IFramer iFramer = new FramerTimeLine(imageView, SpearFrames, Duration.seconds(1));
        timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
        imageView.setFitWidth(60);
        timeLine.play();
    }

    @Override
    public void setDieToDefaultAnim() {
        IFramer iFramer = new FramerTimeLine(imageView, List.of(DragonFrame), Duration.seconds(1));
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
    }


}
