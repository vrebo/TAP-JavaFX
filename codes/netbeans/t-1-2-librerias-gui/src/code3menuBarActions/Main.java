package code3menuBarActions;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        MyMenuBar menuBar = new MyMenuBar();
        root.setTop(menuBar);
        primaryStage.setTitle("Ejemplo de menús con acciones");
        primaryStage.setScene(new Scene(root, 600, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
