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

import java.util.List;

import static com.example.clashofclans.Values.TrollDieFrames;
import static com.example.clashofclans.Values.TrollFrames;

public class Troll extends Hero implements IGameComponent, IMortal , IAnimated{
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

    @Override
    public Insets getInsets() {
        return null;
    }



    @Override
    public void initDefaultAnimation() {
        IFramer iFramer = new FramerTimeLine(imageView , TrollFrames, Duration.seconds(1));
        timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
    }

    @Override
    public void setDieToDefaultAnim() {
        IFramer iFramer = new FramerTimeLine(imageView , TrollDieFrames, Duration.seconds(1));
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());

    }
}
