package engtelecom.poo.sistemasolar;

public enum Planetas {

    MERCURIO(0),
    VENUS(1),
    TERRA(2),
    MARTE(3),
    JUPITER(4),
    SATURNO(5),
    URANO(6),
    NETUNO(7);

    private int posicaoRelSol;

    Planetas(int posicaoRelSol) {
        this.posicaoRelSol = posicaoRelSol;
    }
}
