import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

public class MyMenuBar extends javafx.scene.control.MenuBar {

    public MyMenuBar() { build(); }

    private void build() {
        Menu file = new Menu("Archivo");
        addMenu(file);
        addMenu(new Menu("Editar"));
        addMenu(new Menu("Ayuda"));

        addMenuItems(file, new MenuItem("Abrir"), new MenuItem("Guardar"),
                new MenuItem("Cerrar"), new SeparatorMenuItem());

        Menu props = new Menu("Propiedades");
        addMenuItems(props, new MenuItem("Propiedad 1"), new MenuItem("Propiedad 2"),
                new MenuItem("Propiedad 2"));

        addMenuItems(file, props, new SeparatorMenuItem(), new MenuItem("Salir"));
    }

    private void addMenu(Menu mi) { getMenus().add(mi); }

    private void addMenuItems(Menu m, MenuItem... mis) { m.getItems().addAll(mis); }
}
