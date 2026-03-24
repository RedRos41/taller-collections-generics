package ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class PairList<K, V> {
    private List<K> keys;
    private List<V> values;

    public PairList() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void add(K key, V value) {
        keys.add(key);
        values.add(value);
    }

    public V getValue(K key) {
        int index = keys.indexOf(key);
        if (index >= 0) {
            return values.get(index);
        }
        return null;
    }

    public K getKey(int index) {
        return keys.get(index);
    }

    public int size() {
        return keys.size();
    }

    public boolean containsKey(K key) {
        return keys.contains(key);
    }

    public void remove(K key) {
        int index = keys.indexOf(key);
        if (index >= 0) {
            keys.remove(index);
            values.remove(index);
        }
    }

    public void mostrar() {
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " -> " + values.get(i));
        }
    }
}
