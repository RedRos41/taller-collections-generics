package ejercicio11;

import java.util.LinkedList;
import java.util.Queue;

public class MergeQueues {

    /**
     * Fusiona dos colas ordenadas en una sola cola ordenada.
     * Ambas colas de entrada deben estar previamente ordenadas.
     */
    public static <T extends Comparable<T>> Queue<T> merge(Queue<T> q1, Queue<T> q2) {
        Queue<T> resultado = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek().compareTo(q2.peek()) <= 0) {
                resultado.add(q1.poll());
            } else {
                resultado.add(q2.poll());
            }
        }

        // Agregar los restantes
        while (!q1.isEmpty()) {
            resultado.add(q1.poll());
        }
        while (!q2.isEmpty()) {
            resultado.add(q2.poll());
        }

        return resultado;
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(3);
        q1.add(5);
        q1.add(7);

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(2);
        q2.add(4);
        q2.add(6);
        q2.add(8);
        q2.add(9);

        System.out.println("Cola 1: " + q1);
        System.out.println("Cola 2: " + q2);

        Queue<Integer> merged = merge(q1, q2);
        System.out.println("Merge:  " + merged);

        System.out.println("\n=== Con Strings ===");
        Queue<String> qs1 = new LinkedList<>();
        qs1.add("apple");
        qs1.add("cherry");
        qs1.add("grape");

        Queue<String> qs2 = new LinkedList<>();
        qs2.add("banana");
        qs2.add("date");
        qs2.add("fig");

        System.out.println("Cola 1: " + qs1);
        System.out.println("Cola 2: " + qs2);
        System.out.println("Merge:  " + merge(qs1, qs2));
    }
}
