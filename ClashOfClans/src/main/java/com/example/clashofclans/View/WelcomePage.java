package com.example.clashofclans.View;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Model.Field;
import com.example.clashofclans.Widgets.LoginButton;
import com.example.clashofclans.Widgets.MenuItem;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Effect;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class WelcomePage {
    public static StackPane show() {
        StackPane root = new StackPane();
        root.setPrefWidth(1000);
        root.setPrefHeight(600);

        GaussianBlur gaussianBlur = new GaussianBlur();
        gaussianBlur.setRadius(20);

        ImageView imageView = new ImageView(new Image(HelloApplication.class.getResource("Field.jpg").toString()));
        imageView.setFitWidth(1000);
        imageView.setPreserveRatio(true);
        imageView.setEffect(gaussianBlur);


        LoginButton btn_Login = new LoginButton(200, 50);
        btn_Login.setTranslateY(-30);


        LoginButton btn_SignUp = new LoginButton(200, 50);
        btn_SignUp.setTranslateY(30);
        btn_SignUp.setText("Sign Up");


        VBox vBox_Buttons = new VBox();
        vBox_Buttons.setBackground(new Background(new BackgroundFill(Color.web("#383838"),new CornerRadii(15),new Insets(0))));
        vBox_Buttons.setMaxSize(250, 200);
        vBox_Buttons.setAlignment(Pos.CENTER);
        vBox_Buttons.setOpacity(0.2);

        root.getChildren().addAll(imageView,vBox_Buttons,btn_Login,btn_SignUp);


        return root;
    }
}
