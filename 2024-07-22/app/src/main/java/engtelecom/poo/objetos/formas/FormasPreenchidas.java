package engtelecom.poo.objetos.formas;

public abstract class FormasPreenchidas extends Formas{

    protected String corPreenchimento;

    public FormasPreenchidas(String cor,String corPreenchimento) {
        super(cor);
        this.corPreenchimento = corPreenchimento;
    }

    public double calculaArea(){
        return 0;
    }

}
