package com.example.clashofclans.View;

import com.example.clashofclans.Controller.AccountController;
import com.example.clashofclans.Exception.InvalidInputException;
import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Utility.Holder;
import com.example.clashofclans.Values;
import com.example.clashofclans.Widgets.BackwardButton;
import com.example.clashofclans.Widgets.ErrorMessage;
import com.example.clashofclans.Widgets.SubmitButton;
import com.example.clashofclans.Widgets.TextInput;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class LoginPage {
    public static void show() {
        GaussianBlur gaussianBlur = new GaussianBlur();
        gaussianBlur.setRadius(20);

        StackPane root = new StackPane();

        ImageView img_Icon = new ImageView(new Image(HelloApplication.class.getResource("Icon.png").toString()));
        img_Icon.setTranslateY(-200);
        img_Icon.setFitHeight(200);
        img_Icon.setPreserveRatio(true);

        Pane pane_Back = new Pane();
        pane_Back.setMaxSize(100, 600);
        pane_Back.setMinSize(100, 600);
        pane_Back.setTranslateX(-450);
        pane_Back.setBackground(new Background(new BackgroundFill(Color.GRAY, new CornerRadii(0), new Insets(0))));
        pane_Back.setOpacity(0);


        BackwardButton btn_Back = new BackwardButton(30);
        btn_Back.setTranslateX(-450);
        btn_Back.setMinSize(100, 600);
        btn_Back.setMaxSize(100, 600);


        btn_Back.setOnMouseEntered(event -> {
            pane_Back.setOpacity(0.3);
        });
        btn_Back.setOnMouseExited(event -> {
            pane_Back.setOpacity(0);
        });
        btn_Back.setOnMouseClicked(event -> {
            WelcomePage.show();
        });


        ImageView imageView = new ImageView(new Image(HelloApplication.class.getResource("Field.jpg").toString()));
        imageView.setFitWidth(1000);
        imageView.setPreserveRatio(true);
        imageView.setEffect(gaussianBlur);

        VBox vBox_field = new VBox();
        vBox_field.setBackground(new Background(new BackgroundFill(Color.web("#383838"), new CornerRadii(15), new Insets(0))));
        vBox_field.setMaxSize(250, 230);
        vBox_field.setMinSize(250, 230);
        vBox_field.setAlignment(Pos.CENTER);
        vBox_field.setOpacity(0.2);

        TextInput textInput_Username = new TextInput("Username");
        textInput_Username.setTranslateX(390);
        textInput_Username.setTranslateY(210);

        TextInput textInput_Password = new TextInput("Password");
        textInput_Password.setTranslateX(390);
        textInput_Password.setTranslateY(280);

        SubmitButton btn_Login = new SubmitButton(200, 50);
        btn_Login.setTranslateY(70);
        btn_Login.setOnMouseClicked(event -> {
            try {
                AccountController.login(textInput_Username.getTextField().getText(), textInput_Password.getTextField().getText());
                Holder.getLoggedInUser().getMap().getField().setPlayable(false);
                GamePage.show(Holder.getLoggedInUser().getMap(), Holder.getLoggedInUser().getScore(), "login");
            }
            catch (Exception e){
                ErrorMessage errorMessage = new ErrorMessage(e.getMessage());
                errorMessage.setTranslateY(35);
                errorMessage.setTranslateX(-10);

                vBox_field.setMaxHeight(250);
                vBox_field.setMinHeight(250);
                textInput_Password.setTranslateY(270);
                textInput_Username.setTranslateY(200);
                btn_Login.setTranslateY(80);
                root.getChildren().add(errorMessage);
            }
        });


        root.getChildren().addAll(imageView, vBox_field, textInput_Username, textInput_Password, btn_Login, pane_Back, btn_Back, img_Icon);

        Values.getStage().setScene(new Scene(root, 1000, 600));
    }
}
