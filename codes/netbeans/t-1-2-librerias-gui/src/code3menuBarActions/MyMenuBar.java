package code3menuBarActions;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;

import java.io.InputStream;

public class MyMenuBar extends MenuBar{
    public MyMenuBar() { build(); }

    private void build() {
        //El guión bajo indica cual será el carácter mnemónico del menú.
        Menu file = new Menu("_Archivo");
        Menu edit = new Menu("_Editar");

        enableMnemonic(file);
        enableMnemonic(edit);

        addMenus(file, edit, new Menu("A_yuda"));

        addMenuItems(file,
                new MenuItem("Abrir") , new MenuItem("Guardar"),
                new MenuItem("Cerrar"), new SeparatorMenuItem());

        Menu props = new Menu("Propiedades");
        addMenuItems(props,
                new MenuItem("Propiedad 1"), new MenuItem("Propiedad 2"),
                new MenuItem("Propiedad 2"));

        addMenuItems(file,
                props,
                new SeparatorMenuItem(), new MenuItem("Salir"));


        MenuItem copy = new MenuItem("Copiar");

        //Asociación de la combinación de teclas con un item de menú.
        copy.setAccelerator(KeyCombination.keyCombination("SHORTCUT+C"));
        copy.setOnAction(event -> System.out.println("Something was copied"));
        /*copy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Something was copied");
            }
        });*/

        InputStream fileStream = getClass().getResourceAsStream("copy-icon.png");
        copy.setGraphic(new ImageView(new Image(fileStream)));
        addMenuItems(edit, copy);
    }

    /**
     * Habilita el uso de caracteres mnemónicos para el menú.
     * @param mi Menú al que se habilitará el uso de mnemónicos
     */
    private void enableMnemonic(MenuItem mi) { mi.setMnemonicParsing(true); }

    private void addMenus(Menu... ms) { getMenus().addAll(ms); }

    private void addMenuItems(Menu m, MenuItem... mis) { m.getItems().addAll(mis); }
}
