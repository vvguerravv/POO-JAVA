package engtelecom.poo.baralhos;

public class Carta {

    private Naipes naipe;
    private Valor valor;

    public Carta(Naipes naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\\" + "u" + "D" + "8" + "3" + "C" + "\\" + "u" + "D" + "C" + naipe + valor;
    }
}
