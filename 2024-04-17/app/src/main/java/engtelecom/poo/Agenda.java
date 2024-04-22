package engtelecom.poo;

import java.util.ArrayList;
import java.util.Objects;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda(){
        this.contatos = new ArrayList<>();
    }

    public Contato getContatos(int i) {
        return contatos.get(i);
    }

    public void addPeople(Contato c){
        contatos.add(c);
    }

    public boolean removePeople(int i){
        return contatos.remove(contatos.get(i));
    }

    public boolean addEmail(String rotulo, String valor,Contato c){
        return c.adicionarEmail(new Email(valor, rotulo));
    }

    public boolean updateEmail(String rotulo, String valor, Contato c){
        return c.atualizarEmail(rotulo, valor);
    }

    public boolean removeEmail(String nome, String sobrenome){
        return removeEmail(nome,sobrenome);
    }

    public void listarContatos(){
        int i = 0;
        for (int j = 0; j < contatos.size(); j++) {
            System.out.println(i + " - " + contatos.get(j));
            i++;
        }
    }

    public void update( ){
    }
}
