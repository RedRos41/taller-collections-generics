package ejercicio08;

import java.util.Stack;

public class SplitStack {

    /**
     * Divide un stack en dos stacks: elementos en posiciones pares e impares.
     * Retorna un Pair con (stackPares, stackImpares).
     */
    public static <T> Pair<Stack<T>, Stack<T>> split(Stack<T> stack) {
        Stack<T> pares = new Stack<>();
        Stack<T> impares = new Stack<>();
        Stack<T> temp = new Stack<>();

        // Invertir para procesar en orden original
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }

        int index = 0;
        while (!temp.isEmpty()) {
            T elemento = temp.pop();
            if (index % 2 == 0) {
                pares.push(elemento);
            } else {
                impares.push(elemento);
            }
            index++;
        }

        return new Pair<>(pares, impares);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("Stack original: " + stack);

        Pair<Stack<Integer>, Stack<Integer>> resultado = split(stack);

        System.out.println("Posiciones pares:   " + resultado.getFirst());
        System.out.println("Posiciones impares: " + resultado.getSecond());

        System.out.println("\n=== Con Strings ===");
        Stack<String> stackStr = new Stack<>();
        stackStr.push("A");
        stackStr.push("B");
        stackStr.push("C");
        stackStr.push("D");
        stackStr.push("E");

        System.out.println("Stack original: " + stackStr);
        Pair<Stack<String>, Stack<String>> resStr = split(stackStr);
        System.out.println("Posiciones pares:   " + resStr.getFirst());
        System.out.println("Posiciones impares: " + resStr.getSecond());
    }
}
