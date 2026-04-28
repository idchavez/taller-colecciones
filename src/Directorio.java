import java.util.HashMap;
import java.util.Map;

public class Directorio {
    private HashMap<String, Double> trabajadores = new HashMap<>();

    public void agregarTrabajador(String nombre, double salario) {
        trabajadores.put(nombre, salario);
        System.out.println("Trabajador agregado: " + nombre);
    }

    public void mostrarTrabajadores() {
        System.out.println("\nDirectorio:");
        for (Map.Entry<String, Double> entry : trabajadores.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }

    public void actualizarSalario(String nombre, double nuevoSalario) {
        if (trabajadores.containsKey(nombre)) {
            trabajadores.put(nombre, nuevoSalario);
            System.out.println("Salario actualizado de " + nombre);
        } else {
            System.out.println("Trabajador no encontrado");
        }
    }

    public void salarioPromedio() {
        double suma = 0;

        for (double salario : trabajadores.values()) {
            suma += salario;
        }

        double promedio = trabajadores.isEmpty() ? 0 : suma / trabajadores.size();
        System.out.println("Salario promedio: $" + promedio);
    }
}
