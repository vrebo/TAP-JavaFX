package code4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author vrebo
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Layout root = new Layout();
        
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setTitle("Manejo de eventos de botón.");
        primaryStage.show();
    }
    
    public static void main(String [] args) { launch(); }
}
