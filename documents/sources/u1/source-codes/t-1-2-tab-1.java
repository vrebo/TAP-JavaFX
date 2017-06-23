public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        TabPane root = new MyTabPane();
        primaryStage.setTitle("Ejemplo de TabPane y Paneles Complejos");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
