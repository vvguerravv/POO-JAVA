package eng.telecom;

/**
 * Carro não pode passar de 200 km/h e nem pode ser menor que 0
 */
public class Carro {

//    Atributos
    private double speed;
    private String model;
    private final double VELOCIDADE_MAX;

//        Método construtor

    public Carro(String mod,double v,double vmax){
        this.VELOCIDADE_MAX = vmax;
        speed = 0;
        this.setSpeed(v);
        model = mod;
    }

    public Carro(double vmax,double v){
        this("Sonata",v,vmax);
    }

    public Carro(double v){
        this("Sonata",v,200);
    }

    public Carro(String mod){
        this(mod,0,200);
    }

    public Carro(){
        this("Sonata",0,200);
    }

//    Metodos

    public void setSpeed(double n){
        if((n <= VELOCIDADE_MAX) && (n >= 0)){
            this.speed = n;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void acelerate(double speed) {
        if(this.speed + speed <= VELOCIDADE_MAX){
            this.speed += speed;
        } else {
            this.speed = VELOCIDADE_MAX;
        }
    }

    public void slowDown(double speed){
        if(this.speed - speed >= 0){
            this.speed -= speed;
        } else {
            this.speed = 0;
        }
    }

    public String getModel() {
        return model;
    }

    public static String aceleracao(){
        return "9,8 m/s*s";
    }
}
