import java.util.HashSet;

public class Biblioteca {
    private HashSet<String> libros = new HashSet<>();

    public void agregarLibro(String libro) {
        if (libros.add(libro)) {
            System.out.println("Libro agregado: " + libro);
        } else {
            System.out.println("El libro ya existe: " + libro);
        }
    }

    public void mostrarLibros() {
        System.out.println("\nLibros disponibles:");
        for (String libro : libros) {
            System.out.println("- " + libro);
        }
    }

    public void buscarLibro(String libro) {
        if (libros.contains(libro)) {
            System.out.println("El libro está disponible");
        } else {
            System.out.println("El libro NO está disponible");
        }
    }

    public void totalLibros() {
        System.out.println("Total libros únicos: " + libros.size());
    }
}
