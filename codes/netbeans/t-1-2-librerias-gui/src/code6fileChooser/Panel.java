package code6fileChooser;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;

/**
 * Created by vrebo on 6/20/17.
 */
public class Panel extends StackPane {

    private final FileChooser chooser;

    public Panel() {
        chooser = new FileChooser();
        build();
    }

    private void build() {
        Button fileChooserBtn = new Button("ABRIR EL NAVEGADOR DE ARCHIVOS");

        fileChooserBtn.setOnAction(event -> {
            Button source = (Button) event.getSource();
            chooser.setTitle("Selecciona un archivo");
            chooser.showOpenDialog(null);
        });

        getChildren().add(fileChooserBtn);
    }
}
