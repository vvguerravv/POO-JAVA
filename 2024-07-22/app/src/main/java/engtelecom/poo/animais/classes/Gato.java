package engtelecom.poo.animais.classes;

public class Gato extends Animais implements Terrestre,Mamiferos{

    public Gato(String name) {
        super(name);
    }

    @Override
    public String morder() {
        return "Gato " + super.name + " mordendo!";
    }

    @Override
    public String correr() {
        return "Gato " + super.name + " correndo!";
    }
}
