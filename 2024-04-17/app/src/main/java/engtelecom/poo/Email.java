package engtelecom.poo;

public class Email {

    private String valor;
    private String rotulo;

    public Email(String valor, String rotulo) {
        this.valor = setValor(valor);
        this.rotulo = rotulo;
    }

    public String getValor() {
        return valor;
    }

    public String setValor(String valor) {
        String eR = "^[\\w−\\+]+(\\.[\\w]+)∗@[\\w−]+(\\.[\\w]+)∗(\\.[a−z]{2,})$";
        if(valor.matches(eR)){
            this.valor = valor;
            return valor;
        }
        return null;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }




    @Override
    public String toString() {
        return "Email{" +
                "valor='" + valor + '\'' +
                ", rotulo='" + rotulo + '\'' +
                '}';
    }
}
