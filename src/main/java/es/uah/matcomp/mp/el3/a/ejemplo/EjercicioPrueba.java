package main.java.es.uah.matcomp.mp.el3.a.ejemplo;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioPrueba {

    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    // Método para guardar un objeto en un archivo JSON
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto){
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        String operacion = args[0];
        String fichero = args[1];

        if (operacion.equals("init")) {
            Estudiante estudiante = new Estudiante("Paula", 20, 8.5);
            guardarObjetoEnArchivo(fichero, estudiante);

        } else if (operacion.equals("show")) {
            Usuario usuario = cargarObjetoDesdeArchivo(fichero, Usuario.class);


            if (usuario != null) {
                System.out.println("Usuario cargado:");
                System.out.println("Nombre: " + usuario.nombre);
                System.out.println("Edad: " + usuario.edad);
                System.out.println("Correo: " + usuario.correo);
            } else {
                System.out.println("No se pudo cargar el usuario.");
            }
        }

    }
}