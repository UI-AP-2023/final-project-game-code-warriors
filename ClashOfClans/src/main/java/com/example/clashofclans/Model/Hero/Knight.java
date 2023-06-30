package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.IAnimated;
import com.example.clashofclans.Model.IGameComponent;
import com.example.clashofclans.Model.IMortal;
import com.example.clashofclans.Utility.FramerTimeLine;
import com.example.clashofclans.Utility.IFramer;
import com.example.clashofclans.Values;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Knight extends Hero implements IAnimated , IMortal , IGameComponent {
    private ImageView imageView ;
    public Knight() {
        super(new Image(HelloApplication.class.getResource("Heroes/Knight/Knight_01__RUN_000.png").toString()),Values.KNIGHT_HEALTH, Values.KNIGHT_HIT,10, Values.KNIGHT_SPEED,Values.KNIGHT_HITRANGE);
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

    @Override
    public void initDefaultAnimation() {
        IFramer iFramer = new FramerTimeLine(imageView , Values.KnightFrames, Duration.seconds(1));
        timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
    }

    @Override
    public void setDieToDefaultAnim() {
        IFramer iFramer = new FramerTimeLine(imageView , Values.KnightDieFrames, Duration.seconds(1));
        timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
    }
}
