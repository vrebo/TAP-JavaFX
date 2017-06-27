import java.util.List;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import util.FileHelper;

public class #bfPolygonPane#bf extends StackPane {

    private double[] x;
    private double[] y;

    private final Canvas canvas;

    public PolygonPane() {
        canvas = new Canvas(500, 400);
        init();
        loadFile();
        draw();
    }

    private void init() {        
        setBackground(new Background(
                new BackgroundFill(Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));
        getChildren().add(canvas);
    }

    private void draw() {
        if (x != null) {
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.setFill(Color.BLUE);
            gc.fillPolygon(x, y, x.length);
            gc.setStroke(Color.BLACK);
            gc.strokePolygon(x, y, x.length);
        }
    }

    private void loadFile() {
        String file = "./src/code6/points.txt";

        List<String> lines = FileHelper.readFile(file);

        int pointsCount = lines.size();
        x = new double[pointsCount];
        y = new double[pointsCount];

        for (int i = 0; i < pointsCount; i++) {
            String linea = lines.get(i);
            String[] coord = linea.split(",");
            x[i] = Double.parseDouble(coord[0]);
            y[i] = Double.parseDouble(coord[1]);
        }
    }
}
