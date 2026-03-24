package ejercicio03;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> nombres = new LinkedHashSet<>();

        nombres.add("Alice");
        nombres.add("Bob");
        nombres.add("Carlos");
        nombres.add("Alice");   // Duplicado, no se agrega
        nombres.add("Diana");
        nombres.add("Bob");     // Duplicado, no se agrega

        System.out.println("=== LinkedHashSet - Elementos únicos en orden de inserción ===");
        System.out.println("Cantidad de elementos: " + nombres.size());

        int i = 1;
        for (String nombre : nombres) {
            System.out.println(i + ". " + nombre);
            i++;
        }

        System.out.println("\n--- Intentando agregar duplicados ---");
        boolean agregado1 = nombres.add("Carlos");
        boolean agregado2 = nombres.add("Elena");
        System.out.println("Agregar 'Carlos' (duplicado): " + agregado1);
        System.out.println("Agregar 'Elena' (nuevo): " + agregado2);

        System.out.println("\n=== Lista final ===");
        for (String nombre : nombres) {
            System.out.println("  - " + nombre);
        }
    }
}
