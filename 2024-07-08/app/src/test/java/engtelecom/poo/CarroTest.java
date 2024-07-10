package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    public void validarConstrutor(){
        Carro c = new Carro();

        //esperado, obtido
        assertEquals(0,c.getVelocidadeAtual());
    }

    @Test
    public void testarAcelerar(){

        Carro c = new Carro();

        assertEquals(10,c.acelerar(10));
        assertEquals(20,c.acelerar(10));
        assertEquals(20,c.acelerar(-1));
        assertEquals(20,c.acelerar(0));

        c.frear(20);
        assertEquals(120,c.acelerar(130));
        assertEquals(120,c.acelerar(-20));

    }

    @Test
    public void testarFrear(){

        Carro c = new Carro();

        assertEquals(0,c.frear(20));

        c.acelerar(20);

        assertEquals(0,c.frear(30));

        c.acelerar(20);
        assertEquals(10,c.frear(10));
        assertEquals(10,c.frear(0));
        assertEquals(10,c.frear(-10));
    }

}
