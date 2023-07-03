package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Interfaces.IAnimated;
import com.example.clashofclans.Model.Interfaces.IDamageHandler;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Model.Interfaces.IMortal;
import com.example.clashofclans.Utility.FramerTimeLine;
import com.example.clashofclans.Utility.IFramer;
import com.example.clashofclans.Values;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import static com.example.clashofclans.Values.TrollDieFrames;
import static com.example.clashofclans.Values.TrollFrames;

public class Troll extends Hero implements IGameComponent, IMortal , IAnimated , IDamageHandler {
    private ImageView imageView ;
    public Troll() {
        super(new Image(HelloApplication.class.getResource("Heroes/Troll/Troll_01_1_WALK_000.png").toString()),Values.TROLL_HEALTH, Values.TROLL_HIT,10, Values.TROLL_SPEED, Values.TROLL_HITRANGE,new Timeline());
        imageView = new ImageView();
    }
    public Troll(double size) {
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
    public void setAttackToDefaultAnimation(IGameComponent target) {

    }

    @Override
    public IDamageHandler getDamageHandler() {
        return this;
    }

    @Override
    public IAnimated getAnimHandler() {
        return this;
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
