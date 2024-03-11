package eng.telecom;

public class Caneta {

    //Atributos
    private boolean aberta;
    private int tinta;
    private String cor;

    //Métodos
    public void abrirFecharCaneta(){
        aberta = !aberta;
    }

    public void desenhar(){
        if((aberta) && (tinta > 0)){
            System.out.println("Desenhando na cor " + cor);
            tinta--;
        }
    }

    public void defineCor(String c){
        cor = c;
    }

    public void defineTinta(int n){
        tinta = n;
    }

}
