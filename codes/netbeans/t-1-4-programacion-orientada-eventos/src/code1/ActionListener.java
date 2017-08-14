package code1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author vrebo
 */
public class ActionListener implements EventHandler<ActionEvent> {
    
    private final Pane layout;

    public ActionListener(Pane layout) {
        this.layout = layout;
    }
     

    @Override
    public void handle(ActionEvent event) {
        String sourceId = ((Node) event.getSource()).getId();
        
        switch(sourceId) {
            case "green-btn":
                layout.setBackground(new Background(
                        new BackgroundFill(Color.GREEN, null, null)));
                break;
                
            case "blue-btn":
                layout.setBackground(new Background(
                        new BackgroundFill(Color.BLUE, null, null)));
                break;
        }
        
    }
    
}
