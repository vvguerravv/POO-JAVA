package engtelecom.poo;

public class Telefone {

    private String valor;
    private String rotulo;


    public Telefone(String valor, String rotulo) {
        this.valor = valor;
        this.rotulo = rotulo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "valor='" + valor + '\'' +
                ", rotulo='" + rotulo + '\'' +
                '}';
    }

}
