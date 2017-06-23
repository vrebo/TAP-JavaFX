public class MyMenuBar extends MenuBar{
    public MyMenuBar() { build(); }

    private void build() {
        //El guión bajo indica cual será el carácter mnemónico del menú.
        Menu file = new Menu("_Archivo");
        Menu edit = new Menu("_Editar");

        enableMnemonic(file);
        enableMnemonic(edit);

        addMenus(file, edit, new Menu("Ayuda"));

        addMenuItems(file,
                new MenuItem("Abrir") , new MenuItem("Guardar"),
                new MenuItem("Cerrar"), new SeparatorMenuItem());

        Menu props = new Menu("Propiedades");
        addMenuItems(props,
                new MenuItem("Propiedad 1"), new MenuItem("Propiedad 2"),
                new MenuItem("Propiedad 2"));

        addMenuItems(file,
                props, new SeparatorMenuItem(), new MenuItem("Salir"));

        MenuItem copy = new MenuItem("Copiar");

        //Asociación de la combinación de teclas con un item de menú.
        copy.setAccelerator(KeyCombination.keyCombination("SHORTCUT+C"));
        copy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Something was copied");
            }
        });

        InputStream stream = getClass().getResourceAsStream("copy-icon.png");
        copy.setGraphic(new ImageView(new Image(stream)));
        addMenuItems(edit, copy);
    }
}
