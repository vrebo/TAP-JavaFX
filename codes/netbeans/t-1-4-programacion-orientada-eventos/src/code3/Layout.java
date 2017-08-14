package code3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/**
 *
 * @author vrebo
 */
public class Layout extends HBox {

    private Button greenBtn;
    private Button blueBtn;

    public Layout() {
        init();
        setupListener();
    }

    private void init() {
        setAlignment(Pos.CENTER);
        setSpacing(16);

        greenBtn = new Button("CAMBIAR FONDO A VERDE");
        blueBtn = new Button("CAMBIAR FONDO A AZUL");

        greenBtn.setId("green-btn");
        blueBtn.setId("blue-btn");

        getChildren().addAll(greenBtn, blueBtn);
    }

    private void setupListener() {
        ActionListener listener = new ActionListener();
        greenBtn.setOnAction(listener);
        blueBtn.setOnAction(listener);
    }

    class ActionListener implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            String sourceId = ((Node) event.getSource()).getId();

            switch (sourceId) {
                case "green-btn":
                    Layout.this.setBackground(new Background(
                            new BackgroundFill(Color.GREEN, null, null)));
                    break;

                case "blue-btn":
                    Layout.this.setBackground(new Background(
                            new BackgroundFill(Color.BLUE, null, null)));
                    break;
            }
        }
    }

}
