public class Main extends Application {

    public void start(Stage primaryStage) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("chat-layout.fxml"));
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
            root = new StackPane(new Label("Lo sentimos, hubo un error cargando el layout"));
        }
        primaryStage.setTitle("Demostración de uso de FXML");
        primaryStage.setScene(new Scene(root, 600, 300));
        primaryStage.show();
    }

    public static void main(String [] args) { launch(args); }
}
