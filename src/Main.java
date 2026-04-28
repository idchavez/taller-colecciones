import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Tareas lista = new Tareas();
        lista.agregarTarea("Estudiar Java");
        lista.agregarTarea("Hacer ejercicio");
        lista.mostrarTareas();
        lista.completarTarea(0);
        lista.totalPendientes();

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro("Patrones 1");
        biblioteca.agregarLibro("Patrones 2");
        biblioteca.mostrarLibros();
        biblioteca.buscarLibro("Patrones 2");
        biblioteca.totalLibros();

        Directorio dir = new Directorio();
        dir.agregarTrabajador("T1", 2000000);
        dir.agregarTrabajador("T2", 2500000);
        dir.mostrarTrabajadores();
        dir.actualizarSalario("T3", 3000000);
        dir.salarioPromedio();

    }
}