package engtelecom.poo.animais.classes;

public class Macaco extends Animais implements Terrestre,Mamiferos{
    public Macaco(String name) {
        super(name);
    }

    @Override
    public String morder() {
        return "Macaco " + super.name + " mordendo";
    }

    @Override
    public String correr() {
        return "Macaco " + super.name + " correndo";
    }
}
