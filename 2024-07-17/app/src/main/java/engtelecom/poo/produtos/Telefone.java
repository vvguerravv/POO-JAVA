package engtelecom.poo.produtos;

import engtelecom.poo.Dimensoes;

public class Telefone {

    /**
     * Será o código do telefone
     */
    protected int codigo;

    /**
     * Será o número de série do telefone
     */
    protected String numeroSerie;

    /**
     * Irá indicar o modelo do telefone
     */
    protected String modelo;

    /**
     * Irá indicar a cor do telefon
     */
    protected String cor;

    /**
     * Irá indicar o peso do telefone
     */
    protected double peso;

    /**
     * Irá representar as dimensões do telefone
     */
    protected Dimensoes dimensoes;

    /**
     * Método construtor de um telefone
     * @param codigo
     * @param numeroSerie
     * @param modelo
     * @param cor
     * @param peso
     * @param dimensoes
     */
    public Telefone(int codigo, String numeroSerie, String modelo, String cor, double peso, Dimensoes dimensoes) {
        this.codigo = codigo;
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.cor = cor;
        this.peso = peso;
        this.dimensoes = dimensoes;
    }

    /**
     * Irá retornar todos os dados do telefone
     * @return String
     */
    public String imprimirDados(){
        return "Código do telefone: " + this.codigo + " || N° de série do telefone: " + this.numeroSerie + " || Modelo do telefone: " + this.modelo + " || Cor do telefone: " + this.cor + " || Peso do telefone - " + this.peso + " || Dimensões do telefone: " + this.dimensoes;
    }


}
