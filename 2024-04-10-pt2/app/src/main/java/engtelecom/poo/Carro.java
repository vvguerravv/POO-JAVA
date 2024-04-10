package engtelecom.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class Carro {

    private String cor;
    private Motor motor;

    public Carro(String cor, Motor motor) {
        this.cor = cor;
        this.motor = motor;
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
