package ejercicio01;

public class MainEjercicio1 {
    public static void main(String[] args) {
        ListaDeTareas lista = new ListaDeTareas();

        lista.agregarTarea(new Tarea("Estudiar Collections"));
        lista.agregarTarea(new Tarea("Hacer ejercicio de Generics"));
        lista.agregarTarea(new Tarea("Revisar apuntes de Java"));

        System.out.println("=== Lista de Tareas ===");
        lista.mostrarTareas();

        System.out.println("\n--- Completando 'Estudiar Collections' ---");
        Tarea t = lista.buscarTarea("Estudiar Collections");
        if (t != null) {
            t.completar();
        }

        System.out.println("\n--- Eliminando 'Revisar apuntes de Java' ---");
        lista.eliminarTarea("Revisar apuntes de Java");

        System.out.println("\n=== Lista actualizada ===");
        lista.mostrarTareas();
    }
}
