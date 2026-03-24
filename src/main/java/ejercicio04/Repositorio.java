package ejercicio04;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
    private List<T> elementos;

    public Repositorio() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T obtener(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice);
        }
        return null;
    }

    public boolean eliminar(T elemento) {
        return elementos.remove(elemento);
    }

    public List<T> listar() {
        return new ArrayList<>(elementos);
    }

    public int tamaño() {
        return elementos.size();
    }

    public boolean contiene(T elemento) {
        return elementos.contains(elemento);
    }

    public void mostrar() {
        for (int i = 0; i < elementos.size(); i++) {
            System.out.println("[" + i + "] " + elementos.get(i));
        }
    }
}
