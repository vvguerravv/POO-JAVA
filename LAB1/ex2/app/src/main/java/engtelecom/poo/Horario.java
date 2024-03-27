package engtelecom.poo;

public class Horario {

    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
        if(!setHora(hora) || !setMinuto(minuto) || !setSegundo(segundo)){
            this.hora = 0;this.minuto = 0;this.segundo = 0;
        }
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
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }

    public StringBuilder printHour(){
        String[] hora = {"zero", "uma", "duas", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] unidade = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] dezenas = { "dez","vinte", "trinta", "quarenta", "cinquenta"};
        String[] exclusivos = {"onze", "doze", "treze", "quatorze", "quinze"};
        int[] horario = {this.hora,this.minuto,this.segundo};
        StringBuilder palavraTotal = new StringBuilder();


        for(int i = 0; i < 3; i++){
            if(horario[i] >= 10){
                if(horario[i]>10 && horario[i]<16){
                    palavraTotal.append(exclusivos[(horario[i] % 10) - 1]);
                }

                if( horario[i] % 10 != 0){
                    palavraTotal.append(dezenas[(horario[i] / 10) - 1]).append(" e ");
                    palavraTotal.append(unidade[horario[i] % 10]);
                } else{
                    palavraTotal.append(dezenas[(horario[i] / 10) - 1]);
                }
            }

            if(horario[i] < 10){
                palavraTotal.append(unidade[horario[i] % 10]);
            }


            if(i == 0){
                palavraTotal.append(" horas, ");
            }
            if(i == 1){
                palavraTotal.append(" minutos e ");
            }
            if(i == 2){
                palavraTotal.append("  segundos" );
            }
        }
        return palavraTotal;
    }

    public long seconds(){
        long tot = 0;
        tot+= this.hora * 3600L;
        tot+= this.minuto * 60L;
        tot+= this.segundo;
        return tot;
    }

    public long diference(Horario h){
        long diference;
        diference = this.seconds() - h.seconds();
        if(diference < 0){
            diference *= -1;
        }
        return diference;
    }
}