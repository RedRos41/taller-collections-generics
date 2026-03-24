package ejercicio02;

public class MainEjercicio2 {
    public static void main(String[] args) {
        PairList<String, Integer> edades = new PairList<>();

        edades.add("Alice", 25);
        edades.add("Bob", 30);
        edades.add("Carlos", 22);

        System.out.println("=== PairList<String, Integer> ===");
        edades.mostrar();

        System.out.println("\nEdad de Bob: " + edades.getValue("Bob"));
        System.out.println("Contiene 'Alice': " + edades.containsKey("Alice"));

        edades.remove("Carlos");
        System.out.println("\n--- Después de eliminar 'Carlos' ---");
        edades.mostrar();

        System.out.println("\n=== PairList<Integer, String> ===");
        PairList<Integer, String> codigos = new PairList<>();
        codigos.add(1, "Activo");
        codigos.add(2, "Inactivo");
        codigos.add(3, "Pendiente");
        codigos.mostrar();
    }
}
