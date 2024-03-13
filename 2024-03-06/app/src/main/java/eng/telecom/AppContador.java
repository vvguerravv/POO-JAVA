package eng.telecom;

public class AppContador {

    public static void main(String[] args) {
        Contador count = new Contador();

        count.increment();
        System.out.println("Valor atual do contador:" + count.toGet());
        count.increment();
        System.out.println("Valor atual do contador:" + count.toGet());
        count.atribute(47);
        System.out.println("Valor atual do contador:" + count.toGet());
    }

}
