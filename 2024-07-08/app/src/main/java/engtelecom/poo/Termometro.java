package engtelecom.poo;

/**
 * Representa um termômetro, que contém a temperatura em Celsius, Fahrenheit ou Kelvin
 * 
 * @autor Victor Guerra
 */
public class Termometro {

    private double temperaturaAtual;
    private double maxTemp;
    private double minTemp;
    private char escala;

    public Termometro(double temperaturaAtual, double maxTemp, double minTemp, char escala) {
        if (temperaturaAtual < minTemp || temperaturaAtual > maxTemp || maxTemp < minTemp) {
            temperaturaAtual = 50;
            maxTemp = 100;
            minTemp = 0;
            escala = 'C';
        }

        this.temperaturaAtual = temperaturaAtual;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.escala = escala;
    }

    private double conversao(double temp, char escalaInicial, char escalaFinal) {
        if (escalaInicial == escalaFinal) {
            return temp;
        }

        // Converte a temperatura para Celsius
        double tempEmCelsius;
        if (escalaInicial == 'F') {
            tempEmCelsius = (temp - 32) * 5 / 9;
        } else if (escalaInicial == 'K') {
            tempEmCelsius = temp - 273.15;
        } else {
            tempEmCelsius = temp;
        }

        // Converte de Celsius para a escala desejada
        if (escalaFinal == 'F') {
            return tempEmCelsius * 9 / 5 + 32;
        } else if (escalaFinal == 'K') {
            return tempEmCelsius + 273.15;
        } else {
            return tempEmCelsius;
        }
    }

    public String informacoes(char escala) {
        double tempAtual = conversao(this.temperaturaAtual, this.escala, escala);
        double tempMax = conversao(this.maxTemp, this.escala, escala);
        double tempMin = conversao(this.minTemp, this.escala, escala);

        return "Temperatura atual: " + tempAtual + " °C // Temperatura mínima: " + tempMin + " °C // Temperatura máxima: " + tempMax + " °C";
    }

    public double diferenca(Termometro t, char escala) {
        double temp1 = conversao(this.temperaturaAtual, this.escala, escala);
        double temp2 = conversao(t.temperaturaAtual, t.escala, escala);

        return Math.abs(temp1 - temp2);
    }

    @Override
    public String toString() {
        return "Termometro{temperaturaAtual=" + temperaturaAtual + ", maxTemp=" + maxTemp + ", minTemp=" + minTemp + ", escala=" + escala + '}';
    }
}
