package eng.telecom;

public class Contador {

    //Atributo
    private int valorAtual;

    //Métodos
    public void increment(){
        valorAtual++;
    }

    public void atribute(int x){
        valorAtual = x;
    }

    public int toGet(){
        return valorAtual;
    }
}
