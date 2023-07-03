package com.example.clashofclans.Model.Hero;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Interfaces.*;
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

import static com.example.clashofclans.Values.SpearAttackFrame0;
import static com.example.clashofclans.Values.SpearDieFrame0;

public class Spear extends Hero implements IAnimated , IMortal , IDamageHandler{

    private ImageView imageView ;

    public Spear() {
        super(new Image(HelloApplication.class.getResource("Heroes/Spear/2 WALK_000.png").toString()), Values.SPEAR_HEALTH, Values.SPEAR_HIT, 10, Values.SPEAR_SPEED, Values.SPEAR_HITRANGE, new Timeline());
        imageView =  new ImageView(this.getImage());
        imageView.setFitWidth(50);
        imageView.setPreserveRatio(true);


    }
    public Spear(int size) {
        this();
        getImageView(size);
        this.setSize(size);
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
        OnFrameExecutedEvent onFrameExecutedEvent = new OnFrameExecutedEventImpl(target , this , 5);
        IFramer framer = new FramerTimeLine(
                imageView ,
                List.of(SpearAttackFrame0 ,
                        Values.SpearAttackFrame1 ,
                        Values.SpearAttackFrame2 ,
                        Values.SpearAttackFrame3 ,
                        Values.SpearAttackFrame4 ),
                Duration.millis(40000),
                onFrameExecutedEvent
        );
        System.out.println("asdasdasdasdasdasdasdasdadasdasdasd");
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
        return this;
    }


    @Override
    public void initDefaultAnimation() {
        timeLine.stop();
        timeLine.getKeyFrames().clear();
        IFramer iFramer  = new FramerTimeLine(imageView , List.of(Values.SpearFrame1, Values.SpearFrame2 , Values.SpearFrame3 , Values.SpearFrame4 ,Values.SpearFrame0) , Duration.seconds(1));
        timeLine.setCycleCount(Timeline.INDEFINITE);
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
        imageView.setFitWidth(60);
        timeLine.play();
    }

    @Override
    public void setDieToDefaultAnim() {
        IFramer iFramer = new FramerTimeLine(imageView , List.of(Values.SpearDieFrame0 , Values.SpearDieFrame1 , Values.SpearDieFrame2 , Values.SpearDieFrame3  , Values.SpearDieFrame4),Duration.seconds(1));
        timeLine.getKeyFrames().clear();
        timeLine.getKeyFrames().addAll(iFramer.getKeyFrames());
    }






}
