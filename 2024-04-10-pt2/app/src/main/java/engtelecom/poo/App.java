/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package engtelecom.poo;

import java.util.ArrayList;

public class App {
    private Carro carros;


    public App(Carro carros) {
        this.carros = carros;
    }

    public static void main(String[] args) {

        Carro McLaren = new Carro("Laranja",new Motor("Pegeout",100));
        System.out.println(McLaren);

        McLaren.setMotor(new Motor("McLaren",1000));
        System.out.println(McLaren);

    }
}