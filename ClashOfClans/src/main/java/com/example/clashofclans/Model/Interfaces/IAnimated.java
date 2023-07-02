package com.example.clashofclans.Model.Interfaces;

import javafx.animation.Timeline;

public interface IAnimated {
    Timeline timeLine = new Timeline();
    default Timeline getTimeLine(){
        return timeLine;
    };
    void initDefaultAnimation();
}
