package code2;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class ArcsPane extends Canvas {

    public ArcsPane(double width, double height) {
        super(width, height);
        draw();
    }

    public final void draw() {
        GraphicsContext gc = getGraphicsContext2D();

        gc.setStroke(Color.RED);
        gc.strokeRect(40, 35, 80, 80);
        gc.strokeRect(160, 35, 80, 80);
        gc.strokeRect(280, 35, 80, 80);

        gc.setStroke(Color.BLACK);
        gc.strokeArc(40, 35, 80, 80, 0, 360, ArcType.ROUND);
        gc.strokeArc(160, 35, 80, 80, 0, 110, ArcType.ROUND);
        gc.strokeArc(280, 35, 80, 80, 0, -270, ArcType.ROUND);

        gc.setFill(Color.ORANGE);
        gc.fillArc(40, 150, 80, 70, 0, 360, ArcType.ROUND);
        gc.fillArc(160, 150, 80, 70, 270, - 90, ArcType.ROUND);
        gc.fillArc(280, 150, 80, 70, 0, -270, ArcType.ROUND);
    }

}
