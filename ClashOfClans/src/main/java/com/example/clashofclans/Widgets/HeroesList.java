package com.example.clashofclans.Widgets;

import com.example.clashofclans.Model.Hero.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class HeroesList extends HBox {
    public HeroesList() {
        HeroCard card_Knight = new HeroCard(new Knight(),50);
        HeroCard card_Dragon = new HeroCard(new Dragon(),40);
        HeroCard card_Green = new HeroCard(new Green(),80);
        HeroCard card_Spear = new HeroCard(new Spear(),40);
        HeroCard card_Troll = new HeroCard(new Troll(),50);

        this.getChildren().addAll(card_Knight,card_Dragon,card_Green,card_Spear,card_Troll);
        this.setSpacing(5);
        this.setPadding(new Insets(0, 10, 10, 10));
        this.setAlignment(Pos.CENTER);
        this.setMaxSize(1000, 150);
        this.setVisible(false);
    }
}
