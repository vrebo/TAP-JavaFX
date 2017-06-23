package code1basicControls;

import javafx.scene.control.*;
import javafx.scene.layout.Pane;


public class Panel extends Pane {

    public Panel() {
        build();
    }

    private void build() {

        //BOTÓN
        Button btn = new Button("Mi botón");
        locateControl(btn, 50, 50);

        //ETIQUETA
        Label lbl = new Label("Este es un mensaje:");
        locateControl(lbl, 300, 50);

        //CAMPO DE TEXTO
        TextField input = new TextField();
        input.setPromptText("Valor de entrada:");
        locateControl(input, 50, 120);

        //ÁREA DE TEXTO
        TextArea area = new TextArea("Captura de texto en varias líneas");
        area.setPrefColumnCount(15);
        area.setPrefRowCount(3);
        locateControl(area, 300, 120);

        //CASILLAS DE VERIFICACIÓN
        CheckBox check1 = new CheckBox("Uno"), check2 = new CheckBox("Dos");
        check1.setSelected(true);

        locateControl(check1, 50, 260);
        locateControl(check2, 50, 290);


        //GRUPO DE BOTONES
        ToggleGroup group = new ToggleGroup();

        RadioButton rBtn1 = new RadioButton("Rojo"), rBtn2 = new RadioButton("Verde"), rBtn3 = new RadioButton("Azul");
        rBtn1.setToggleGroup(group);
        rBtn2.setToggleGroup(group);
        rBtn3.setToggleGroup(group);

        locateControl(rBtn1, 300, 260);
        locateControl(rBtn2, 370, 260);
        locateControl(rBtn3, 450, 260);
        //LISTA DESPLEGABLE
        ComboBox combo = new ComboBox();

        combo.getItems().addAll("Cyan", "Magenta",  "Amarillo",
                "Negro");

        combo.setValue("Cyan");

        locateControl(combo, 50, 340);

        //LISTA DE ELEMENTOS
        ListView<String> list = new ListView<>();
        list.getItems().addAll("Opción 1", "Opción 2", "Opción 3",
                "Opción 4", "Opción 5");

        list.setPrefHeight(100);

        locateControl(list, 300, 340);
    }
    
    private void locateControl(Control c, double x, double y) {
        c.setLayoutX(x);
        c.setLayoutY(y);
        getChildren().add(c);
    }

}
