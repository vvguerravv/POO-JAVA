package eng.telecom;


/**
 * Representar uma pessoa em um sistema de informação de cadastro de comércio
 */
public class Pessoa {

    //Atributos

    private String cpf;
    private String address;
    private String telephone;
    private String sex;
    private String name;
    private String email;
    private String birthday;

    //Métodos


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf  +
                "\nEndereço: " + address +
                "\nTelefone:" + telephone +
                "\nSexo:" + sex +
                "\nNome: " + name +
                "\nEmail: " + email +
                "\nData de nascimento: " + birthday;
    }
}
