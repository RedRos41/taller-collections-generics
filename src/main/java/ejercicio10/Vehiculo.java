package ejercicio10;

public abstract class Vehiculo {
    private String placa;
    private String marca;
    private int año;
    private boolean alquilado;

    public Vehiculo(String placa, String marca, int año) {
        this.placa = placa;
        this.marca = marca;
        this.año = año;
        this.alquilado = false;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void alquilar() {
        this.alquilado = true;
    }

    public void devolver() {
        this.alquilado = false;
    }

    public abstract double calcularCostoAlquiler(int dias);

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + placa + "] " + marca +
               " (" + año + ") - " + (alquilado ? "Alquilado" : "Disponible");
    }
}
