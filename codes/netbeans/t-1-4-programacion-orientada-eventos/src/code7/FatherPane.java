/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code7;

/**
 *
 * @author vrebo
 */

import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

class FatherPane extends HBox {


    public FatherPane() {
        init();
    }

    private void init() {               
        Button fatherComp = new Button("!Viva");
        setFont(fatherComp);
        fatherComp.setBackground(
                new Background(new BackgroundFill(Color.GREEN, null, null))
        );
        fatherComp.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        HBox.setHgrow(fatherComp, Priority.ALWAYS);
        getChildren().add(fatherComp);
    }
    
    protected void setFont(Labeled c) {
        c.setFont(Font.font(24));
    }
}
