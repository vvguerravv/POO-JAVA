package engtelecom.poo.animais.classes;

public class Leao extends Animais implements Terrestre,Mamiferos{
    public Leao(String name) {
        super(name);
    }

    @Override
    public String morder() {
        return "Leao " + super.name + " mordendo";
    }

    @Override
    public String correr() {
        return "Leao " + super.name + " correndo";
    }
}
