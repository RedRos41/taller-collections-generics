package ejercicio05;

import java.util.Stack;

public class SpliceStack {

    /**
     * Toma dos stacks y los intercala (splice) en un solo stack resultante.
     * Alterna elementos: uno del stack1, uno del stack2.
     * Los elementos restantes del stack más grande se agregan al final.
     */
    public static <T> Stack<T> splice(Stack<T> stack1, Stack<T> stack2) {
        Stack<T> resultado = new Stack<>();
        Stack<T> temp1 = new Stack<>();
        Stack<T> temp2 = new Stack<>();

        // Invertir para mantener el orden original
        while (!stack1.isEmpty()) {
            temp1.push(stack1.pop());
        }
        while (!stack2.isEmpty()) {
            temp2.push(stack2.pop());
        }

        // Intercalar
        while (!temp1.isEmpty() && !temp2.isEmpty()) {
            resultado.push(temp1.pop());
            resultado.push(temp2.pop());
        }

        // Agregar restantes
        while (!temp1.isEmpty()) {
            resultado.push(temp1.pop());
        }
        while (!temp2.isEmpty()) {
            resultado.push(temp2.pop());
        }

        return resultado;
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(3);
        stack1.push(5);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(2);
        stack2.push(4);
        stack2.push(6);
        stack2.push(8);

        System.out.println("Stack 1: " + stack1);
        System.out.println("Stack 2: " + stack2);

        Stack<Integer> resultado = splice(stack1, stack2);
        System.out.println("Splice:  " + resultado);

        System.out.println("\n=== Con Strings ===");
        Stack<String> sa = new Stack<>();
        sa.push("A");
        sa.push("C");
        sa.push("E");

        Stack<String> sb = new Stack<>();
        sb.push("B");
        sb.push("D");

        System.out.println("Stack A: " + sa);
        System.out.println("Stack B: " + sb);
        System.out.println("Splice:  " + splice(sa, sb));
    }
}
