package code8scrollPane;

import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;


/**
 * Created by vrebo on 6/20/17.
 */
public class Panel extends StackPane {

    public Panel() { build(); }

    private void build() {
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("calzada.JPG")));

        ScrollPane content = new ScrollPane(imageView);
        content.setPannable(true); //Habilita el desplazamiento mediante arrastre del mouse.

        getChildren().add(content);
    }
}
