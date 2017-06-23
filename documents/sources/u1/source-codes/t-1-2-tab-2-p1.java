public class MyTabPane extends TabPane {

    public MyTabPane() { build(); }

    private void build() {
        getTabs().add(createGridPane());
        getTabs().add(createSimpleGridPane());
        getTabs().add(createBorderPane());
        getTabs().add(createMixedPane());
    }

    private Tab createGridPane() {
        Tab tab = new Tab("GridPane con Elementos Autoajustables");
        GridPane content = new GridPane();
        Pane red = new Pane(), green = new Pane(), blue = new Pane();
        
        //Asignación de colores de background con propiedades CSS
        red.setStyle("-fx-background-color: #FF0000");
        green.setStyle("-fx-background-color: #00FF00");
        blue.setStyle("-fx-background-color: #0000FF");
        
        //Configuración del ajustado automático
        setAutogrow(red); setAutogrow(green); setAutogrow(blue);        
        content.add(red, 0, 0);
        content.add(green, 1, 0);
        content.add(blue, 0, 1);

        tab.setContent(content);
        return tab;
    }

    private Tab createSimpleGridPane() {
        Tab tab = new Tab("GridPane con Elementos Alineados");
        GridPane content = new GridPane();       
        Button left = new Button("Izquierda"), center = new Button("Centro"),
                rightTop = new Button("Derecha"), leftBottom = new Button("Izquierda Abajo");

        //Distribución equitativa del ancho disponible en ambas columnas
        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(50);
        content.getColumnConstraints().addAll(cc, cc);
        
        //Distribución equitativa del alto disponible en ambas filas
        RowConstraints rc = new RowConstraints();
        rc.setPercentHeight(50);
        content.getRowConstraints().addAll(rc, rc);
        
        //Alineamiento de los botones
        GridPane.setHalignment(center, HPos.CENTER);
        GridPane.setHalignment(rightTop, HPos.RIGHT);
        GridPane.setValignment(rightTop, VPos.TOP);
        GridPane.setHalignment(leftBottom, HPos.LEFT);
        GridPane.setValignment(leftBottom, VPos.BOTTOM);
        content.add(left, 0, 0);
        content.add(center, 1, 0);
        content.add(rightTop, 0, 1);
        content.add(leftBottom, 1, 1);
        
        tab.setContent(content);
        return tab;
    }

   ...
