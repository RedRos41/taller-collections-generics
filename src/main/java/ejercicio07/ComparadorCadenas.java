package ejercicio07;

public class ComparadorCadenas implements Comparador<String> {

    @Override
    public int comparar(String a, String b) {
        return a.compareTo(b);
    }

    @Override
    public String mayor(String a, String b) {
        return comparar(a, b) >= 0 ? a : b;
    }
}
