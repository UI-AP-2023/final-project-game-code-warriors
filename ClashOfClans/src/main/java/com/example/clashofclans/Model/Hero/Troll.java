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

import java.util.List;

import static com.example.clashofclans.Values.*;

public class Troll extends Hero implements IGameComponent, IMortal, IAnimated, IDamageHandler {
    private ImageView imageView;

    public Troll() {
        super(new Image(HelloApplication.class.getResource("Heroes/Troll/Troll_01_1_WALK_000.png").toString()), Values.TROLL_HEALTH, Values.TROLL_HIT, Values.TROLL_SPEED,4, Values.TROLL_HITRANGE, new Timeline());
        imageView = new ImageView(this.getImage());
        imageView.setFitWidth(120);
        imageView.setPreserveRatio(true);
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
        IFramer framer = new FramerTimeLine(imageView, TrollAttackFrames, Duration.millis(40000), onFrameExecutedEvent);
        imageView.setFitWidth(120);
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
        timeLine.stop();
        timeLine.getKeyFrames().clear();
        IFramer iFramer = new FramerTimeLine(imageView, TrollFrames, Duration.seconds(1));
        timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
        imageView.setFitWidth(120);
        timeLine.play();
    }

    @Override
    public Timeline geTimeLine() {
        return timeLine;
    }

    @Override
    public void setDieToDefaultAnim() {

            isAlive = false;
            IFramer iFramer = new FramerTimeLine(imageView , TrollDieFrames,Duration.seconds(1));
            timeLine.stop();
            timeLine.getKeyFrames().clear();
            timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
            timeLine.play();
            timeLine.cycleCountProperty().set(1);
            timeLine.onFinishedProperty().set(event->
            {
                imageView.setOpacity(0);
                timeLine.stop();
                timeLine.getKeyFrames().clear();
            });


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
