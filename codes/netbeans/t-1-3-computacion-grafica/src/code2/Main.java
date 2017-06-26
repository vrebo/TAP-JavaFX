package code2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static final double WIDTH = 600;
    public static final double HEIGTH = 400;

    @Override
    public void start(Stage primaryStage) {
        Parent root = new GraphicContextPane(WIDTH, HEIGTH);
        primaryStage.setTitle("Ventana con Dibujos");
        primaryStage.setScene(new Scene(root, WIDTH, HEIGTH));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
