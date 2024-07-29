package engtelecom.poo.animais.classes;

public class Morcego extends Animais implements Voador,Mamiferos{
    public Morcego(String name) {
        super(name);
    }

    @Override
    public String morder() {
        return "Morcego " + super.name + " mordendo";
    }

    @Override
    public String voar() {
        return "Morcego " + super.name + " voando";
    }
}
