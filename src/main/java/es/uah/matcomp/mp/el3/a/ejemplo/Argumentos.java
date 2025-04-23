package main.java.es.uah.matcomp.mp.el3.a.ejemplo;

public class Argumentos {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++)
            sb.append("Argumento " + i + ": " + args[i] + "\n");
        System.out.println("Argumentos: \n" + sb);
    }
}
