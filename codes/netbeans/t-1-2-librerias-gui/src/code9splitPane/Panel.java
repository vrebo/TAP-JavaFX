package code9splitPane;

import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * Created by vrebo on 6/20/17.
 */
public class Panel extends SplitPane {

    public Panel() { build(); }

    public void build() {
        Pane red = new Pane(), green = new StackPane(), blue = new Pane();
        red.setStyle("-fx-background-color: green");
        green.setStyle("-fx-background-color: white");
        blue.setStyle("-fx-background-color: red");
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("aguila.png")));

        green.getChildren().add(imageView);

        final StackPane sp1 = new StackPane();
        sp1.getChildren().add(red);
        final StackPane sp2 = new StackPane();
        sp2.getChildren().add(green);
        final StackPane sp3 = new StackPane();
        sp3.getChildren().add(blue);
        getItems().addAll(sp1, sp2, sp3);
        setDividerPositions(0.35f, 0.65f);
    }
}
