/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code8;

import javafx.scene.canvas.Canvas;

/**
 *
 * @author vrebo
 */
public abstract class CustomCanvas extends Canvas{

    public CustomCanvas(double width, double height) {
        super(width, height);
    }
    
    abstract void draw();
    
}
