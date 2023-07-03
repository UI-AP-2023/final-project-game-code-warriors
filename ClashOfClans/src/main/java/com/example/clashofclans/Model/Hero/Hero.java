package com.example.clashofclans.Model.Hero;


import com.example.clashofclans.Model.Interfaces.IAnimated;
import com.example.clashofclans.Model.Interfaces.IGameComponent;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public abstract class Hero implements IGameComponent {
    protected int damage = 0 ;
    private Image image;
    private int health;
    private int hit;
    private int speed;
    private int unlockLevel;
    private int hitRange; // how far a hero can hit
    Timeline timeLine;
    private int size = 200;

    public Hero(Image image, int health, int hit, int speed, int unlockLevel, int hitRange, Timeline timeLine) {
        this.image = image;
        this.health = health;
        this.hit = hit;
        this.speed = speed;
        this.unlockLevel = unlockLevel;
        this.hitRange = hitRange;
        this.timeLine = timeLine;
    }

    public Timeline getTimeLine(){
        return timeLine;
    };

    @Override
    public IAnimated getAnimHandler() {
        return null;
    }

}
