package ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class SistemaAlquiler<T extends Vehiculo> {
    private List<T> vehiculos;

    public SistemaAlquiler() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(T vehiculo) {
        vehiculos.add(vehiculo);
    }

    public List<T> listarDisponibles() {
        List<T> disponibles = new ArrayList<>();
        for (T v : vehiculos) {
            if (!v.isAlquilado()) {
                disponibles.add(v);
            }
        }
        return disponibles;
    }

    public boolean alquilar(String placa) {
        for (T v : vehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa) && !v.isAlquilado()) {
                v.alquilar();
                return true;
            }
        }
        return false;
    }

    public boolean devolver(String placa) {
        for (T v : vehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa) && v.isAlquilado()) {
                v.devolver();
                return true;
            }
        }
        return false;
    }

    public void mostrarTodos() {
        for (T v : vehiculos) {
            System.out.println("  " + v);
        }
    }

    public static void main(String[] args) {
        SistemaAlquiler<Vehiculo> sistema = new SistemaAlquiler<>();

        sistema.agregarVehiculo(new Auto("ABC-123", "Toyota", 2022));
        sistema.agregarVehiculo(new Auto("DEF-456", "Honda", 2023));
        sistema.agregarVehiculo(new Moto("GHI-789", "Yamaha", 2021));
        sistema.agregarVehiculo(new Camion("JKL-012", "Volvo", 2020));

        System.out.println("=== Todos los vehículos ===");
        sistema.mostrarTodos();

        System.out.println("\n--- Alquilando ABC-123 ---");
        sistema.alquilar("ABC-123");

        System.out.println("\n=== Vehículos disponibles ===");
        for (Vehiculo v : sistema.listarDisponibles()) {
            System.out.println("  " + v);
        }

        System.out.println("\n--- Costo de alquilar ABC-123 por 5 días ---");
        Auto auto = new Auto("ABC-123", "Toyota", 2022);
        System.out.println("$" + auto.calcularCostoAlquiler(5));

        System.out.println("\n--- Devolviendo ABC-123 ---");
        sistema.devolver("ABC-123");

        System.out.println("\n=== Estado final ===");
        sistema.mostrarTodos();
    }
}
