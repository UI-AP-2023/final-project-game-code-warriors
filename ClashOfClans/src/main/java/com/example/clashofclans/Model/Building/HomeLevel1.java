package com.example.clashofclans.Model.Building;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Interfaces.IAnimated;
import com.example.clashofclans.Model.Interfaces.IDamageHandler;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import com.example.clashofclans.Values;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HomeLevel1 extends Building implements IDamageHandler {
    private ImageView imageView;

    public HomeLevel1() {
        super(Values.HOME1_DAMAGE, Values.DefensiveType.NORMAL,Values.HOME1_SCORE);
        imageView = new ImageView(new Image(HelloApplication.class.getResource("Building/HomeLevel1.png").toString()));
    }
    public HomeLevel1(double size) {
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

    boolean isAlive = true;
    @Override
    public boolean getIsAlive() {
        return isAlive;
    }

    @Override
    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
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

    boolean isTargeted = false;
    @Override
    public boolean isTargeted() {
        return false;
    }

    @Override
    public void setIsTargeted(boolean isTargeted) {
        this.isTargeted = isTargeted;
    }

}
