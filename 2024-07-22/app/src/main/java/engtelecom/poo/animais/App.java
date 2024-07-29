package engtelecom.poo.animais;

import engtelecom.poo.animais.classes.*;
import engtelecom.poo.animais.classes.Arara;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Animais> animais = new ArrayList<>();

        animais.add(new Arara("Blue"));
        animais.add(new Avestruz("Claudio"));
        animais.add(new Baleia("Oto"));
        animais.add(new Cachorro("Juca"));
        animais.add(new Macaco("Cesar"));
        animais.add(new Ornitorrinco("Perry"));
        animais.add(new Gato("Lupe"));
        animais.add(new Morcego("Julio"));
        animais.add(new Leao("Mufasa"));
        animais.add(new Pinguim("Juca"));

        for(Animais animais1: animais){
            if(animais1 instanceof Aves){
                System.out.println(((Aves)animais1).bicar());
            } if(animais1  instanceof Oviparos){
                System.out.println(((Oviparos)animais1).botarOvo());
            } if (animais1 instanceof Mamiferos) {
                System.out.println(((Mamiferos)animais1).morder());
            } if (animais1 instanceof Nadador) {
                System.out.println(((((Nadador) animais1).nadar())));
            } if (animais1 instanceof Terrestre){
                System.out.println(((Terrestre)animais1).correr());
            }if (animais1 instanceof Voador){
                System.out.println(((Voador)animais1).voar());
            }
        }

    }

}
