package engtelecom.poo.animais.classes;

public class Pinguim extends Animais implements Terrestre,Aves,Nadador{
    public Pinguim(String name) {
        super(name);
    }

    @Override
    public String bicar() {
        return "Pinguim " + super.name + " bicando";
    }

    @Override
    public String botarOvo() {
        return "Pinguim " + super.name + " botando ovo";
    }

    @Override
    public String correr() {
        return "Pinguim " + super.name + " correndo";
    }

    @Override
    public String nadar() {
        return "Pinguim " + super.name + " nadando";
    }
}
