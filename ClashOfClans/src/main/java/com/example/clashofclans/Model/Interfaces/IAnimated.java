package com.example.clashofclans.Model.Interfaces;

import javafx.animation.Timeline;

public interface IAnimated {
    void initDefaultAnimation();
    Timeline geTimeLine();
    void setDieToDefaultAnim();
}
