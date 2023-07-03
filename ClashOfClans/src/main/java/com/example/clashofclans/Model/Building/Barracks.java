package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Interfaces.IAnimated;
import com.example.clashofclans.Model.Interfaces.IDamageHandler;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Values;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Barracks extends Building implements IDamageHandler {
    private ImageView imageView;

    public Barracks() {
        super(Values.BARRACKS_DAMAGE, Values.DefensiveType.NORMAL,Values.BARRACKS_SCORE);
        imageView = new ImageView(new Image(HelloApplication.class.getResource("Building/Barracks.png").toString()));

    }
    public Barracks(double size) {
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
    public int getHitRange() {
        return 0;
    }

    @Override
    public void setAttackToDefaultAnimation(IGameComponent target) {

    }

    @Override
    public IDamageHandler getDamageHandler() {
        return this;
    }

    @Override
    public IAnimated getAnimHandler() {
        return null;
    }


}
