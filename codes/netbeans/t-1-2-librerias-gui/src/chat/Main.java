package chat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by vrebo on 6/21/17.
 */
public class Main extends Application {

    public void start(Stage primaryStage) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("chat-layout.fxml"));
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
            root = new StackPane(new Label("Lo sentimos, hubo un error cargando el layout"));
        }
        primaryStage.setTitle("Demostración de uso de FXML");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
    }

    public static void main(String [] args) { launch(args); }
}
