package engtelecom.poo.javaofempires.personagens;



public class Aldeao extends Personagem implements Coletador,Guerreiro{

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
        return "Aldeão se movendo!";
    }

    @Override
    public String coletarMadeira() {
        return "Coletando madeira";
    }

    @Override
    public String coletarOuro() {
        return "Coletando ouro";
    }
}
