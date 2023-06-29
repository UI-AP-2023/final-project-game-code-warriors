package com.example.clashofclans.Utility;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import java.util.List;

public interface IFramer {
    Timeline getTimeLine();
    List<KeyFrame> getKeyFrames();
}
