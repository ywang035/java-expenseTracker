package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Money Keeper");
        primaryStage.setScene(new Scene(root, 700, 450));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {

        launch(args);

    }

}
