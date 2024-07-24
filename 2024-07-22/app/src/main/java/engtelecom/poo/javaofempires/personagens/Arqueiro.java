package engtelecom.poo.javaofempires.personagens;

public class Arqueiro extends Personagem implements Guerreiro{

    private final static int HP = 35;
    private final static int ATQ = 2;
    private final static double VEL = 1;

    public Arqueiro() {
        super(HP, ATQ, VEL);
    }

    @Override
    public String atacar() {
        return "Arqueiro atacando!";
    }

    @Override
    public String mover() {
        return "Arqueiro movendo-se!";
    }


}
