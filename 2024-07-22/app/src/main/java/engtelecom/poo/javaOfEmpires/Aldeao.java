package engtelecom.poo.javaOfEmpires;



public class Aldeao extends Personagem{

    private final static int HP = 25;
    private final static int ATQ = 1;
    private final static double VEL = 0.8;


    public Aldeao() {
        super(HP, ATQ, VEL);
    }


    @Override
    public String atacar() {
        return "Aldeão atacando!";
    }

    @Override
    public String mover() {
        return "Cavaleiro se movendo!";
    }
}
