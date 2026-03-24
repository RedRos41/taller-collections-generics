package ejercicio10;

public class Moto extends Vehiculo {
    private static final double TARIFA_DIARIA = 25000;

    public Moto(String placa, String marca, int año) {
        super(placa, marca, año);
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        return TARIFA_DIARIA * dias;
    }
}
