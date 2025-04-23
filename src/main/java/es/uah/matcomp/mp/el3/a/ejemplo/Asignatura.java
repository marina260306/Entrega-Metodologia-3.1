package main.java.es.uah.matcomp.mp.el3.a.ejemplo;

public class Asignatura {
    private String nombre;
    private Estudiante[] estudiantes;
    public Asignatura(String nombre) {
        this.nombre=nombre;
        this.estudiantes=new Estudiante[2];
        Estudiante estudiante1=new Estudiante("Pablo");
        Estudiante estudiante2=new Estudiante("Hugo");
        estudiantes[0]=estudiante1;
        estudiantes[1]=estudiante2;

    }

}
