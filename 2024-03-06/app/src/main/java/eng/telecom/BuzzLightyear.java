package eng.telecom;

import java.util.Random;

public class BuzzLightyear {

    //Atributos
    private boolean helmetOpen;
    private boolean wingOpen;
    private String[] phrase = {"Ao infinito... e além!", "Missão de resgate em andamento. Prontos para decolar!","Nunca subestime o poder do pensamento positivo, parceiro!","Guarda-roupas? Isso não é um guarda-roupas, é uma nave de combate!","Estamos em patrulha, protegendo o quarto dos humanos contra qualquer ameaça do espaço sideral!","Estamos em patrulha, protegendo o quarto dos humanos contra qualquer ameaça do espaço sideral!"};

    //Métodos

    public void openCloseHelmet(){
       helmetOpen = !helmetOpen;
    }

    public void openCloseWing(){
        wingOpen = !wingOpen;
    }

    public String laserActive(){
        return "Disparando Laser!";
    }

    public String beating(){
        return "Golpeando!";
    }

    public String speakBuzz (){
        Random r = new Random();
        return phrase[r.nextInt(6)];
    }

}
