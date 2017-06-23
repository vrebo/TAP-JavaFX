package code4tabPane;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

import javafx.scene.paint.Color;

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
        setAutogrow(red);
        setAutogrow(green);
        setAutogrow(blue);
        
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

    private Tab createBorderPane() {
        Tab tab = new Tab("BorderPane con Botones de Tamaño Autoajustable");
        BorderPane content = new BorderPane();

        Button top = new Button("Norteño"), bottom = new Button("Sureño"),
                center = new Button("Neutral"), left = new Button("Comunista"),
                right = new Button("Capitalista");

        //Configuración del ajustado automático mediante las medidas máximas
        //de los botones
        top.setMaxWidth(Double.MAX_VALUE);
        bottom.setMaxWidth(Double.MAX_VALUE);
        center.setMaxWidth(Double.MAX_VALUE);
        center.setMaxHeight(Double.MAX_VALUE);
        left.setMaxHeight(Double.MAX_VALUE);
        right.setMaxHeight(Double.MAX_VALUE);

        content.setTop(top);
        content.setCenter(center);
        content.setBottom(bottom);
        content.setLeft(left);
        content.setRight(right);

        tab.setContent(content);
        return tab;
    }

    private Tab createMixedPane() {
        Tab tab = new Tab("Mezcla de Paneles");
        BorderPane content = new BorderPane();
        content.setStyle("-fx-border-color: green ; -fx-border-width: 3px");

        HBox top = new HBox(); 
        top.setAlignment(Pos.CENTER); //<- Alineamiento de los elementos
        top.setSpacing(4);            //<- Asignación de espaciado entre elementos
        top.setPadding(new Insets(8));//<- Asignación de un espaciado entre los bordes y el contenido
        //Asignación de color de fondo mediante método
        top.setBackground(new Background(new BackgroundFill(Color.CYAN, null, null)));
        top.getChildren().addAll(new Button("Aceptar"), new Button("Cancelar"));
        content.setTop(top);

        tab.setContent(content);
        return tab;
    }

    private void setAutogrow(Node node) {
        GridPane.setVgrow(node, Priority.ALWAYS);
        GridPane.setHgrow(node, Priority.ALWAYS);
    }
}