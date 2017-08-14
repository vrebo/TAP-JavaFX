package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/**
 *
 * @author vrebo
 */
public class Controller {
    
    @FXML
    private HBox container;
    
    @FXML
    private void changeToGreen(ActionEvent event) {
        container.setBackground(new Background(
                                new BackgroundFill(Color.GREEN, null, null)));
    }
    
    @FXML
    private void changeToBlue(ActionEvent event) {
        container.setBackground(new Background(
                                new BackgroundFill(Color.BLUE, null, null)));
    }
    
}
