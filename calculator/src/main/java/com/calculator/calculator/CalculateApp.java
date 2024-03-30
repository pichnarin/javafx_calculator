package com.calculator.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculateApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculateApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Calculator!");
        stage.getIcons().add(new Image("https://cdn-icons-png.flaticon.com/512/548/548353.png"));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();

        System.out.println(System.getProperty("javafx.version"));
        System.out.println(System.getProperty("java.version"));
    }

    public static void main(String[] args) {
        launch();
    }
}