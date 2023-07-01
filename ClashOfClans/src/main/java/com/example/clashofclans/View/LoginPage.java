package com.example.clashofclans.View;

import com.example.clashofclans.Controller.AccountController;
import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Widgets.SubmitButton;
import com.example.clashofclans.Widgets.TextInput;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;


public class LoginPage {
    public static StackPane show() {
        GaussianBlur gaussianBlur = new GaussianBlur();
        gaussianBlur.setRadius(20);

        ImageView imageView = new ImageView(new Image(HelloApplication.class.getResource("Field.jpg").toString()));
        imageView.setFitWidth(1000);
        imageView.setPreserveRatio(true);
        imageView.setEffect(gaussianBlur);

        VBox vBox_field = new VBox();
        vBox_field.setBackground(new Background(new BackgroundFill(Color.web("#383838"), new CornerRadii(15), new Insets(0))));
        vBox_field.setMaxSize(250, 280);
        vBox_field.setMinSize(250, 280);
        vBox_field.setAlignment(Pos.CENTER);
        vBox_field.setOpacity(0.2);

        TextInput textInput_Username = new TextInput("Username");
        textInput_Username.setTranslateX(390);
        textInput_Username.setTranslateY(180);

        TextInput textInput_Password = new TextInput("Password");
        textInput_Password.setTranslateX(390);
        textInput_Password.setTranslateY(250);

        SubmitButton btn_Login = new SubmitButton(200, 50);
        btn_Login.setTranslateY(70);
        btn_Login.setOnMouseClicked(event -> {
            AccountController.login(textInput_Username.getTextField().getText(), textInput_Password.getTextField().getText());
        });


        StackPane root = new StackPane(imageView, vBox_field, textInput_Username, textInput_Password, btn_Login);

        return root;
    }
}
