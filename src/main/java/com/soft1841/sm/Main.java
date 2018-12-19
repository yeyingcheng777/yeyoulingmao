package com.soft1841.sm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setTitle("盐系Supermarket");
        primaryStage.getIcons().add(new Image("/img/123.png"));
        primaryStage.setScene(new Scene(root, 553, 405));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
