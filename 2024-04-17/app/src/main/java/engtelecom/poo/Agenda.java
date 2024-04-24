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

    public boolean addPeople(Contato c){
        return contatos.add(c);
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

    public boolean removeEmail(String rotulo, Contato c){
        return c.removeEmail(rotulo);
    }

    public boolean addTelefone(String rotulo,String valor, Contato c){
        return c.adicionarTelefone(new Telefone(valor,rotulo));
    }

    public boolean updateTelefone(String rotulo, String valor, Contato c){
        return c.atualizarTelefone(rotulo,valor);
    }

    public boolean removeTelefone(String rotulo, Contato c){
        return c.removeTelefone(rotulo);
    }

    public void listarContatos(){
        int i = 0;
        for (int j = 0; j < contatos.size(); j++) {
            System.out.println(i + " : " + contatos.get(j).getNome() + " " + contatos.get(j).getSobrenome());
            i++;
        }
    }

    public void listarInteiro(){
        int i = 0;
        for (int j = 0; j < contatos.size(); j++) {
            System.out.println(i + " - " + contatos.get(j));
            i++;
        }
    }

}
