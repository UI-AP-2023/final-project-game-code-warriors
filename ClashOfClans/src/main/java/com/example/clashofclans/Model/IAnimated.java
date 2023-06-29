package com.example.clashofclans.Model;

import javafx.animation.Timeline;

public interface IAnimated {
    Timeline timeLine = new Timeline();
    Timeline getTimeLine();
    void initDefaultAnimation();
}
