package main.java.es.uah.matcomp.mp.el3.a.ejemplo;

public class Asignatura {
    private String nombre;
    private Estudiante[] estudiantes;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new Estudiante[2];
        Estudiante estudiante1 = new Estudiante("Pablo", 20, 8.5);
        Estudiante estudiante2 = new Estudiante("Hugo", 20, 8.5);
        estudiantes[0] = estudiante1;
        estudiantes[1] = estudiante2;
    }

    public String getNombre() {
        return nombre;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", estudiantes=[" + estudiantes[0] + ", " + estudiantes[1] + "]" +
                '}';
    }
}


