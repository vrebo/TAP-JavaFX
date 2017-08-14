package code8;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author vrebo
 */
public class AnonymusClassPane extends Pane {

    private CustomCanvas canvas;
    private final int CANVAS_WIDTH = 300;
    private final int CANVAS_HEIGHT = 300;
    
    public AnonymusClassPane() {
        init();
        canvas.draw();
    }
    
    private void init() {       
        canvas = new CustomCanvas(CANVAS_WIDTH, CANVAS_HEIGHT) {
            @Override
            void draw() {
                GraphicsContext gc = getGraphicsContext2D();
                gc.setFill(Color.AQUA);
                double x, y, halfOfCanvas;
                halfOfCanvas = CANVAS_WIDTH / 2;
                x = y = halfOfCanvas - CANVAS_WIDTH / 4;
                gc.fillOval(x, y, halfOfCanvas, halfOfCanvas);
            }
        };
        getChildren().add(canvas);
    }
    
}
