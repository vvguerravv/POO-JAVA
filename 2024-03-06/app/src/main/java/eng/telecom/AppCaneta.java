package eng.telecom;

public class AppCaneta {
    public static void main(String[] args) {

        Caneta bic = new Caneta(90,"vermelho");
        Caneta pilot = new Caneta("azul");
        Caneta stabilo = new Caneta();

        bic.setTinta(-10);
        System.out.println(bic.getTinta());


    }
}
