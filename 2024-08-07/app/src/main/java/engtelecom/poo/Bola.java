package engtelecom.poo;

import java.util.Objects;

public class Bola {

    private String tipo;
    private String cor;
    private double tamanho;
    private double peso;

    public Bola(String tipo, double tamanho, String cor, double peso) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.cor = cor;
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bola bola = (Bola) o;
        return Double.compare(tamanho, bola.tamanho) == 0 && Double.compare(peso, bola.peso) == 0 && Objects.equals(tipo, bola.tipo) && Objects.equals(cor, bola.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, cor, tamanho, peso);
    }
}
