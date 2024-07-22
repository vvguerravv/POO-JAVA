package engtelecom.poo.javaOfEmpires;

public class Caveleiro extends Personagem{

    private final static int HP = 50;
    private final static int ATQ = 3;
    private final static double VEL = 2;

    public Caveleiro(){
        super(HP, ATQ, VEL);
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacando!";
    }

    @Override
    public String mover() {
        return "Cavaleiro movendo-se!";
    }

}
