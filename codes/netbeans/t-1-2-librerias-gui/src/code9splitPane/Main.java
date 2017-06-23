package code9splitPane;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by vrebo on 6/20/17.
 */
public class Main extends Application {

    public void start(Stage primaryStage) {
        Parent root =  new Panel();

        primaryStage.setTitle("Código 9: Ejemplo de SplitPane");
        primaryStage.setScene(new Scene(root, 600, 350));
        primaryStage.show();
    }
}
