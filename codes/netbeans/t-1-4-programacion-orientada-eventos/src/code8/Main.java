/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code8;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author vrebo
 */
public class Main extends Application{
    
    @Override
    public void start(Stage primaryStage) {
        Parent root = new AnonymusClassPane();
        
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.setTitle("Instancia de Clase Anónima");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public static void main(String[] args) { launch(args); }
}
