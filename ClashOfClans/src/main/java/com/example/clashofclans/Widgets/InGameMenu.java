package com.example.clashofclans.Widgets;

import com.example.clashofclans.Controller.AccountController;
import com.example.clashofclans.Utility.Holder;
import com.example.clashofclans.Values;
import com.example.clashofclans.View.GamePage;
import com.example.clashofclans.View.MapSelectionPage;
import javafx.scene.layout.VBox;

public class InGameMenu extends VBox {
    public InGameMenu(String sender) {
        MenuItem item_Heroes = new MenuItem(90, 40, "Heroes");
        item_Heroes.setOnMouseClicked(event -> {
            GamePage.showHeroList();
        });
        this.getChildren().addAll(item_Heroes);

        if (sender.equals("sign up") || sender.equals("login")) {
            MenuItem item_Attack = new MenuItem(90, 40, "Attack");
            item_Attack.setOnMouseClicked(event -> {
                MapSelectionPage.show(1, "attack");
            });
            this.getChildren().add(item_Attack);
        } else if (sender.equals("attack")) {
            MenuItem item_Leave = new MenuItem(90, 40, "Leave");
            this.getChildren().add(item_Leave);

            item_Leave.setOnMouseClicked(event -> {
                Holder.getLoggedInUser().getMap().getField().getScore();
                AccountController.endGame(0);
                GamePage.show(Holder.getLoggedInUser().getMap(), Holder.getLoggedInUser().getScore(), "login");
            });
        }

        this.setVisible(false);
        this.setSpacing(2);
        this.setMaxWidth(100);
    }
}
