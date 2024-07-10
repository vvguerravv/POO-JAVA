package engtelecom.poo;


/**
 * Representa um termômetro, que contém a temperatura em Celsius, Fahrenheit ou Kelvin
 *
 * @author Victor Guerra
 */

public class Termometro {

    /**
     *Temperatura atual do termômetro
     */
    private double temperaturaAtual;

    /**
     * Temperatura máxima do termômetro
     */
    private double maxTemp;

    /**
     * Temperatura mínima do termômetro
     */
    private double minTemp;

    /**
     * Escala do termômetro(Celsius, Fahrenheit ou Kelvin)
     */
    private char escala;

    /**
     * Cria um termômetro com os valores passados. Caso seja passado algum valor inválido, ele irá ser criado com temperatura máxima de 100 °C, mínima de 0 °C, atual de 50 °C e escala °C
     * @param temperaturaAtual
     * @param maxTemp
     * @param minTemp
     * @param escala
     */

    public Termometro(double temperaturaAtual,double maxTemp,double minTemp,char escala){

        if(temperaturaAtual < minTemp || temperaturaAtual > maxTemp || maxTemp < minTemp){
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

    /**
     * Converte a temperatura de uma escala para outra
     * @param temp
     * @param escalaInicial
     * @param escalaFinal
     * @return
     */
    private double conversao(double temp, char escalaInicial, char escalaFinal){



      return temp;
    }

    /**
     * Retorna a temperatura máxima, a mínima e a atual do termômetro em uma determinada escala
     * @param escala
     * @return
     */
    public String informacoes(char escala){
        if(this.escala != escala){

        }
//        return "Temperatura atual: " + valor + "\nTemperatua mínima: " + valor + "\nTemp"
        return "";
    }

    /**
     * Retorna a diferença de temperatua entre dois termômetos em uma determinada escala
     * @param t
     * @param escala
     * @return
     */
    public double diferenca(Termometro t,char escala){
        return 5;
    }

    @Override
    public String toString() {
        return "Termometro{temperaturaAtual=" + temperaturaAtual +", maxTemp=" + maxTemp +", minTemp=" + minTemp +", escala=" + escala +'}';
    }
}
