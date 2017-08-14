/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code7;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 *
 * @author vrebo
 */
public class InheritancePane extends TabPane {

    public InheritancePane() {
        init();
    }
    
    private void init() {
        getTabs().add(new Tab("Panel padre", new FatherPane()));
        getTabs().add(new Tab("Panel hijo", new SonPane()));
        getTabs().add(new Tab("Panel padre", new GrandsonPane()));
    }
    
}
