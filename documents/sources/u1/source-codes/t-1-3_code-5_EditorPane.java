import java.util.List;
import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import util.FileHelper;

public class #bfEditorPane#bf extends StackPane {

    private TextArea editor;

    private static final int COLUMN_COUNT = 20;
    private static final int ROW_COUNT = 5;
    private static final Font FONT;
    private static final String PROMPT_TEXT = "Sin archivo cargado... :C";

    static {
        FONT = Font.font("Courier New", FontWeight.BOLD, 12);
    }

    public EditorPane() {
        init();
        build();
        loadFile();
    }

    private void init() {
        editor = new TextArea();
        setPadding(new Insets(16));
    }

    private void build() {
        editor.setPrefColumnCount(COLUMN_COUNT);
        editor.setPrefRowCount(ROW_COUNT);
        editor.setFont(FONT);
        editor.setPromptText(PROMPT_TEXT);
        getChildren().add(editor);
    }

    private void loadFile() {
        String file = "./src/code5/EditorPane.java";

        List<String> content = FileHelper.readFile(file);

        int i = 1;

        for (String line : content) {
            editor.appendText(i + ":\t" + line + "\n");
            i++;
        }
    }
}
