package ejercicio10;

public class Auto extends Vehiculo {
    private static final double TARIFA_DIARIA = 50000;

    public Auto(String placa, String marca, int año) {
        super(placa, marca, año);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return TARIFA_DIARIA * dias;
    }
}
