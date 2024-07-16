package engtelecom.poo;

public class App {

    public static void main(String[] args) {
        Termometro t1 = new Termometro(60, 1000, -100, 'C');
        Termometro t2 = new Termometro(46, 2120, -32, 'F');
        Termometro t3 = new Termometro(303.15, 3.15, 273.15, 'K');

        System.out.println(t1.informacoes('C'));
        System.out.println(t2.informacoes('C'));
        System.out.println(t3.informacoes('C'));

        System.out.println(t1.diferenca(t2, 'C'));
        System.out.println(t1.diferenca(t3, 'K'));
    }
}
