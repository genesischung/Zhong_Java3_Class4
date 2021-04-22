package com.jcrogel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        String fxmlPath = "/fxml/sample.fxml";
        FXMLLoader loader = new FXMLLoader( getClass().getResource( fxmlPath ) );
        Parent root = loader.load();

        primaryStage.setTitle("Tweet Stuff");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();

        Controller c = loader.getController();
        c.load();

    }


    public static void main(String[] args) {
        // I do not have direct access to twitter and have to use a proxy
        System.setProperty("http.proxyHost", "127.0.0.1");
        System.setProperty("http.proxyPort", "2334");
        System.setProperty("https.proxyHost", "127.0.0.1");
        System.setProperty("https.proxyPort", "2334");
        launch(args);
    }
}
