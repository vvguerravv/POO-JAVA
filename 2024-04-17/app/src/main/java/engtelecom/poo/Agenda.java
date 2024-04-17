package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;


    public Agenda(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public void addPeople(Contato c){
        contatos.add(c);
    }

    public void removePeople(Contato c){
        contatos.remove(c);
    }

    public void update( ){
    }
}
