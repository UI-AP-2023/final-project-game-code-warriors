package com.example.clashofclans.View;

import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Widgets.BackwardButton;
import com.example.clashofclans.Widgets.SubmitButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class WelcomePage {
    public static void show(Stage stage) {
        StackPane root = new StackPane();
        root.setPrefWidth(1000);
        root.setPrefHeight(600);

        GaussianBlur gaussianBlur = new GaussianBlur();
        gaussianBlur.setRadius(20);

        ImageView img_Icon = new ImageView(new Image(HelloApplication.class.getResource("Icon.png").toString()));
        img_Icon.setTranslateY(-200);
        img_Icon.setFitHeight(200);
        img_Icon.setPreserveRatio(true);


        ImageView imageView = new ImageView(new Image(HelloApplication.class.getResource("Field.jpg").toString()));
        imageView.setFitWidth(1000);
        imageView.setPreserveRatio(true);
        imageView.setEffect(gaussianBlur);


        SubmitButton btn_Login = new SubmitButton(200, 50);
        btn_Login.setTranslateY(-30);
        btn_Login.setOnMouseClicked(event -> LoginPage.show(stage));


        SubmitButton btn_SignUp = new SubmitButton(200, 50);
        btn_SignUp.setTranslateY(30);
        btn_SignUp.setText("Sign Up");
        btn_SignUp.setOnMouseClicked(event -> SignUpPage.show(stage));


        VBox vBox_Buttons = new VBox();
        vBox_Buttons.setBackground(new Background(new BackgroundFill(Color.web("#383838"), new CornerRadii(15), new Insets(0))));
        vBox_Buttons.setMaxSize(250, 200);
        vBox_Buttons.setAlignment(Pos.CENTER);
        vBox_Buttons.setOpacity(0.2);

        root.getChildren().addAll(imageView, vBox_Buttons, btn_Login, btn_SignUp,img_Icon);


        stage.setScene(new Scene(root, 1000, 600));
    }
}
