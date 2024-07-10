package engtelecom.poo;

/**
 * Representa um carro em um jogo de corrida
 *
 * @author Victor Guerra
 */
public class Carro {

    /**
     * Velocidade atual do carro
     */
    private int velocidadeAtual;

    private static final int VELOCIDADE_MAXIMA = 120;
    private static final int VELOCIDADE_MINIMA = 0;

    /**
     * Cria um carro com velocidade inicial 0
     */
    public Carro(){
        this.velocidadeAtual = 0;
    }


    /**
     * Incrementa a velocidade do carro de acordo com o parâmetro
     * @param i incremento da velecidade
     * @return nova velocidade do carro
     */
    public int acelerar(int i){
        if(i > 0 ){
            if(this.velocidadeAtual + i <= VELOCIDADE_MAXIMA){
                this.velocidadeAtual+=i;
            }else{
                this.velocidadeAtual = VELOCIDADE_MAXIMA;
            }
        }
        return this.velocidadeAtual;
    }

    /**
     * Reduz a velocidade do corro de acordo com o parâmetro
     * @param i decrementa a velocidade do carro
     * @return nova velocidade do carro
     */
    public int frear(int i){
        if(i > VELOCIDADE_MINIMA && getVelocidadeAtual() > VELOCIDADE_MINIMA){
            if(this.velocidadeAtual-i < VELOCIDADE_MINIMA){
                this.velocidadeAtual = VELOCIDADE_MINIMA;
            }else{
                this.velocidadeAtual-=i;
            }
        }
        return this.velocidadeAtual;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
