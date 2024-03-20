package engtelecom.poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public Horario(int hora,int minuto){
        this(hora,minuto,0);
    }

    public Horario(int hora){
        this(hora,0,0);
    }

    public Horario(){
        this(0,0,0);
    }

    public int getHora() {
        return hora;
    }

    public boolean setHora(int hora) {
        if(hora >= 0 && hora < 23){
            this.hora = hora;
            return true;
        }
        return false;
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean setMinuto(int minuto) {
        if(minuto >= 0 && minuto < 60 ){
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    public int getSegundo() {

        return segundo;
    }

    public boolean setSegundo(int segundo) {
        if(segundo >= 0 && segundo < 60){
            this.segundo = segundo;
        }
        return false;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public String printHour(Horario h){
        
    }
}
