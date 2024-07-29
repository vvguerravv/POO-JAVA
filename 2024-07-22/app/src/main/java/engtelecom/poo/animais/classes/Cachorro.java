package engtelecom.poo.animais.classes;

public class Cachorro extends Animais implements Mamiferos,Terrestre{
    public Cachorro(String name) {
        super(name);
    }

    @Override
    public String morder() {
        return "Cachorro " + super.name + " mordendedo";
    }

    @Override
    public String correr() {
        return "Cachorro " + super.name + " correndo";
    }
}
