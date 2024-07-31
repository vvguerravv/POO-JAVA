package engtelecom.poo;

public enum DiaDaSemana {

    DOM(0,"Domingo"),
    SEG(1,"Segunda-Feira"),
    TER(2,"Terça-Feira"),
    QUA(3,"Quarta-Feira"),
    QUI(4,"Quinta-Feira"),
    SEX(5,"Sexta-Feira"),
    SAB(6,"Sábado");

    private int codigo;
    private String diaPorExtenso;

    DiaDaSemana(int codigo,String diaPorExtenso) {
        this.codigo = codigo;
        this.diaPorExtenso = diaPorExtenso.toUpperCase();
    }

    @Override
    public String toString() {
        return diaPorExtenso;
    }
}