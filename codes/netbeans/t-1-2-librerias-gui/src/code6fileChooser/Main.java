package code6fileChooser;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by vrebo on 6/20/17.
 */
public class Main extends Application {

    public void start(Stage primaryStage) {
        Parent root = new Panel();

        primaryStage.setTitle("Código 6: Ejemplo de FileChooser");
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }
}
