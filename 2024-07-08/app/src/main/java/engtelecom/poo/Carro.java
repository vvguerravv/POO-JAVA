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
        if(i >= 0 ){
            if(this.velocidadeAtual + i <= 120){
                this.velocidadeAtual+=i;
            }else{
                this.velocidadeAtual = 120;
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
        if(i > 0 && getVelocidadeAtual() > 0){
            this.velocidadeAtual-=i;
        }
        return this.velocidadeAtual;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
