package com.example.clashofclans.Utility;

import com.example.clashofclans.HelloApplication;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

public class FramerTimeLine implements IFramer {
    private List<String> frames;
    private Duration duration;
    private ImageView imageView;
    private OnFrameExecutedEvent onFrameExecutedEvent;

    public FramerTimeLine(ImageView imageView, List<String> frames, Duration duration) {
        this.imageView = imageView;
        this.frames = frames;
        this.duration = duration;
    }

    public FramerTimeLine(ImageView imageView, List<String> frames, Duration duration, OnFrameExecutedEvent onFrameExecutedEvent) {
        this.frames = frames;
        this.duration = duration;
        this.imageView = imageView;
        this.onFrameExecutedEvent = onFrameExecutedEvent;
    }

    @Override
    public Timeline getTimeLine() {
        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
//        timeline.setAutoReverse(true);
        List<KeyFrame> keyFrames = getKeyFrames();
        timeline.getKeyFrames().addAll(keyFrames);

        return timeline;
    }

    @Override
    public List<KeyFrame> getKeyFrames() {
        List<KeyFrame> keyFrames = new ArrayList<>();
        int i = 0;
        for (String frame : frames) {
            final int index = i; // Capture the current index

            keyFrames.add(
                    new KeyFrame(Duration.millis((i++) * 100), e -> {
                        if (onFrameExecutedEvent != null) {
                            System.out.println("damaged -- - -- - - - ");
                            onFrameExecutedEvent.event();
                        }
                        imageView.setImage(new Image(HelloApplication.class.getResource(frame).toString()));
                    })
            );
        }
        return keyFrames;
    }

}
