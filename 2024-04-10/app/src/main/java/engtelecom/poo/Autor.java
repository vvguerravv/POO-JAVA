package engtelecom.poo;

import org.checkerframework.checker.units.qual.A;

import java.time.LocalDate;

public class Autor {

    private String nome;
    private String nacionalidade;
    private LocalDate dataNascimento;

    public Autor(String nome, String nacionalidade, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
