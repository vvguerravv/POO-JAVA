package engtelecom.poo;

import com.sun.source.tree.BreakTree;

import java.util.Objects;

public class Retangulo {

    private int largura;
    private int altura;
    private String codificacao;

    private static final int LARGURA_PADRAO = 4;
    private static final int ALTURA_PADRAO = 3;
    private static final String CODIFICACAO_PADRAO = "ASCII";

    public Retangulo(int largura, int altura, String codificacao){
        setLargura(largura);
        setAltura(altura);
        setCodificacao(codificacao);

        if(!setLargura(largura) || !setAltura(altura)){
            this.largura = LARGURA_PADRAO; this.altura = ALTURA_PADRAO;
        }
        if(!setCodificacao(codificacao)){
            this.codificacao = CODIFICACAO_PADRAO;
        }
    }

    public Retangulo(){
        this(LARGURA_PADRAO,ALTURA_PADRAO,CODIFICACAO_PADRAO);
    }

    public int getLargura() {
        return largura;
    }

    public boolean  setLargura(int largura) {
        if(largura > 0){
            this.largura = largura;
            return true;
        }
        return false;
    }

    public int getAltura() {
        return altura;
    }

    public boolean setAltura(int altura) {
        if(altura > 0){
            this.altura = altura;
            return true;
        }
        return false;
    }

    public String getCodificacao() {
        return codificacao;
    }

    public boolean setCodificacao(String codificacao) {
        if(Objects.equals(codificacao, "UTF-8") || Objects.equals(codificacao,"ASCII")){
            this.codificacao = codificacao;
            return true;
        }
        return false;
    }

    public int area(){
        return this.altura * this.largura;
    }

    public int perimetro(){
        return 2*(this.largura + this.altura);
    }

    public String toString() {
        char altura = '|';
        char largura = '-';
        char cantos = '+';
        StringBuilder retangulo = new StringBuilder();

        for(int i = 0; i < this.altura;i++){
            if(i == 0 || i == this.altura - 1){
                retangulo.append(cantos);
            } else  {
                retangulo.append(altura);
            }

            for(int j = 0; j < this.largura-1;j++){
                if(j == this.largura - 2 && (i ==0 || i == this.altura - 1)){
                    retangulo.append(cantos);
                } else if(i == 0 || i == this.altura - 1){
                    retangulo.append(largura);
                } else {
                    if(j == this.largura - 2 ){
                        retangulo.append(altura);
                    } else{
                        retangulo.append(" ");
                    }
                }
            }
            retangulo.append("\n");
        }
        return String.valueOf(retangulo);
    }


}

