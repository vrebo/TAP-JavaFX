public class #bfMain#bf extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Parent root = new EditorPane();
        primaryStage.setTitle("Ventana para edición de archivos");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
    
    public static void main(String[] args) { launch(args); }
}
