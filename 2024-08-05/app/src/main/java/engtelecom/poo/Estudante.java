package engtelecom.poo;

public class Estudante extends Pessoa {

    private String matricula;

    public Estudante(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudante{" + super.toString() +
                " , matricula='" + matricula + '\'' +
                '}';
    }
}
