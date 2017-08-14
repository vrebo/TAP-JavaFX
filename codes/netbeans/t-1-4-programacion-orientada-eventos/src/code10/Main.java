/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code10;


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
        Parent root = new MainLayout();
        
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.setTitle("Instancia de Clase Anónima");
        primaryStage.show();
    }
    
    public static void main(String[] args) { launch(args); }
}
