package code2;

import javafx.geometry.Insets;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class GraphicContextPane extends TabPane {
    
    
    public GraphicContextPane(double width, double height) {
        setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
        getTabs().add(new Tab("Primitivas", new PrimitivesPane(width, height)));
        getTabs().add(new Tab("Arcos", new ArcsPane(width, height)));
        getTabs().add(new Tab("Polígonos", new PolygonsPane(width, height)));
        getTabs().add(new Tab("Texto e Imágenes", new TextImagesPane(width, height)));        
    }
}
