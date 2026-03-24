package ejercicio07;

public class ComparadorNumeros implements Comparador<Number> {

    @Override
    public int comparar(Number a, Number b) {
        return Double.compare(a.doubleValue(), b.doubleValue());
    }

    @Override
    public Number mayor(Number a, Number b) {
        return comparar(a, b) >= 0 ? a : b;
    }
}
