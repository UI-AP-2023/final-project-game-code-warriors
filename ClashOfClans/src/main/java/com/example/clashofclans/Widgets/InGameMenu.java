package com.example.clashofclans.Widgets;

import com.example.clashofclans.View.GamePage;
import javafx.scene.layout.VBox;

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
    }
}
