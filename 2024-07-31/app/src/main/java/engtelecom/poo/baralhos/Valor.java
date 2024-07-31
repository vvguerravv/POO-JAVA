package engtelecom.poo.baralhos;

public enum Valor {

    AS("1",1),
    DOIS("2",2),
    TRES("3",3),
    QUATRO("4",4),
    CINCO("5",5),
    SEIS("6",6),
    SETE("7",7),
    OITO("8",8),
    NOVE("9",9),
    DEZ("A",10),
    VALETE("B",11),
    DAMA("D",12),
    REI("E",13);

    private String valor;
    private int num;

    Valor(String valor,int num){
        this.valor = valor;
        this.num = num;
    }

    @Override
    public String toString() {
        return valor;
    }
}
