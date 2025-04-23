package main.java.es.uah.matcomp.mp.el3.a.ejemplo;

import java.lang.reflect.Array;

public class Alumno {
        private String nombre;
        private int edad;
        private double nota;
        private String[] array;

        // Constructor
        public Alumno(String nombre, int edad, double nota) {
            this.nombre = nombre;
            this.edad = edad;
            this.nota = nota;
            this.array = new String[2];
        }

        // Getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }

        // Método toString para mostrar la información del alumno
        @Override
        public String toString() {
            return "Alumno{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    ", nota=" + nota +
                    '}';
        }
    }
