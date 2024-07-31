package engtelecom.poo;

import java.util.Arrays;

public class Disciplina {

    private final String sigla;
    private DiaDaSemana[] dias;

    public Disciplina(String sigla, DiaDaSemana[] dias) {
        this.sigla = sigla;
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "A disciplina de " + this.sigla + " ocorre nos dias " + this.dias + " da semana!";
    }


}
