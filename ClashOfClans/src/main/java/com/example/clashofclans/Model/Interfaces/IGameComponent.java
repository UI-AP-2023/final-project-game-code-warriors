package com.example.clashofclans.Model.Interfaces;

import javafx.geometry.Insets;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public interface IGameComponent {
    ImageView getImageView(double size);
    ImageView getImageView();
    default void setInsets(double topInset, double leftInset){
        AnchorPane.setLeftAnchor(getImageView(),leftInset);
        AnchorPane.setTopAnchor(getImageView(),topInset);
    }

    default Insets getInsets(){
        return new Insets(getImageView().getY(),0,0,getImageView().getX());
    };
    default Insets getAnchorPaneInset(){
        return new Insets(AnchorPane.getTopAnchor(getImageView()),0,0,AnchorPane.getLeftAnchor(getImageView()));
    }
}