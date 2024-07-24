package engtelecom.poo.objetos.formas;

public abstract class Formas {

    protected String cor;



    public Formas(String cor){
        this.cor = cor;
    }

    public String desenhar(){
        return " ";
    }

    public double calculaPerimetro(){
        return 0;
    }

}
