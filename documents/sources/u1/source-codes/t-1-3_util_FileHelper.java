import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class #bfFileHelper#bf {

    public static List<String> readFile(String fileName) {

        List<String> lines = new ArrayList<>();

        try (   //Flujo de caracteres
                FileReader stream = new FileReader(fileName);
                //Buffer de Strings
                BufferedReader reader = new BufferedReader(stream)) {

            String line = reader.readLine();
            while (line != null) { //Si line == null se alcanzó el final del archivo
                lines.add(line);
                line = reader.readLine();
            }

        } catch (FileNotFoundException ex) {
            System.err.println("Archivo no encontrado");
            System.err.println("Detalles: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error con el flujo del archivo");
            System.err.println("Detalles: " + ex.getMessage());
        }

        return lines;
    }
}
