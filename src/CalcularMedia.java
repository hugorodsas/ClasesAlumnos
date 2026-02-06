import java.util.ArrayList;

public class CalcularMedia {
    public static double calcular(ArrayList<Estudiante> estudiantes){
        double suma = 0;

        for(Estudiante estudiante: estudiantes){
            suma += estudiante.getNota();
        }

       return suma / estudiantes.size();
    }
}
