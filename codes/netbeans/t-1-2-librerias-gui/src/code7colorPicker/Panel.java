package code7colorPicker;


import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

/**
 * Created by vrebo on 6/20/17.
 */
public class Panel extends StackPane {

    private final ColorPicker colorPicker;

    public Panel() {
        colorPicker = new ColorPicker();
        build();
    }

    private void build() {
        Label label= new Label("Selecciona un color");

        VBox container = new VBox();

        container.getChildren().add(label);
        container.getChildren().add(colorPicker);
        container.setMaxWidth(VBox.USE_PREF_SIZE);

        colorPicker.setOnAction(event -> {

        });

        getChildren().add(container);
    }
}
