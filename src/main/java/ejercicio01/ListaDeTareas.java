package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTareas {
    private List<Tarea> tareas;

    public ListaDeTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public boolean eliminarTarea(String nombre) {
        return tareas.removeIf(t -> t.getNombre().equalsIgnoreCase(nombre));
    }

    public Tarea buscarTarea(String nombre) {
        for (Tarea t : tareas) {
            if (t.getNombre().equalsIgnoreCase(nombre)) {
                return t;
            }
        }
        return null;
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas en la lista.");
            return;
        }
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}
