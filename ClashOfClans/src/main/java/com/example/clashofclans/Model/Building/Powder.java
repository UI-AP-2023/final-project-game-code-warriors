package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Interfaces.IDamageHandler;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Values;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Powder extends DefensiveBuilding implements IDamageHandler {
    private ImageView imageView ;
    public Powder() {
        super(Values.POWDER_DAMAGE, Values.POWDER_HIT, Values.POWDER_HITRANGE);
        imageView = new ImageView(new Image(HelloApplication.class.getResource("Building/Powder.png").toString()));
    }
    public Powder(double size) {
        this();
        getImageView(size);
    }
    @Override
    public ImageView getImageView(double size) {
        imageView.setFitWidth(size);
        imageView.setPreserveRatio(true);
        return imageView;
    }

    @Override
    public ImageView getImageView() {
        return imageView;
    }

    @Override
    public void setAttackToDefaultAnimation(IGameComponent target) {

    }

    @Override
    public IDamageHandler getDamageHandler() {
        return this;
    }



}
