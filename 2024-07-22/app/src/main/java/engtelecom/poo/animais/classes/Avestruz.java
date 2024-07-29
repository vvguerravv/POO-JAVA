package engtelecom.poo.animais.classes;

public class Avestruz extends Animais implements Aves,Terrestre{

    public Avestruz(String name) {
        super(name);
    }


    @Override
    public String bicar() {
        return "Avestruz " + super.name +  " bicando";
    }

    @Override
    public String correr(){
        return "Avestruz " + super.name + " correndo";
    }


    @Override
    public String botarOvo() {
        return "Avestruz " + super.name + " botando ovo";

    }
}
