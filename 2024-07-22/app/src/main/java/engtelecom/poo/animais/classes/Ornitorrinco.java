package engtelecom.poo.animais.classes;

public class Ornitorrinco extends Animais implements Mamiferos,Terrestre,Oviparos{

    public Ornitorrinco(String name) {
        super(name);
    }

    @Override
    public String morder() {
        return "Ornitorrinco " + super.name + " mordendo";
    }

    @Override
    public String botarOvo() {
        return "Ornitorrinco " + super.name + " botando ovo";
    }

    @Override
    public String correr() {
        return "Ornitorrinco " + super.name + " correndo";
    }

}
