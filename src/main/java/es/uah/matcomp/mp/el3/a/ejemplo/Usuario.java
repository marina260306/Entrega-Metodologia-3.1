package main.java.es.uah.matcomp.mp.el3.a.ejemplo;

public class Usuario {
    public String nombre;
    public int edad;
    public String correo;
    public Estudiante estudiante;
    public String[] array;

    public Usuario(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.estudiante = new Estudiante("Raquel", 20, 8.5);
        this.array = new String[3];
        this.array[0] = nombre;
    }

    public Usuario() {}

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                '}';
    }
}
