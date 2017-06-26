public class #bfGraphicContextPane#bf extends TabPane {
    
    public GraphicContextPane(double width, double height) {
        setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));
        getTabs().add(new Tab("Primitivas", new PrimitivesPane(width, height)));
        getTabs().add(new Tab("Arcos", new ArcsPane(width, height)));
        getTabs().add(new Tab("Polígonos", new PolygonsPane(width, height)));
        getTabs().add(new Tab("Texto e Imágenes", new TextImagesPane(width, height)));
    }
}
