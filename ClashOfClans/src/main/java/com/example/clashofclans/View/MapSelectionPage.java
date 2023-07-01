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

    public static void show(int map, Stage stage) {
        index = map;

        ScrollPane scrollPane = new ScrollPane(Values.maps.get(index));
        scrollPane.setPannable(true);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);


        BackwardButton btn_Backward = new BackwardButton(50);
        btn_Backward.setTranslateX(-150);
        btn_Backward.setTranslateY(210);

        btn_Backward.setOnMouseClicked(event -> {
            show(--index, stage);

        });

        ConfirmButton btn_Confirm = new ConfirmButton(50);
        btn_Confirm.setTranslateY(210);
        btn_Confirm.setOnMouseClicked(event -> {
            Values.loggedInUser.setMap(Values.maps.get(index));
            GamePage.show(stage);
        });

        ForwardButton btn_Forward = new ForwardButton(50);
        btn_Forward.setTranslateX(150);
        btn_Forward.setTranslateY(210);
        btn_Forward.setOnMouseClicked(event -> {
            show(++index, stage);
        });


        if (index - 1 < 0) {
            btn_Backward.setDisable(true);
        }
        if ((index + 2 > Values.maps.size())) {
            btn_Forward.setDisable(true);
        }

        StackPane root = new StackPane(scrollPane, btn_Backward, btn_Confirm, btn_Forward);
        stage.setScene(new Scene(root, 1000, 600));
    }
}
