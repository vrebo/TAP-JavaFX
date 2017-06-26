import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class #bfPrimitivesPane#bf extends Canvas {

    public PrimitivesPane(double width, double height) {
        super(width, height);
        draw();
    }

    public final void draw() {
        GraphicsContext gc = getGraphicsContext2D();
        gc.setStroke(Color.RED);
        gc.strokeLine(5, 30, 380, 30);

        gc.setStroke(Color.BLUE);
        gc.strokeRect(5, 60, 90, 55);
        gc.setFill(Color.BLUE);
        gc.fillRect(5, 150, 90, 55);

        gc.setStroke(Color.CYAN);
        gc.strokeRoundRect(100, 60, 90, 55, 20, 20);
        gc.setFill(Color.CYAN);
        gc.fillRoundRect(192, 60, 90, 55, 50, 50);

        gc.setStroke(Color.MAGENTA);
        gc.strokeOval(100, 150, 90, 55);
        gc.setFill(Color.MAGENTA);
        gc.fillOval(192, 150, 90, 55);
    }
}
