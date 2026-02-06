import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class LeerFichero {
    public static ArrayList<String> leer (Path path) throws IOException {
        return new ArrayList<>(Files.readAllLines(path));
    }
}
