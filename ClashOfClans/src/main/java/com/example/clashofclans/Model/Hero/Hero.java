package com.example.clashofclans.Model.Hero;


import com.example.clashofclans.Model.IGameComponent;
import javafx.scene.image.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public abstract class Hero implements IGameComponent {
    private Image image;
    private int health;
    private int hit;
    private int speed;
    private int unlockLevel;
    private int hitRange; // how far a hero can hit

}
