package ejercicio07;

public class ComparadorGenericoNatural<T extends Comparable<T>> implements Comparador<T> {

    @Override
    public int comparar(T a, T b) {
        return a.compareTo(b);
    }

    @Override
    public T mayor(T a, T b) {
        return comparar(a, b) >= 0 ? a : b;
    }
}
