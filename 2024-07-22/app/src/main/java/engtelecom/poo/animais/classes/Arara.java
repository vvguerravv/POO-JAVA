package engtelecom.poo.animais.classes;

public class Arara extends Animais implements Voador,Aves {

    public Arara(String nome){
        super(nome);
    }

    @Override
    public String bicar() {
        return "Arara " + super.name + " bicando";
    }

    @Override
    public String voar() {
        return "Arara " + super.name + " voando";
    }

    @Override
    public String botarOvo() {
        return "Arara " + super.name + " botando ovo";
    }
}
