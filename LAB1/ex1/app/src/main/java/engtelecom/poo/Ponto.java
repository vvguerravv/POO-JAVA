package engtelecom.poo;
import java.lang.Math;

public class Ponto {

    private double x;
    private double y;

    public Ponto(double n, double m) {
        x = n;
        y = m;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(Ponto p){
        return Math.sqrt(Math.pow(this.x + p.x,2) + Math.pow(this.y + p.y,2));
    }
}
