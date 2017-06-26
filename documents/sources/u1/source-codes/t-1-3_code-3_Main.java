public class #bfMain#bf extends Application {

    private static final int WIDHT = 600;
    private static final int HEIGHT = 600;

    @Override
    public void start(Stage primaryStage) {
        Parent root = new SymbolPane(WIDHT, HEIGHT);
        primaryStage.setTitle("Símbolo con paint");
        primaryStage.setScene(new Scene(root, WIDHT, HEIGHT));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
