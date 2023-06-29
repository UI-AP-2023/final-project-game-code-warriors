package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Values;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Storage extends Building{
    public Storage() {
        super(Values.BARRACKS_DAMAGE, Values.DefensiveType.NORMAL);
    }
    @Override
    public Node getComponent(double size) {
        ImageView imageView = new ImageView(new Image(HelloApplication.class.getResource("Building/Storage.png").toString()));
        imageView.setFitWidth(size);
        imageView.setPreserveRatio(true);
        return imageView;
    }

    @Override
    public Insets getInsets() {
        return null;
    }
}
