package code1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author vrebo
 */
public class Layout extends HBox {
    
    private Button greenBtn;
    private Button blueBtn;

    public Layout() { init(); }
    
    private void init() {
        setAlignment(Pos.CENTER);
        setSpacing(16);
        
        greenBtn = new Button("CAMBIAR FONDO A VERDE");
        blueBtn = new Button("CAMBIAR FONDO A AZUL");
        
        greenBtn.setId("green-btn");
        blueBtn.setId("blue-btn");

        getChildren().addAll(greenBtn, blueBtn);
    }
    
    public void addListener(EventHandler<ActionEvent> listener) {
        greenBtn.setOnAction(listener);
        blueBtn.setOnAction(listener);
    }
    
}
