package engtelecom.poo;

import java.util.HashMap;

public class Contato {

    private String nome;
    private String sobrenome;
    private HashMap<String,Telefone> telefones;
    private HashMap<String,Email> emailHashMap;

    public Contato(String nome, String sobrenome, HashMap<String, Telefone> telefoneHashMap, HashMap<String, Email> emailHashMap) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefones = telefoneHashMap;
        this.emailHashMap = emailHashMap;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public HashMap<String, Telefone> getTelefones() {
        return telefones;
    }

    public boolean setTelefones(String rotulo, String valor) {
        if(telefones.containsKey(rotulo)){
            return false;
        }

        Telefone telefone = new Telefone(rotulo, valor);
        telefones.put(rotulo,telefone);
        return true;

    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public HashMap<String, Email> getEmailHashMap() {
        return emailHashMap;
    }

    public void setEmailHashMap(HashMap<String, Email> emailHashMap) {
        this.emailHashMap = emailHashMap;
    }

    public boolean addEmail(Email email){
        if(emailHashMap.containsKey(email.getRotulo())){
            return false;
        }
        emailHashMap.put(email.getRotulo(),email);
        return true;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", telefoneHashMap=" + telefones +
                ", emailHashMap=" + emailHashMap +
                '}';
    }
}
