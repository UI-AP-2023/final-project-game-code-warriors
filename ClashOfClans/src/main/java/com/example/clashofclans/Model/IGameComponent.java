package com.example.clashofclans.Model;

import javafx.geometry.Insets;
import javafx.scene.image.ImageView;

public interface IGameComponent {
    ImageView getImageView(double size);
    ImageView getImageView();
    Insets getInsets();
}
