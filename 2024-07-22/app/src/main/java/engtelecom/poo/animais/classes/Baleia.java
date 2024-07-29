package engtelecom.poo.animais.classes;

public class Baleia extends Animais implements Mamiferos,Nadador{

    public Baleia(String nome){
        super(nome);
    }

    @Override
    public String morder() {
        return "Baleia " + super.name + " mordendo";
    }

    @Override
    public String nadar() {
        return "Baleia " + super.name + " nadando";
    }
}
