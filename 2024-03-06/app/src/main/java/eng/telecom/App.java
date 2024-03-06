package eng.telecom;

public class App {

    public static void main(String[] args) {

        Carro c = new Carro();
        Carro d = new Carro();

        System.out.println("Velocidade c: " + c.getSpeed());
        c.acelerate(10);
        System.out.println("Velocidade c: " + c.getSpeed());
        System.out.println("Velocidade d: " + d.getSpeed());


        Contador count = new Contador();

        count.increment();
        System.out.println("Valor atual do contador:" + count.toGet());
        count.increment();
        System.out.println("Valor atual do contador:" + count.toGet());
        count.atribute(47);
        System.out.println("Valor atual do contador:" + count.toGet());

    }
}
