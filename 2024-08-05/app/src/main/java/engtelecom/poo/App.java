package engtelecom.poo;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws InterruptedException {

    Pessoa pessoa = new Pessoa("Guerra");
    Estudante estudante = new Estudante("Guerra","18748/02");
    Carro carro = new Carro("FOX");

    Caixa<Estudante> estudanteCaixa = new Caixa<>();
    estudanteCaixa.setConteudo(estudante);
    System.out.println(estudanteCaixa.getConteudo());

//    Caixa<Carro> caixa = new Caixa<>();
//    caixa.setConteudo(carro);

//    Caixa caixa = new Caixa();
//
//
//
//    caixa.setConteudo(estudante);
//    System.out.println(caixa.getConteudo());
//
//    caixa.setConteudo(carro);
//    System.out.println(caixa.getConteudo());
//
//    caixa.setConteudo(pessoa);
//    System.out.println(caixa.getConteudo());
//
//    Carro outro = (Carro) caixa.getConteudo();
//
//    System.out.println(outro);

    }
}
