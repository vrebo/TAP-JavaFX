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
        double width = canvas.getWidth();
        double height = canvas.getHeight();

        // Mover el origen al centro
        gc.translate(width / 2, height / 2);

        // Dibujar los ejes de coordendas
        gc.strokeLine(-width / 2, 0, width / 2, 0);
        gc.strokeLine(0, -height / 2, 0, height / 2);

        // Cuadrado con centro en el origen
        int sidelenght = 200;
        gc.setFill(Color.BLUE);
        gc.fillRect(-sidelenght / 2, -sidelenght / 2, sidelenght, sidelenght);
        gc.setStroke(Color.BLACK);
        gc.strokeRect(-sidelenght / 2, -sidelenght / 2, sidelenght, sidelenght);

        // Círculo con centro en el origen
        gc.setFill(Color.CYAN);
        gc.fillOval(-sidelenght / 2, -sidelenght / 2, sidelenght, sidelenght);
        gc.strokeOval(-sidelenght / 2, -sidelenght / 2, sidelenght, sidelenght);

        // Rombo inscrito en el cuadrado
        double[] pX = {0, -sidelenght / 2, 0, sidelenght / 2};
        double[] pY = {-sidelenght / 2, 0, sidelenght / 2, 0};
        gc.setFill(Color.GREEN);
        gc.fillPolygon(pX, pY, pX.length);
        gc.strokePolygon(pX, pY, pX.length);

        // Círculo con centro en el origen
        int radious = 200;
        gc.setStroke(Color.GRAY);
        gc.strokeOval(-radious, -radious, 2 * radious, 2 * radious);

        // Dibujar rayos del centro a ocho puntos en el círculo
        gc.setStroke(Color.BLACK);
        for (int i = 0; i < 8; i++) {
            double rad = Math.toRadians(45 * i);
            int x = (int) (radious * Math.cos(rad));
            int y = (int) (radious * Math.sin(rad));
            gc.strokeLine(0, 0, x, y);
        }
        ...

        // Dibujar líneas que unan los rayos
        gc.setStroke(Color.ORANGE);
        int ax = radious;
        int ay = 0;
        for (int i = 0; i <= 8; i++) {
            double rad = Math.toRadians(45 * i);
            int x = (int) (radious * Math.cos(rad));
            int y = (int) (radious * Math.sin(rad));
            gc.strokeLine(ax, ay, x, y);
            ax = x;
            ay = y;
        }

        // Dibujar 8 puntos al final de cada rayo
        gc.setFill(Color.MAGENTA);
        for (int i = 0; i < 8; i++) {
            double rad = Math.toRadians(45 * i);
            int x = (int) (radious * Math.cos(rad));
            int y = (int) (radious * Math.sin(rad));
            gc.fillOval(x - 10, y - 10, 20, 20);
        }
    }
}


