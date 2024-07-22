package engtelecom.poo.javaOfEmpires;

public class Personagem {

    protected int hp;
    protected int nivelAtaque;
    protected double velocidade;

    public Personagem(int hp, int nivelAtaque, double velocidade) {
        this.hp = hp;
        this.nivelAtaque = nivelAtaque;
        this.velocidade = velocidade;
    }

    public String atacar(){
        return  " ";
    }

    public String mover(){
        return " ";
    }


}
