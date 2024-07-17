package engtelecom.poo;

public class Dimensoes {

    /**
     * Irá representar a altura de algo
     */
    private double altura;
    /**
     * Irá representar a largura de algo
     */
    private double largura;

    /**
     * Irá representar a profundidade de algo
     */
    private double profundidade;

    public Dimensoes(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Altura: " + this.altura + " - Largura: " + this.largura + " - Profundidade: " + this.profundidade;
    }
}
