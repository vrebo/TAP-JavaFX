/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code7;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;

/**
 *
 * @author vrebo
 */
public class SonPane extends FatherPane {

    public SonPane() {
        init();
    }

    private void init() {
        Button sonComp = new Button("México");
        setFont(sonComp);
        sonComp.setBackground(
                new Background(new BackgroundFill(Color.WHITE, null, null))
        );
        sonComp.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        HBox.setHgrow(sonComp, Priority.ALWAYS);
        getChildren().add(sonComp);
    }

}
