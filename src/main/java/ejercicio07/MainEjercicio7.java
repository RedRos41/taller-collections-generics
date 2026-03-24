package ejercicio07;

public class MainEjercicio7 {
    public static void main(String[] args) {
        System.out.println("=== ComparadorNumeros ===");
        ComparadorNumeros compNum = new ComparadorNumeros();
        System.out.println("Comparar 10 y 20: " + compNum.comparar(10, 20));
        System.out.println("Mayor entre 10 y 20: " + compNum.mayor(10, 20));
        System.out.println("Mayor entre 3.14 y 2.71: " + compNum.mayor(3.14, 2.71));

        System.out.println("\n=== ComparadorCadenas ===");
        ComparadorCadenas compStr = new ComparadorCadenas();
        System.out.println("Comparar 'banana' y 'manzana': " + compStr.comparar("banana", "manzana"));
        System.out.println("Mayor entre 'banana' y 'manzana': " + compStr.mayor("banana", "manzana"));

        System.out.println("\n=== ComparadorGenericoNatural<Integer> ===");
        ComparadorGenericoNatural<Integer> compGenInt = new ComparadorGenericoNatural<>();
        System.out.println("Mayor entre 42 y 17: " + compGenInt.mayor(42, 17));

        System.out.println("\n=== ComparadorGenericoNatural<String> ===");
        ComparadorGenericoNatural<String> compGenStr = new ComparadorGenericoNatural<>();
        System.out.println("Mayor entre 'alpha' y 'omega': " + compGenStr.mayor("alpha", "omega"));
    }
}
