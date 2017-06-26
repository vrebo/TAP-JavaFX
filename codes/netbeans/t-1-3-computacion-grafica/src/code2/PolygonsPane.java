package code2;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PolygonsPane extends Canvas {

    public PolygonsPane(double width, double height) {
        super(width, height);
        draw();
    }

    public final void draw() {
        GraphicsContext gc = getGraphicsContext2D();
        double[] x1 = {50, 140, 160, 120, 100, 45};
        double[] y1 = {50, 100, 120, 190, 190, 60};
        gc.strokePolygon(x1, y1, x1.length);
        
        int incX = 200;
        int incY = 0;
        double[] x3 = {incX + 50, incX + 140, incX + 160, incX + 120, incX + 100, incX + 45};
        double[] y3 = {incY + 50, incY + 100, incY + 120, incY + 190, incY + 190, incY + 60};
        gc.setFill(Color.BLUE);
        gc.fillPolygon(x3, y3, 6);
        
        incY = 0;
        incX = 400;
        double[] x2 = {incX + 50, incX + 140, incX + 160, incX + 120, incX + 100, incX + 45};
        double[] y2 = {incY + 50, incY + 100, incY + 120, incY + 190, incY + 190, incY + 60};
        gc.setFill(Color.RED);
        gc.strokePolyline(x2, y2, 6);
    }
}
