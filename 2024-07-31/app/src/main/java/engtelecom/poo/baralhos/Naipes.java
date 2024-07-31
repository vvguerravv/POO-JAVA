package engtelecom.poo.baralhos;

public enum Naipes {

    PAUS(0,"D"),
    COPAS(1,"B"),
    ESPADAS(2,"A"),
    OURO(3,"C");

    private int codigo;
    private String simbolo;

    Naipes(int codigo, String simbolo) {
        this.codigo = codigo;
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return  this.simbolo;
    }
}
