package engtelecom.poo;

public class Motor {

    private double potencia;
    private String marca;

    public Motor(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", marca='" + marca + '\'' +
                '}';
    }
}
