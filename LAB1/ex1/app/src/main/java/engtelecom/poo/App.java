package engtelecom.poo;

public class App {

    public static void main(String[] args) {

        Ponto a = new Ponto(3.5,1.1);
        Ponto b = new Ponto(2.5,7.9);

        System.out.println(b.toString());

        System.out.println(a.distance(b));

        b.setX(15);
        System.out.println(a.distance(b));
    }
}
