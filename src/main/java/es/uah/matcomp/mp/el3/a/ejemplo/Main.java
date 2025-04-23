package main.java.es.uah.matcomp.mp.el3.a.ejemplo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso incorrecto. Usa: java -jar NombreDeTuProyecto.jar <operacion> <fichero>");
            return;
        }

        String operacion = args[0];
        String fichero = args[1];

        switch (operacion) {
            case "init":
                // Crear y guardar datos en el fichero
                init(fichero);
                break;

            case "show":
                // Cargar y mostrar datos desde el fichero
                show(fichero);
                break;

            default:
                System.out.println("Operación no válida. Usa 'init' o 'show'.");
        }
    }

    // Método para crear el archivo con datos por defecto
    public static void init(String fichero) {
        // Crear algunos alumnos por defecto
        Alumno alumno1 = new Alumno("Juan", 20, 8.5);
        Alumno alumno2 = new Alumno("Lucía", 22, 9.3);
        Alumno alumno3 = new Alumno("Carlos", 19, 7.8);

        // Crear una lista de alumnos
        List<Alumno> alumnos = List.of(alumno1, alumno2, alumno3);

        // Guardar la lista de alumnos en un archivo JSON
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(fichero)) {
            gson.toJson(alumnos, writer);
            System.out.println("Archivo creado con datos por defecto.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer los datos desde el archivo y mostrarlos
    public static void show(String fichero) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(fichero)) {
            // Leer y convertir el JSON en una lista de objetos Alumno
            List<Alumno> alumnos = gson.fromJson(reader, new TypeToken<List<Alumno>>() {}.getType());
            // Mostrar los datos de los alumnos
            if (alumnos != null) {
                for (Alumno alumno : alumnos) {
                    System.out.println(alumno);
                }
            } else {
                System.out.println("No se pudieron cargar los datos del archivo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

