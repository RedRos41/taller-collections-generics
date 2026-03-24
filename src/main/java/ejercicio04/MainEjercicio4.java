package ejercicio04;

public class MainEjercicio4 {
    public static void main(String[] args) {
        System.out.println("=== Repositorio<String> ===");
        Repositorio<String> repoStrings = new Repositorio<>();
        repoStrings.agregar("Java");
        repoStrings.agregar("Python");
        repoStrings.agregar("C++");
        repoStrings.mostrar();
        System.out.println("Contiene 'Java': " + repoStrings.contiene("Java"));

        System.out.println("\n=== Repositorio<Integer> ===");
        Repositorio<Integer> repoEnteros = new Repositorio<>();
        repoEnteros.agregar(10);
        repoEnteros.agregar(20);
        repoEnteros.agregar(30);
        repoEnteros.mostrar();
        System.out.println("Elemento en índice 1: " + repoEnteros.obtener(1));

        System.out.println("\n--- Eliminando 20 ---");
        repoEnteros.eliminar(20);
        repoEnteros.mostrar();
        System.out.println("Tamaño: " + repoEnteros.tamaño());
    }
}
