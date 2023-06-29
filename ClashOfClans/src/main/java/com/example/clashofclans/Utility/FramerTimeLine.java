package com.example.clashofclans.Utility;

import com.example.clashofclans.HelloApplication;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.util.Duration;
import java.util.List;

public class FramerTimeLine implements IFramer {
    private List<String> frames;
    private Duration duration;
    private ImageView imageView;

    public FramerTimeLine(ImageView imageView, List<String> frames, Duration duration) {
        this.imageView = imageView;
        this.frames = frames;
        this.duration = duration;
    }

    @Override
    public Timeline getTimeLine() {
        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
//        timeline.setAutoReverse(true);
        int i = 0 ;
        for (String frame : frames) {
            timeline.getKeyFrames().add(
                    new KeyFrame(Duration.millis(duration.toMillis() / frames.size() * (i++)), e -> {
                    imageView.setImage(new Image(HelloApplication.class.getResource(frame).toString()));
                    })
            );
        }

        return timeline;
    }
}
