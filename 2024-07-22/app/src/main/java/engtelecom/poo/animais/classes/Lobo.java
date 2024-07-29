package engtelecom.poo.animais.classes;

public class Lobo extends Animais implements Mamiferos,Terrestre{
    public Lobo(String name) {
        super(name);
    }

    @Override
    public String morder() {
        return "Lobo " + super.name + " mordendo";
    }

    @Override
    public String correr() {
        return "Lobo " + super.name + " correndo";
    }
}
