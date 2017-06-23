package code10toolBar;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.InputStream;

/**
 * Created by vrebo on 6/20/17.
 */
public class Panel extends HBox {

    private final ToolBar toolBar;

    public Panel() {
        toolBar = new ToolBar();
        toolBar.setOrientation(Orientation.VERTICAL);
        build();
    }

    private void build() {
        ImageView fileIcon = new ImageView(new Image(getClass().getResourceAsStream("file.png"))),
                saveIcon = new ImageView(new Image(getClass().getResourceAsStream("save.png"))),
                searchIcon = new ImageView(new Image(getClass().getResourceAsStream("search.png"))),
                settingsIcon = new ImageView(new Image(getClass().getResourceAsStream("settings.png"))),
                timeIcon = new ImageView(new Image(getClass().getResourceAsStream("time.png")));
        Button fileBtn = new Button(), saveBtn = new Button(), searchBtn = new Button(),
                settingsBtn = new Button(), timeBtn = new Button();

        fileBtn.setGraphic(fileIcon);
        searchBtn.setGraphic(searchIcon);
        saveBtn.setGraphic(saveIcon);
        settingsBtn.setGraphic(settingsIcon);
        timeBtn.setGraphic(timeIcon);

        toolBar.getItems().addAll(fileBtn, saveBtn, searchBtn, timeBtn, settingsBtn);
        getChildren().add(toolBar);
    }


}
