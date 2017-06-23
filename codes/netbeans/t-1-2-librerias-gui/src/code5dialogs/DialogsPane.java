package code5dialogs;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.FlowPane;

/**
 * Created by vrebo on 6/19/17.
 */
public class DialogsPane extends FlowPane {

    public DialogsPane() {
        build();
    }

    private void build() {
        Button infoBtn = new Button("Click para información"),
                warningBtn = new Button("Click para advertencia"),
                errorBtn = new Button("Click para error"),
                confirmBtn = new Button("Click para un mensaje de confirmación"),
                inputBtn = new Button("Click para un mensaje con entrada"),
                choiceBtn = new Button("Click para un mensaje con un selector");

        infoBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createAlert(Alert.AlertType.INFORMATION,
                        "Información", "¡Atencion!", "Este es un mensaje de información."
                ).show();
            }
        });

        warningBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createAlert(Alert.AlertType.WARNING,
                        "¡Advertencia!", "¡Cuidado!", "Este es un mensaje de advertencia."
                ).show();
            }
        });

        errorBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createAlert(Alert.AlertType.ERROR,
                        "Error", "¡Uyyy!", "Este es un mensaje de error."
                ).show();
            }
        });

        confirmBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                createAlert(Alert.AlertType.CONFIRMATION,
                        "Confirmación", "Piénselo dos veces", "¿De verdad desea formatear?."
                ).show();
            }
        });

        inputBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TextInputDialog dialog = new TextInputDialog();
                dialog.setTitle("TextInputDialog");
                dialog.setHeaderText("¿Cuál es su nombre?");
                dialog.showAndWait();
            }
        });

        choiceBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ChoiceDialog dialog = new ChoiceDialog("Soy daltónico",
                        "Soy daltónico", "Rojo", "Verde", "Azul");
                dialog.setTitle("ChoiceDialog");
                dialog.setHeaderText("¿Cuál es su color favorito?");
                dialog.show();
            }
        });


        getChildren().addAll(infoBtn, warningBtn, errorBtn, confirmBtn, inputBtn, choiceBtn);

    }

    private Alert createAlert(Alert.AlertType type, String title, String header, String message) {
        Alert alert = new Alert(type, message);
        alert.setHeaderText(header);
        alert.setTitle(title);
        return alert;
    }
}
