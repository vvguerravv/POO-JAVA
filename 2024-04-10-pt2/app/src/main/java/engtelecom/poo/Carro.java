package engtelecom.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class Carro {

    private String cor;
    private Motor motor;
    private String modelo;

    public Carro(String cor, Motor motor,String modelo) {
        this.cor = cor;
        this.motor = motor;
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", motor=" + motor +
                '}';
    }
}
