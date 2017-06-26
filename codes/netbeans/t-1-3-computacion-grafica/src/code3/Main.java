/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code3;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author vrebo
 */
public class Main extends Application {

    private static final int WIDHT = 600;
    private static final int HEIGHT = 600;

    @Override
    public void start(Stage primaryStage) {
        Parent root = new RadioactiveSymbol(WIDHT, HEIGHT);
        primaryStage.setTitle("Símbolo con paint");
        primaryStage.setScene(new Scene(root, WIDHT, HEIGHT));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}