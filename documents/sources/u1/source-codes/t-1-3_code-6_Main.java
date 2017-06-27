public class #bfMain#bf extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Parent root = new PolygonPane();
        primaryStage.setTitle("Dibujo de un polígono");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    
    public static void main(String[] args) { launch(args); }
}
