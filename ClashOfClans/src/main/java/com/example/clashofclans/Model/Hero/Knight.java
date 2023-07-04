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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import static com.example.clashofclans.Values.KnightAttackFrames;
import static com.example.clashofclans.Values.TrollAttackFrames;

public class Knight extends Hero implements IAnimated, IMortal, IGameComponent, IDamageHandler {
    private ImageView imageView;

    public Knight() {
        super(new Image(HelloApplication.class.getResource("Heroes/Knight/Knight_01__RUN_000.png").toString()), Values.KNIGHT_HEALTH, Values.KNIGHT_HIT, Values.KNIGHT_SPEED, 1, Values.KNIGHT_HITRANGE, new Timeline());
        imageView = new ImageView(this.getImage());
        imageView.setFitWidth(120);
        imageView.setPreserveRatio(true);
    }

    public Knight(double size) {
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

    boolean isAlive = true;
    @Override
    public boolean getIsAlive() {
        return isAlive;
    }

    @Override
    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    @Override
    public void setAttackToDefaultAnimation(IGameComponent target) {
        OnFrameExecutedEvent onFrameExecutedEvent = new OnFrameExecutedEventImpl(target, this, 5);
        IFramer framer = new FramerTimeLine(imageView, KnightAttackFrames, Duration.millis(40000), onFrameExecutedEvent);
        imageView.setFitWidth(130);
        imageView.setPreserveRatio(true);
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
        return this;
    }


    @Override
    public void initDefaultAnimation() {
        IFramer iFramer = new FramerTimeLine(imageView, Values.KnightFrames, Duration.seconds(1));
        timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
    }

    @Override
    public Timeline geTimeLine() {
        return timeLine;
    }

    @Override
    public void setDieToDefaultAnim() {
        IFramer iFramer = new FramerTimeLine(imageView, Values.KnightDieFrames, Duration.seconds(1));
        timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
    }
    boolean isTargeted = false;
    @Override
    public boolean isTargeted() {
        return false;
    }

    @Override
    public void setIsTargeted(boolean isTargeted) {
        this.isTargeted = isTargeted;
    }
}
