    ...

    private Tab createBorderPane() {
        Tab tab = new Tab("BorderPane con Botones de Tamaño Autoajustable");
        BorderPane content = new BorderPane();
        Button top = new Button("Norteño"), bottom = new Button("Sureño"),
                center = new Button("Neutral"), left = new Button("Comunista"),
                right = new Button("Capitalista");

        //Configuración del ajustado automático mediante las medidas máximas de los botones
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
        HBox top = new HBox(); 
        
        content.setStyle("-fx-border-color: green ; -fx-border-width: 3px");
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
