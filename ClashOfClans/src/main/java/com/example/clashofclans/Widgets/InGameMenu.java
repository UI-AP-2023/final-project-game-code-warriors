package com.example.clashofclans.Widgets;

import com.example.clashofclans.View.GamePage;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class InGameMenu extends VBox {
    public InGameMenu() {
        this.setPrefWidth(100);
        MenuItem item_Attack = new MenuItem(90, 40, "Attack");

        MenuItem item_Heroes = new MenuItem(90, 40, "Heroes");
        item_Heroes.setOnMouseClicked(event -> {
            GamePage.showHeroList();
        });

        this.getChildren().addAll(item_Attack, item_Heroes);
        this.setVisible(false);
        this.setSpacing(2);
        this.setBackground(new Background(new BackgroundFill(Color.BLACK,new CornerRadii(0),new Insets(0))));
        //this.setMaxHeight(100);
        this.setMaxWidth(100);
    }
}
