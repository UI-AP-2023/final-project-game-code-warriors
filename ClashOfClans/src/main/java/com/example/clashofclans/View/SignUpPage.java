package com.example.clashofclans.View;

import com.example.clashofclans.Controller.AccountController;
import com.example.clashofclans.HelloApplication;
import com.example.clashofclans.Widgets.BackwardButton;
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

public class SignUpPage {
    public static void show(Stage stage) {
        GaussianBlur gaussianBlur = new GaussianBlur();
        gaussianBlur.setRadius(20);

        ImageView imageView = new ImageView(new Image(HelloApplication.class.getResource("Field.jpg").toString()));
        imageView.setFitWidth(1000);
        imageView.setPreserveRatio(true);
        imageView.setEffect(gaussianBlur);

        Pane pane_Back = new Pane();
        pane_Back.setMaxSize(100, 600);
        pane_Back.setMinSize(100, 600);
        pane_Back.setTranslateX(-450);
        pane_Back.setBackground(new Background(new BackgroundFill(Color.GRAY, new CornerRadii(0), new Insets(0))));
        pane_Back.setOpacity(0);


        BackwardButton btn_Back = new BackwardButton(30);
        //btn_Back.setTranslateY(-180);
        btn_Back.setTranslateX(-450);
        btn_Back.setMinSize(100,600);
        btn_Back.setMaxSize(100,600);

        btn_Back.setOnMouseEntered(event -> {
            pane_Back.setOpacity(0.3);
        });
        btn_Back.setOnMouseExited(event->{
            pane_Back.setOpacity(0);
        });
        btn_Back.setOnMouseClicked(event->{
            WelcomePage.show(stage);
        });


        VBox vBox_field = new VBox();
        vBox_field.setBackground(new Background(new BackgroundFill(Color.web("#383838"), new CornerRadii(15), new Insets(0))));
        vBox_field.setMaxSize(250, 300);
        vBox_field.setMinSize(250, 300);
        vBox_field.setAlignment(Pos.CENTER);
        vBox_field.setOpacity(0.2);

        TextInput textInput_Username = new TextInput("Username");
        textInput_Username.setTranslateX(390);
        textInput_Username.setTranslateY(180);

        TextInput textInput_Password = new TextInput("Password");
        textInput_Password.setTranslateX(390);
        textInput_Password.setTranslateY(250);

        TextInput textInput_Email = new TextInput("Email");
        textInput_Email.setTranslateX(390);
        textInput_Email.setTranslateY(320);

        SubmitButton btn_SignUp = new SubmitButton(200, 50);
        btn_SignUp.setTranslateY(110);
        btn_SignUp.setText("Sign Up");
        btn_SignUp.setOnMouseClicked(event -> {
            if (AccountController.signUp(textInput_Username.getTextField().getText(), textInput_Password.getTextField().getText(), textInput_Email.getTextField().getText())) {
                MapSelectionPage.show(0, stage);
            }
        });


        StackPane root = new StackPane(imageView, vBox_field, textInput_Username, textInput_Password, textInput_Email, btn_SignUp,pane_Back,btn_Back);

        stage.setScene(new Scene(root, 1000, 600));
    }

}
