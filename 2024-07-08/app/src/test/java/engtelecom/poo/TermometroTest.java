package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TermometroTest {

    @Test
    public void testarConstrutor() {
        Termometro t1 = new Termometro(200, 400, -400, 'K');
        assertEquals("Termometro{temperaturaAtual=200.0, maxTemp=400.0, minTemp=-400.0, escala=K}", t1.toString());

        Termometro t2 = new Termometro(101, 100, 0, 'C');
        assertEquals("Termometro{temperaturaAtual=50.0, maxTemp=100.0, minTemp=0.0, escala=C}", t2.toString());

        Termometro t3 = new Termometro(-1, 100, 0, 'C');
        assertEquals("Termometro{temperaturaAtual=50.0, maxTemp=100.0, minTemp=0.0, escala=C}", t3.toString());

        Termometro t4 = new Termometro(-1, 100, 0, 'C');
        assertEquals("Termometro{temperaturaAtual=50.0, maxTemp=100.0, minTemp=0.0, escala=C}", t4.toString());

        Termometro t5 = new Termometro(10, 0, 100, 'C');
        assertEquals("Termometro{temperaturaAtual=50.0, maxTemp=100.0, minTemp=0.0, escala=C}", t5.toString());
    }

    @Test
    public void testarDiferenca() {
        Termometro t = new Termometro(50, 100, 0, 'C');
        Termometro t2 = new Termometro(20, 30, 10, 'F');

        double diferenca = t.diferenca(t2, 'K');
        assertEquals(56.6, diferenca, 0.1);
    }

    @Test
    public void testarRetornaDados() {
        Termometro t = new Termometro(50, 100, 0, 'C');
        String info = t.informacoes('C');

        assertEquals("Temperatura atual: 50.0 °C // Temperatura mínima: 0.0 °C // Temperatura máxima: 100.0 °C", info);
    }
}
