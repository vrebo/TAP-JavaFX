package code3;

import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class RadioactiveSymbol extends Pane {

    private final Canvas canvas;
    
    public RadioactiveSymbol(double width, double height) {
        canvas = new Canvas(width, height);
        init();
        draw();
    }

    private void init() {
        getChildren().add(canvas);
        setBackground(new Background(
                new BackgroundFill(
                        Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
    }
    
    public final void draw() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        // Obtener las dimensiones del panel
        double width = canvas.getWidth();
        double height = canvas.getHeight();
        
        // Mover el origen al centro del panel
        gc.translate(width / 2, height / 2);
        
        int exteriorR = 250; //Radio del circulo externo (circulo amarillo)
        gc.setFill(Color.YELLOW);
        gc.fillOval(-exteriorR, -exteriorR, 2 * exteriorR, 2 * exteriorR);
        gc.setStroke(Color.BLACK);
        gc.strokeOval(-exteriorR, -exteriorR, 2 * exteriorR, 2 * exteriorR);
        
        int arcR = 230; //Radio de los arcos para las hélices.
        gc.setFill(Color.BLACK);
        gc.fillArc(-arcR, -arcR, arcR * 2, arcR * 2, 0, 60, ArcType.ROUND);
        gc.fillArc(-arcR, -arcR, arcR * 2, arcR * 2, 120, 60, ArcType.ROUND);
        gc.fillArc(-arcR, -arcR, arcR * 2, arcR * 2, 240, 60, ArcType.ROUND);
        
        int interiorR = 70; //Radio del circulo interior (circulo amarillo)
        gc.setFill(Color.YELLOW);
        gc.fillOval(-interiorR, -interiorR, interiorR * 2, interiorR * 2);
        
        int centerR = 50; //Radio del circulo interior (circulo negro)
        gc.setFill(Color.BLACK);
        gc.fillOval(-centerR, -centerR, centerR * 2, centerR * 2);
    }

}
