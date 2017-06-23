package code5dialogs;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by vrebo on 6/19/17.
 */
public class Main extends Application{

    public void start(Stage primaryStage) {
        Parent root = new DialogsPane();

        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }

    public static void main(String [] args) { launch(args); }
}
