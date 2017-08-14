package code10;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

//Implementación de la interface EventHandler<> para atender eventos.
public class CustomMenuBar extends MenuBar implements EventHandler<ActionEvent>{
    
    public CustomMenuBar() {
        build();
    }

    private void build() {
        Menu file = new Menu("_Archivo");
        Menu help = new Menu("A_yuda");

        MenuItem open = new MenuItem("Abrir");
        MenuItem about = new MenuItem("Acerca _De");
        MenuItem exit = new MenuItem("Salir");

        enableMnemonic(file);
        enableMnemonic(about);

        addMenus(file, help);

        addMenuItems(file, open, new SeparatorMenuItem(), exit);
        addMenuItems(help, about);
        
        //Oyente con clase anónima.
        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abriendo un archivo");
            }
        });
        
        //Oyente con expresión lambda
        exit.setOnAction((e) -> {
            Platform.exit();
        });
        
        //La misma instancia de ésta clase será un oyente.
        about.setOnAction(this);
    }
    
    //Implementación del método handle para atender las acciones de la opción
    //de menú 
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Mostrando el acerca de");
    }

    /**
     * Habilita el uso de caracteres mnemónicos para el menú.
     *
     * @param mi Menú al que se habilitará el uso de mnemónicos
     */
    private void enableMnemonic(MenuItem mi) {
        mi.setMnemonicParsing(true);
    }

    private void addMenus(Menu... ms) {
        getMenus().addAll(ms);
    }

    private void addMenuItems(Menu m, MenuItem... mis) {
        m.getItems().addAll(mis);
    }
}
