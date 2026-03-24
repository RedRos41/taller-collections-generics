package ejercicio10;

public class Camion extends Vehiculo {
    private static final double TARIFA_DIARIA = 120000;

    public Camion(String placa, String marca, int año) {
        super(placa, marca, año);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return TARIFA_DIARIA * dias;
    }
}
