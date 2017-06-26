package code2;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class TextImagesPane extends Canvas {

    public TextImagesPane(double width, double height) {
        super(width, height);
        draw();
    }

    public final void draw() {
        GraphicsContext gc = getGraphicsContext2D();

        gc.setStroke(Color.BLUE);
        gc.strokeText("Mensaje en azul", 20, 20);

        gc.setStroke(new Color(0.4, 0.4, 0, 1));
        gc.strokeText("Mensaje en otro color", 400, 20);

        Font font;
        font = Font.font("Arial", FontWeight.BOLD, 24);
        gc.setFont(font);
        gc.setStroke(Color.RED);
        gc.strokeText("Mensaje en Arial", 20, 350);
        
        font = Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 18);
        gc.setStroke(Color.MAGENTA);
        gc.setFont(font);
        gc.strokeText("Mensaje en Courier", 400, 350);

        Image img = new Image(getClass().getResourceAsStream("/images/duke.jpg"));
        double imgWidth = img.getWidth();
        double imgHeight = img.getHeight();
        
        double canvasWidth = this.getWidth();
        double canvasHeight = this.getHeight();
        
        double x = canvasWidth / 2 - imgWidth / 2;
        double y = canvasHeight / 2 - imgHeight / 2;
        
        gc.drawImage(img, x, y);
    }

}
