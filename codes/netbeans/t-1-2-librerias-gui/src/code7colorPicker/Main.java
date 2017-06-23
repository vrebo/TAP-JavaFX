package code7colorPicker;

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

        primaryStage.setTitle("Código 7: Ejemplo de ColorPicker");
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }

    public static void main(String [] args) { launch(args);}
}
