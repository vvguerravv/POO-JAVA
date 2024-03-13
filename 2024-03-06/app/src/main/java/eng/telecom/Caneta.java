package eng.telecom;

public class Caneta {

    //Atributos
    private boolean aberta;
    private int tinta;
    private String cor;

//    Método construtor
    public Caneta(int n, String c) {
        tinta = 100;
        this.setTinta(n);
        cor = c;
        aberta = false;

    }

    public Caneta(int n){
        this(n,"preta");
    }

    public Caneta(String c) {
        this(100,c);
    }

    public Caneta(){
        this("preta");
    }

    //Métodos
    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public int getTinta() {
        return tinta;
    }

    public void setTinta(int tinta) {
        if((tinta >= 0) && (tinta <=100)){
            this.tinta = tinta;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void abrirFecharCaneta(){
        aberta = !aberta;
    }

    public void desenhar(){
        if((aberta) && (tinta > 0)){
            System.out.println("Desenhando na cor " + cor);
            tinta--;
        }
    }


}
