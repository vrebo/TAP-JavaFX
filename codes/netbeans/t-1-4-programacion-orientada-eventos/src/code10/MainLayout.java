/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code10;

import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author vrebo
 */
public class MainLayout extends BorderPane {

    public MainLayout() {
        init();
    }
    
    private void init() {
        MenuBar menu = new CustomMenuBar();
        setTop(menu);
    }
    
}
