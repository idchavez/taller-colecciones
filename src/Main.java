import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ex1();
        ex2();
        ex3();
    }

    static void ex1 () {

        ArrayList<String> tareas = new ArrayList<>();
        tareas.add("tarea #1");
        tareas.add(1,"tarea #2");
        tareas.add(2,"tarea #3");

        System.out.println("-> Tareas disponibles:");
        for (String tarea: tareas) {
            System.out.println(tarea);
        }

        tareas.remove("tarea #1");

        System.out.println("Tareas pendientes: " + tareas.size());

    }

    static void ex2 () {
        Set<String> libros = new HashSet<>();
        libros.add("Libro #1");
        libros.add("Libro #2");
        libros.add("Libro #2");
        libros.add("Libro #3");
        libros.add("Libro #4");

        System.out.println("-> Lista de libros");
        for (String libro: libros) {
            System.out.println(libro);
        }

        boolean validarLibro = libros.contains("Libro #4");

        String imprimir = validarLibro ? "Existe el libro" : "No existe!";
        System.out.println(imprimir);
        System.out.println("Total de libros unicos: " + libros.size());
    }

    static void ex3 () {

    }
}