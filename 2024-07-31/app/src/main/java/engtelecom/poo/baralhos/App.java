package engtelecom.poo.baralhos;

import java.util.*;


public class App {

    public static void main(String[] args) {

        ArrayList<Carta> baralho = new ArrayList<>();

        for(Valor a : Valor.values()){
            for(Naipes b : Naipes.values()){
                baralho.add(new Carta(b,a));
            }
        }

        baralho.forEach(System.out::print);
        Collections.shuffle(baralho);
        System.out.println();
        baralho.forEach(System.out::print);



    }

}
