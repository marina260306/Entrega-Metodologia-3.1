package main.java.es.uah.matcomp.mp.el3.a.ejemplo;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto){
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Marta", 17, "marta@gmail.com");
        Estudiante estudiante= new Estudiante("Miguel", 20, 8.5);
        guardarObjetoEnArchivo("C:\\Users\\marin\\IdeaProjects\\Entrega-Metodologia-3.1\\src\\main\\resources\\usuario.json", usuario);
        guardarObjetoEnArchivo("C:\\Users\\marin\\IdeaProjects\\Entrega-Metodologia-3.1\\src\\main\\resources\\alumno.json", estudiante);


    }

}
