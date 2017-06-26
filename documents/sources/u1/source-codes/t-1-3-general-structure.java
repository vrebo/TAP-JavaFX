import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class #bfMyCanvas#bf extends Canvas{
    
    public MyCanvas(double width, double height) {
        super(width, height);
        draw();
    }
    
    public final void draw() {
        GraphicsContext gc = this.getGraphicsContext2D();
        ...
    }
}
