package eng.telecom;

public class Carro {

    //Atributos
    private double speed;
    private String model;

    //Metodos
    public void acelerate(double v){
        speed +=v;
    }

    public void to_brake(double v){
        speed -=v;
    }

    public double getSpeed() {
        return speed;
    }
}
