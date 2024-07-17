package engtelecom.poo.produtos;

import engtelecom.poo.Dimensoes;
import engtelecom.poo.produtos.Telefone;

public class SemFio extends Telefone {
    /**
     * Irá indicar a frequêncvia de operação do telefone
     */
    private double frequencia;

    /**
     * Irá reprensetar o número de canais do telefone
     */
    private int canais;

    /**
     * Irá representar a distância de operação do produto
     */
    private double distanciaOperacao;

    public SemFio(int codigo, String numeroSerie, String modelo, String cor, double peso, Dimensoes dimensoes, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numeroSerie, modelo, cor, peso, dimensoes);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    @Override
    public String imprimirDados(){

        return super.imprimirDados() + "Freq: " + this.frequencia + "|| Canais: " + this.canais + " || Distaância de operação: " + this.distanciaOperacao;
    }
}
