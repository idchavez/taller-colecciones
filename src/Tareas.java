import java.util.ArrayList;

public class Tareas {
    private ArrayList<String> tareas = new ArrayList<>();

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("Tarea agregada: " + tarea);
    }

    public void mostrarTareas() {
        System.out.println("\nLista de tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(i + " - " + tareas.get(i));
        }
    }

    public void completarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            String eliminada = tareas.remove(indice);
            System.out.println("Tarea completada y eliminada: " + eliminada);
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void totalPendientes() {
        System.out.println("Tareas pendientes: " + tareas.size());
    }
}
