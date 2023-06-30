package com.example.clashofclans.Model;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public interface IGameComponent {
    ImageView getImageView(double size);
    ImageView getImageView();
    default void getInsets(double topInset,double leftInset){
        AnchorPane.setLeftAnchor(getImageView(),leftInset);
        AnchorPane.setTopAnchor(getImageView(),topInset);
    }

}