public class #bfDrawPane#bf extends Pane {

    private final Canvas canvas;

    public DrawPane(double width, double height) {
        canvas = new Canvas(width, height);
        init();
        draw();
    }

    private void init() {
        getChildren().add(canvas);
        setBackground(new Background(
                new BackgroundFill(
                        Color.CYAN, CornerRadii.EMPTY, Insets.EMPTY)));
    }

    private void draw() {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Obtener las dimensiones del panel
        double ancho = canvas.getWidth();
        double alto = canvas.getHeight();

        // Mover el origen al centro
        gc.translate(ancho / 2, alto / 2);

        // Dibujar los ejes de coordendas
        gc.strokeLine(-ancho / 2, 0, ancho / 2, 0);
        gc.strokeLine(0, -alto / 2, 0, alto / 2);

        // Cuadrado con centro en el origen
        int lado = 200;
        gc.setFill(Color.BLUE);
        gc.fillRect(-lado / 2, -lado / 2, lado, lado);
        gc.setStroke(Color.BLACK);
        gc.strokeRect(-lado / 2, -lado / 2, lado, lado);

        // Círculo con centro en el origen
        gc.setFill(Color.CYAN);
        gc.fillOval(-lado / 2, -lado / 2, lado, lado);
        gc.strokeOval(-lado / 2, -lado / 2, lado, lado);

        // Rombo inscrito en el cuadrado
        double[] pX = {0, -lado / 2, 0, lado / 2};
        double[] pY = {-lado / 2, 0, lado / 2, 0};
        gc.setFill(Color.GREEN);
        gc.fillPolygon(pX, pY, pX.length);
        gc.strokePolygon(pX, pY, pX.length);

        // Círculo con centro en el origen
        int radio = 200;
        gc.setStroke(Color.GRAY);
        gc.strokeOval(-radio, -radio, 2 * radio, 2 * radio);

        // Dibujar rayos del centro a ocho puntos en el círculo
        gc.setStroke(Color.BLACK);
        for (int i = 0; i < 8; i++) {
            double rad = Math.toRadians(45 * i);
            int x = (int) (radio * Math.cos(rad));
            int y = (int) (radio * Math.sin(rad));
            gc.strokeLine(0, 0, x, y);
        }

        // Dibujar líneas que unan los rayos
        gc.setStroke(Color.ORANGE);
        int ax = radio;
        int ay = 0;
        for (int i = 0; i <= 8; i++) {
            double rad = Math.toRadians(45 * i);
            int x = (int) (radio * Math.cos(rad));
            int y = (int) (radio * Math.sin(rad));
            gc.strokeLine(ax, ay, x, y);
            ax = x;
            ay = y;
        }

        // Dibujar 8 puntos al final de cada rayo
        gc.setFill(Color.MAGENTA);
        for (int i = 0; i < 8; i++) {
            double rad = Math.toRadians(45 * i);
            int x = (int) (radio * Math.cos(rad));
            int y = (int) (radio * Math.sin(rad));
            gc.fillOval(x - 10, y - 10, 20, 20);
        }
    }
}

