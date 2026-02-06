import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            Path path = Path.of("salida.txt");

            ArrayList<String> lineas = LeerFichero.leer(path);
            ArrayList<Estudiante> estudiantes = PasearFichero.pasear(lineas);
            double media = CalcularMedia.calcular(estudiantes);
            MostrarResultado.mostrar(media);
        } catch (Exception e) {
            System.out.println("Error al procesar el archivo");
            e.printStackTrace();
        }
    }
}