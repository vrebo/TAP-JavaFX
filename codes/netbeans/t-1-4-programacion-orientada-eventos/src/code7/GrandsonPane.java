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
import org.omg.CORBA.ORB;

/**
 *
 * @author vrebo
 */
public class GrandsonPane extends SonPane {

    public GrandsonPane() {
        init();
    }

    private void init() {
        Button gSonComp = new Button("CA#$&%?S!");
        setFont(gSonComp);
        gSonComp.setBackground(
                new Background(new BackgroundFill(Color.RED, null, null))
        );
        gSonComp.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        HBox.setHgrow(gSonComp, Priority.ALWAYS);
        getChildren().add(gSonComp);
    }

}
