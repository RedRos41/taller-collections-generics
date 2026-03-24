package ejercicio06;

import java.util.List;

public class MaximoGenerico {

    /**
     * Retorna el elemento máximo de una lista usando el orden natural (Comparable).
     */
    public static <T extends Comparable<T>> T maximo(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacía.");
        }

        T max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(max) > 0) {
                max = lista.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> enteros = List.of(3, 7, 1, 9, 4, 6);
        System.out.println("Lista de enteros: " + enteros);
        System.out.println("Máximo: " + maximo(enteros));

        List<Double> decimales = List.of(2.5, 8.1, 3.7, 5.9);
        System.out.println("\nLista de decimales: " + decimales);
        System.out.println("Máximo: " + maximo(decimales));

        List<String> cadenas = List.of("banana", "manzana", "cereza", "durazno");
        System.out.println("\nLista de cadenas: " + cadenas);
        System.out.println("Máximo: " + maximo(cadenas));
    }
}
