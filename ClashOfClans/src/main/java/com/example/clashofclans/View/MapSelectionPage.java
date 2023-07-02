package com.example.clashofclans.View;

import com.example.clashofclans.Model.Field;
import com.example.clashofclans.Values;
import com.example.clashofclans.Widgets.BackwardButton;
import com.example.clashofclans.Widgets.ConfirmButton;
import com.example.clashofclans.Widgets.ForwardButton;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicInteger;

public class MapSelectionPage {
    static int index;

    public static void show(int map, String sender) {
        index = map;

        BackwardButton btn_Backward = new BackwardButton(50);
        btn_Backward.setTranslateX(-150);
        btn_Backward.setTranslateY(210);

        btn_Backward.setOnMouseClicked(event -> {
            show(--index, sender);

        });

        ConfirmButton btn_Confirm = new ConfirmButton(50);
        btn_Confirm.setTranslateY(210);
        btn_Confirm.setOnMouseClicked(event -> {
            if (sender.equals("sign up")) {
                Values.loggedInUser.setMap(Values.maps.get(index));
                GamePage.show(Values.loggedInUser.getMap(), Values.loggedInUser.getScore(), sender);
            } else if (sender.equals("attack")) {
                GamePage.show(Values.maps.get(index), 0, sender);
            }
        });

        ForwardButton btn_Forward = new ForwardButton(50);
        btn_Forward.setTranslateX(150);
        btn_Forward.setTranslateY(210);
        btn_Forward.setOnMouseClicked(event -> {
            show(++index, sender);
        });


        if (index - 1 < 0) {
            btn_Backward.setDisable(true);
        }
        if ((index + 2 > Values.maps.size())) {
            btn_Forward.setDisable(true);
        }

        StackPane root = new StackPane(Values.maps.get(index), btn_Backward, btn_Confirm, btn_Forward);
        Values.getStage().setScene(new Scene(root, 1000, 600));
    }
}
