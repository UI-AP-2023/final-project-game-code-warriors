package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Interfaces.IAnimated;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Model.Interfaces.IMortal;
import com.example.clashofclans.Model.Interfaces.ITarget;
import com.example.clashofclans.Utility.FramerTimeLine;
import com.example.clashofclans.Utility.IFramer;
import com.example.clashofclans.Values;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Green extends Hero implements IAnimated, IMortal, IGameComponent  {
    private ImageView imageView ;

    public Green() {
        super(new Image(HelloApplication.class.getResource("Heroes/Green/GREEN_WALK_000.png").toString()),Values.GREEN_HEALTH,Values.GREEN_HIT,10,Values.GREEN_SPEED,Values.GREEN_HITRANGE);
        imageView= new ImageView(this.getImage());
    }
    public Green(double size) {
        this();
        getImageView(size);
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
    public void initDefaultAnimation() {
        IFramer iFramer = new FramerTimeLine(imageView , Values.GreenFrames, Duration.seconds(1));
        timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
    }

    @Override
    public void setDieToDefaultAnim() {
        IFramer iFramer = new FramerTimeLine(imageView , Values.GreenDieFrames, Duration.seconds(1));
        timeLine.setCycleCount(1);
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());

    }
}
