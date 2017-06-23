package code8scrollPane;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by vrebo on 6/20/17.
 */
public class Main extends Application {

    public void start(Stage primaryStage) {
        Parent root = new Panel();
        primaryStage.setScene(new Scene(root, 300, 150));
        primaryStage.setTitle("Código 8: Ejemplo de ScrollPane");
        primaryStage.show();
    }

    public static void main(String [] args) { launch(args); }
}
