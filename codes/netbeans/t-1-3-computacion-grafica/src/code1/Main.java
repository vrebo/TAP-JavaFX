package code1;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    
    private static final double WIDTH = 600;
    private static final double HEIGHT = 500;
    
    @Override
    public void start(Stage primaryStage) {
        MyCanvas canvas = new MyCanvas(WIDTH, HEIGHT);
        
        primaryStage.setTitle("Estructura general para el manejo del Contexto Gráfico");
    }
    
    public static void main(String[] args) { launch(args); }
}
